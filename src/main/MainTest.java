package main;

import main.generated.Timetable;
import main.generated.TimetableStop;
import org.fusesource.jansi.Ansi;

import javax.xml.bind.JAXBException;
import java.awt.*;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static main.Fahrplan.download24HourTimeTable;
import static main.Fahrplan.getTimeTableChanges;
import static org.fusesource.jansi.Ansi.Color.RED;
import static org.fusesource.jansi.Ansi.ansi;

/**
 * Created by Philipp on 16.12.2017.
 */
public class MainTest {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmm");

    public static Map<Integer, String> strings;

    static {
        strings = new HashMap<>();
        strings.put(2, "Polizeiliche Ermittlung");
        strings.put(3, "Feuerwehreinsatz neben der Strecke");
        strings.put(5, "Ärztliche Versorgung eines Fahrgastes");
        strings.put(6, "Betätigen der Notbremse");
        strings.put(7, "Personen im Gleis");
        strings.put(8, "Notarzteinsatz am Gleis");
        strings.put(9, "Streikauswirkungen");
        strings.put(10, "Ausgebrochene Tiere im Gleis");
        strings.put(11, "Unwetter");
        strings.put(13, "Pass- und Zollkontrolle");
        strings.put(15, "Beeinträchtigung durch Vandalismus");
        strings.put(16, "Entschärfung einer Fliegerbombe");
        strings.put(17, "Beschädigung einer Brücke");
        strings.put(18, "Umgestürzter Baum im Gleis");
        strings.put(19, "Unfall an einem Bahnübergang");
        strings.put(20, "Tiere im Gleis");
        strings.put(21, "Warten auf weitere Reisende");
        strings.put(22, "Witterungsbedingte Störung");
        strings.put(23, "Feuerwehreinsatz auf Bahngelände");
        strings.put(24, "Verspätung aus dem Ausland");
        strings.put(25, "Warten auf verspätete Zugteile");
        strings.put(28, "Gegenstände im Gleis");
        strings.put(31, "Bauarbeiten");
        strings.put(32, "Verzögerung beim Ein-/Ausstieg");
        strings.put(33, "Oberleitungsstörung");
        strings.put(34, "Signalstörung");
        strings.put(35, "Streckensperrung");
        strings.put(36, "Technische Störung am Zug");
        strings.put(38, "Technische Störung an der Strecke");
        strings.put(39, "Anhängen von zusätzlichen Wagen");
        strings.put(40, "Stellwerksstörung/-ausfall");
        strings.put(41, "Störung an einem Bahnübergang");
        strings.put(42, "Außerplanmäßige Geschwindigkeitsbeschränkung");
        strings.put(43, "Verspätung eines vorausfahrenden Zuges");
        strings.put(44, "Warten auf einen entgegenkommenden Zug");
        strings.put(45, "Überholung durch anderen Zug");
        strings.put(46, "Warten auf freie Einfahrt");
        strings.put(47, "Verspätete Bereitstellung");
        strings.put(48, "Verspätung aus vorheriger Fahrt");
        strings.put(55, "Technische Störung an einem anderen Zug");
        strings.put(56, "Warten auf Fahrgäste aus einem Bus");
        strings.put(57, "Zusätzlicher Halt");
        strings.put(58, "Umleitung");
        strings.put(59, "Schnee und Eis");
        strings.put(60, "Reduzierte Geschwindigkeit wegen Sturm");
        strings.put(61, "Türstörung");
        strings.put(62, "Behobene technische Störung am Zug");
        strings.put(63, "Technische Untersuchung am Zug");
        strings.put(64, "Weichenstörung");
        strings.put(65, "Erdrutsch");
        strings.put(70, "Kein WLAN");
        strings.put(71, "WLAN in einzelnen Wagen nicht verfügbar");
        strings.put(73, "Mehrzweckabteil vorne");
        strings.put(74, "Mehrzweckabteil hinten");
        strings.put(75, "1. Klasse vorne");
        strings.put(76, "1. Klasse hinten");
        strings.put(77, "Ohne 1. Klasse");
        strings.put(79, "Ohne Mehrzweckabteil");
        strings.put(80, "Abweichende Wagenreihung");
        strings.put(82, "Mehrere Wagen fehlen");
        strings.put(83, "Fehlender Zugteil");
        strings.put(84, "Zug verkehrt richtig gereiht");
        strings.put(85, "Ein Wagen fehlt");
        strings.put(86, "Keine Reservierungsanzeige");
        strings.put(87, "Einzelne Wagen ohne Reservierungsanzeige");
        strings.put(88, "Keine Qualitätsmängel");
        strings.put(89, "Reservierungen sind wieder vorhanden");
        strings.put(90, "Kein Bordrestaurant/Bordbistro");
        strings.put(91, "Eingeschränkte Fahrradmitnahme");
        strings.put(92, "Klimaanlage in einzelnen Wagen ausgefallen");
        strings.put(93, "Fehlende oder gestörte behindertengerechte Einrichtung");
        strings.put(94, "Ersatzbewirtschaftung");
        strings.put(95, "Ohne behindertengerechtes WC");
        strings.put(96, "Der Zug ist stark überbesetzt");
        strings.put(97, "Der Zug ist überbesetzt");
        strings.put(98, "Sonstige Qualitätsmängel");
        strings.put(99, "Verzögerungen im Betriebsablauf");
        strings.put(900, "Anschlussbus wartet(?)");
    }

    public static void main(String[] args) throws JAXBException, IOException, InterruptedException {
        int evaidbs = 8000049;
        int evaidberlin = 8011160;
        int evaidhamburg = 8002549;
        int frankfurthbf = 8000105;
        int leipzig = 8010205;
        LocalDateTime date = LocalDateTime.now().minusHours(1);

        Timetable delays = getTimeTableChanges(evaidbs);

        Timetable timetable = download24HourTimeTable(date, evaidbs);
        List<TimetableStop> stopList = timetable.getS()
                .stream()
                //.filter(entry -> entry.getTl().getC().matches("IC.*"))
                .collect(Collectors.toList());

        timetable.getS().stream().forEach((timetableStop -> {
            Optional<TimetableStop> d = delays.getS().stream().filter((x) -> x.getId().equals(timetableStop.getId())).findFirst();
            if (d.isPresent()) {
                TimetableStop newStop = d.get();
                try {
                    LocalDateTime old = LocalDateTime.parse(timetableStop.getAr().getPt(), formatter);
                    LocalDateTime newd = LocalDateTime.parse(newStop.getAr().getCt(), formatter);
                    long time = old.until(newd, ChronoUnit.MINUTES);
                    timetableStop.getAr().setCt(String.valueOf(time));
                    System.out.println(time + " Min");
                } catch (NullPointerException e) {
                    if (timetableStop.getAr() != null)
                        timetableStop.getAr().setCt(String.valueOf(0));
                }

                try {
                    LocalDateTime old = LocalDateTime.parse(timetableStop.getDp().getPt(), formatter);
                    LocalDateTime newd = LocalDateTime.parse(newStop.getDp().getCt(), formatter);
                    long time = old.until(newd, ChronoUnit.MINUTES);
                    timetableStop.getDp().setCt(String.valueOf(time));
                    System.out.println(time + " Min");
                } catch (NullPointerException e) {
                    if (timetableStop.getDp() != null)
                        timetableStop.getDp().setCt(String.valueOf(0));
                }

                try {
                    //List<String> literal = newStop.getAr().getM().stream().distinct().map((msg) -> strings.get(msg.getC())).collect(Collectors.toList());
                    newStop.getAr().getM().stream().forEach(m -> timetableStop.getAr().getM().add(m));

                } catch (NullPointerException e) {

                }

                try {
                    newStop.getDp().getM().stream().forEach(m -> timetableStop.getDp().getM().add(m));
                } catch (NullPointerException e) {

                }

            }
        }));

        stopList.sort((a, b) -> {
            String cmpA = a.getAr() != null ? a.getAr().getPt() : a.getDp().getPt();
            String cmpB = b.getAr() != null ? b.getAr().getPt() : b.getDp().getPt();
            return LocalDateTime.parse(cmpA, formatter).compareTo(LocalDateTime.parse(cmpB, formatter));
        });


        AtomicReference<LocalDateTime> lastHour = new AtomicReference<>(LocalDateTime.now().minusHours(1));
        int longestarrivaltrip = getLongestTripToStation(stopList);
        int longestInfotext = getLongestInfoText(stopList);
        String formatString = ansi().reset().a("           Arr: %11s %s%3s%s ~> Dp: %11s %s%3s%s %5s %5s Gl. %6s %"+longestInfotext+"s").fgBright(Ansi.Color.BLACK).a(" %" + longestarrivaltrip + "s ").reset().bold().a("Braunschweig ").reset().fgBright(Ansi.Color.BLACK).a("%s").reset().toString();
        stopList.stream().forEach(stop -> {
            LocalDateTime thisHour = stop.getAr() != null ?
                    LocalDateTime.parse(stop.getAr().getPt(), formatter) :
                    LocalDateTime.parse(stop.getDp().getPt(), formatter);

            if (lastHour.get().getHour() < thisHour.getHour() ||
                    (lastHour.get().getHour() == 23 &&
                            (thisHour.getDayOfWeek() != lastHour.get().getDayOfWeek()))) {
                System.out.println(String.format("%2s:00 Uhr ", thisHour.getHour()));
                lastHour.set(thisHour);
            }

            String name = String.format(formatString,
                    stop.getAr() != null ? LocalDateTime.parse(stop.getAr().getPt(), formatter).format(DateTimeFormatter.ofPattern("dd.MM-HH:mm")) : "x",
                    (stop.getAr() != null && stop.getAr().getCt() != null) ? Integer.valueOf(stop.getAr().getCt()) > 0 ? ansi().reset().fgBrightRed() : ansi().reset().fgBrightGreen() : ansi().reset().fgBrightDefault(),
                    (stop.getAr() != null && stop.getAr().getCt() != null) ? "+" + stop.getAr().getCt() : "",
                    ansi().reset(),
                    stop.getDp() != null ? LocalDateTime.parse(stop.getDp().getPt(), formatter).format(DateTimeFormatter.ofPattern("dd.MM-HH:mm")) : "x",
                    (stop.getDp() != null && stop.getDp().getCt() != null) ? Integer.valueOf(stop.getDp().getCt()) > 0 ? ansi().reset().fgBrightRed() : ansi().reset().fgBrightGreen() : ansi().reset().fgBrightDefault(),
                    (stop.getDp() != null && stop.getDp().getCt() != null) ? "+" + stop.getDp().getCt() : "",
                    ansi().reset(),
                    stop.getTl().getC(),
                    stop.getTl().getN(),
                    stop.getAr() != null ? stop.getAr().getPp() : stop.getDp() != null ? stop.getDp().getPp() : "",
                    stop.getAr() != null ? stop.getAr().getM().stream().distinct().map((msg) -> strings.get(msg.getC())).distinct().collect(Collectors.joining(" +++ ")):"",
                    stop.getAr() != null ? stop.getAr().getPpth() : "",
                    stop.getDp() != null ? stop.getDp().getPpth() : "");
            System.out.println(name);
        });

        System.out.println(String.format("\n\n%s Fahrten", stopList.size()));
    }

    private static int getLongestInfoText(List<TimetableStop> stops) {
         return stops.stream().filter(stop -> Objects.nonNull(stop.getAr()))
                .map(stop -> stop.getAr().getM().stream().map(c -> strings.get(c.getC())).distinct().collect(Collectors.joining(" +++ ")))
                .max(Comparator.comparingInt(String::length))
                .get()
                .length();
    }

    private static int getLongestTripToStation(List<TimetableStop> stops) {
        return stops.stream().filter(stop -> Objects.nonNull(stop.getAr()))
                .map(stop -> stop.getAr().getPpth())
                .max(Comparator.comparingInt(String::length)).orElse("").length();
    }

}
