package main;

import main.generated.Timetable;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicReference;

import static main.Fahrplan.download24HourTimeTable;

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
        Timetable timetable = download24HourTimeTable(date,evaidhamburg);
        timetable.getS().sort((a, b) -> {
            String cmpA = a.getAr() != null? a.getAr().getPt(): a.getDp().getPt();
            String cmpB = b.getAr() != null? b.getAr().getPt(): b.getDp().getPt();
            return LocalDateTime.parse(cmpA,formatter).compareTo(LocalDateTime.parse(cmpB,formatter));
        });


        AtomicReference<LocalDateTime> lastHour = new AtomicReference<>(LocalDateTime.now().minusYears(1000));
        timetable.getS().stream().forEach(stop -> {
            LocalDateTime thisHour = stop.getAr() != null?
                    LocalDateTime.parse(stop.getAr().getPt(),formatter):
                    LocalDateTime.parse(stop.getDp().getPt(),formatter);

            if( lastHour.get().getHour() < thisHour.getHour() ||
                    (lastHour.get().getHour() == 23 &&
                    (thisHour.getDayOfWeek() != lastHour.get().getDayOfWeek()))) {
                System.out.println(String.format("%2s:00 Uhr ",thisHour.getHour()));
                lastHour.set(thisHour);
            }

            String name = String.format("           Ankunft: %11s   Abfahrt: %11s %5s %5s Gl. %6s %s",
                    stop.getAr() != null? LocalDateTime.parse(stop.getAr().getPt(),formatter).format(DateTimeFormatter.ofPattern("dd.MM HH:mm")):"x",
                    stop.getDp() != null?LocalDateTime.parse(stop.getDp().getPt(),formatter).format(DateTimeFormatter.ofPattern("dd.MM HH:mm")):"x",
                    stop.getTl().getC(),
                    stop.getTl().getN(),
                    stop.getAr() != null? stop.getAr().getPp():stop.getDp() != null? stop.getDp().getPp():"x",
                    stop.getDp() != null ? stop.getDp().getPpth():"x");
            System.out.println(name);
        });

    }

}
