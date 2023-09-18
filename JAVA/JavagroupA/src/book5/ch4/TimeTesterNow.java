package book5.ch4;

import java.time.*;

public class TimeTesterNow {//using now() with different Date-Time classes
    public static void main(String[] args){
        //prints Local date and time without time-zone
        System.out.println("LocalTime: " + LocalTime.now().toString());
        System.out.println("LocalDateTime: " + LocalDateTime.now().toString());
        //
        System.out.println("ZonedDateTime: " + ZonedDateTime.now().toString());//returns date and time with timezone
       //returns date and time with the UTC offset value
        System.out.println("OffsetTime: " + OffsetTime.now().toString());
        System.out.println("OffsetDateTime: " + OffsetDateTime.now().toString());


        System.out.println("MonthDay: " + MonthDay.now().toString());//returns month and day without year value
        System.out.println("YearMonth: " + YearMonth.now().toString());
        System.out.println("Instant: " + Instant.now().toString());
    }
}
