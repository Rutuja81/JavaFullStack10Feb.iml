package java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class LocalDateDemo {
    public static void main(String[] args) {
//        Date date=new Date();
//        System.out.println(date);
//        System.out.println(System.currentTimeMillis());
//
//        Date date1=new Date(System.currentTimeMillis());
//        System.out.println(date1);

//        LocalDate localDate=LocalDate.now();
//        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
//        System.out.println(localDate.format(formatter));
//        System.out.println(localDate.getDayOfMonth());
//        System.out.println(localDate.getDayOfYear());
//        System.out.println(localDate.getEra());
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.minusDays(3));
//        System.out.println(localDate.plusDays(3));
//        System.out.println(localDate.plusMonths(2));

        LocalTime localTime=LocalTime.now();
        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("hh-mm a",Locale.ENGLISH);
        System.out.println(localTime.format(formatter1));
    }
}
