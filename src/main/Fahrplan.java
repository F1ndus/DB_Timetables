package main;

import main.generated.HistoricDelay;
import main.generated.Timetable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

/**
 * Created by Philipp on 16.12.2017.
 */
public class Fahrplan {

    static Properties prop;
    static {
        InputStream str = null;
        try {
            str = new FileInputStream("token.properties");
            prop = new Properties();
            prop.load(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final String URL = "https://api.deutschebahn.com/timetables/v1/plan/EVAID/DATE/HOUR";

    public static Timetable downloadTimeTable(LocalDateTime date, int evaID) throws JAXBException, IOException {
        String parsedDate = genDateString(date.toLocalDate());

        java.net.URL url = new URL(URL
                .replace("EVAID",String.valueOf(evaID))
                .replace("DATE",date.toLocalDate().format(DateTimeFormatter.BASIC_ISO_DATE).substring(2))
                .replace("HOUR",String.format("%02d",date.getHour()))
        );

        System.out.println("Request: " +  url);


        try(InputStream dbxmlresp = downloadXml(url)) {
            return unmarshal(dbxmlresp,Timetable.class);
        } catch (Exception e) {
            e.getMessage();
            throw e;
        }
    }

    public static Timetable getTimeTableChanges(int eva) throws IOException, JAXBException {
        java.net.URL url = new URL("https://api.deutschebahn.com/timetables/v1/fchg/" + eva);
        return unmarshal(downloadXml(url), Timetable.class);
    }



    private static InputStream downloadXml(URL url) throws IOException {
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept","application/xml");
        con.setRequestProperty("Authorization","Bearer " + prop.getProperty("token"));

        return con.getInputStream();
    }

    private static <T> T unmarshal(InputStream stream, Class<T> clazz) throws JAXBException, IOException {
        try(InputStream dbxmlresp = stream) {
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Object k = jaxbUnmarshaller.unmarshal(dbxmlresp);
            return (T) k;
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
            } catch (IOException e) {
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
