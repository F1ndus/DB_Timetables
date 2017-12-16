package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Philipp on 16.12.2017.
 */
public class Test  {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmm");
        LocalDateTime.parse("1712171217",formatter).format(DateTimeFormatter.ISO_DATE_TIME);
    }

}
