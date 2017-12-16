package main;

import main.generated.Timetable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 * Created by Philipp on 16.12.2017.
 */
public class Fahrplan {
    private static final String URL = "https://api.deutschebahn.com/timetables/v1/plan/EVAID/DATE/HOUR";

    public static Timetable downloadTimeTable(LocalDateTime date, int evaID) throws JAXBException, IOException {
        String parsedDate = genDateString(date.toLocalDate());

        java.net.URL url = new URL(URL
                .replace("EVAID",String.valueOf(evaID))
                .replace("DATE",date.toLocalDate().format(DateTimeFormatter.BASIC_ISO_DATE).substring(2))
                .replace("HOUR",String.format("%02d",date.getHour()))
        );

        System.out.println("Request: " +  url);

        InputStream str = new FileInputStream("token.properties");
        Properties prop = new Properties();
        prop.load(str);


        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept","application/xml");
        con.setRequestProperty("Authorization","Bearer " + prop.getProperty("token"));

        try(InputStream dbxmlresp = con.getInputStream()) {
            JAXBContext jaxbContext = JAXBContext.newInstance(Timetable.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (Timetable) jaxbUnmarshaller.unmarshal(dbxmlresp);
        } catch (Exception e) {
            e.getMessage();
            throw e;
        }
    }

    public static Timetable download24HourTimeTable(LocalDateTime date, int evaID) throws JAXBException, IOException, InterruptedException {
        int counter = 24;
        Timetable merged = new Timetable();
        merged.setEva(String.valueOf(evaID));
        merged.setStation("Braunschweig");
        LocalDateTime tempdate = date;
        while(counter > 0) {
            try {
                tempdate = tempdate.plusHours(1);
                Timetable temptimetable = downloadTimeTable(tempdate, evaID);
                merged.getS().addAll(temptimetable.getS());
                counter--;
            } catch (FileNotFoundException e) {
                System.out.println("Max length reached: " + tempdate.getHour());
                break;
            }
        }
        return merged;
    }

    private static String genDateString(LocalDate date) {
        return date.format(DateTimeFormatter.BASIC_ISO_DATE).substring(2);
    }

}
