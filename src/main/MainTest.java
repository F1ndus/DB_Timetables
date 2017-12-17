package main;

import main.generated.Timetable;
import main.generated.TimetableStop;
import org.fusesource.jansi.Ansi;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import static main.Fahrplan.download24HourTimeTable;
import static org.fusesource.jansi.Ansi.Color.RED;
import static org.fusesource.jansi.Ansi.ansi;

/**
 * Created by Philipp on 16.12.2017.
 */
public class MainTest {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmm");
    public static void main(String[] args) throws JAXBException, IOException, InterruptedException {
        int evaidbs = 8000049;
        int evaidberlin = 8011160;
        int evaidhamburg = 8002549;
        LocalDateTime date = LocalDateTime.now();
        Timetable timetable = download24HourTimeTable(date,evaidbs);
        List<TimetableStop> stopList  = timetable.getS()
                .stream()
                .distinct()
                .filter(entry -> entry.getTl().getC().matches("IC.*"))
                .collect(Collectors.toList());

        stopList.sort((a, b) -> {
            String cmpA = a.getAr() != null? a.getAr().getPt(): a.getDp().getPt();
            String cmpB = b.getAr() != null? b.getAr().getPt(): b.getDp().getPt();
            return LocalDateTime.parse(cmpA,formatter).compareTo(LocalDateTime.parse(cmpB,formatter));
        });


        AtomicReference<LocalDateTime> lastHour = new AtomicReference<>(LocalDateTime.now().minusYears(1000));
        int longestarrivaltrip = getLongestTripToStation(stopList);
        String formatString = ansi().reset().a("           Arr: %11s ~> Dp: %11s %5s %5s Gl. %6s").fgBright(Ansi.Color.BLACK).a(" %"+longestarrivaltrip+"s ").reset().bold().a("Braunschweig ").reset().fgBright(Ansi.Color.BLACK).a("%s").reset().toString();
        stopList.stream().forEach(stop -> {
            LocalDateTime thisHour = stop.getAr() != null?
                    LocalDateTime.parse(stop.getAr().getPt(),formatter):
                    LocalDateTime.parse(stop.getDp().getPt(),formatter);

            if( lastHour.get().getHour() < thisHour.getHour() ||
                    (lastHour.get().getHour() == 23 &&
                    (thisHour.getDayOfWeek() != lastHour.get().getDayOfWeek()))) {
                System.out.println(String.format("%2s:00 Uhr ",thisHour.getHour()));
                lastHour.set(thisHour);
            }

            String name = String.format(formatString,
                    stop.getAr() != null? LocalDateTime.parse(stop.getAr().getPt(),formatter).format(DateTimeFormatter.ofPattern("dd.MM-HH:mm")):"x",
                    stop.getDp() != null?LocalDateTime.parse(stop.getDp().getPt(),formatter).format(DateTimeFormatter.ofPattern("dd.MM-HH:mm")):"x",
                    stop.getTl().getC(),
                    stop.getTl().getN(),
                    stop.getAr() != null? stop.getAr().getPp():stop.getDp() != null? stop.getDp().getPp():"x",
                    stop.getAr() != null? stop.getAr().getPpth():"x",
                    stop.getDp() != null ? stop.getDp().getPpth():"x");
            System.out.println(name);
        });

    }

    private static int getLongestTripToStation(List<TimetableStop> stops) {
        return stops.stream().filter(stop -> Objects.nonNull(stop.getAr()))
                .map(stop -> stop.getAr().getPpth())
                .max(Comparator.comparingInt(String::length)).orElse("").length();
    }

}
