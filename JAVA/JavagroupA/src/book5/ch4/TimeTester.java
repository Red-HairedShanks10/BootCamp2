package book5.ch4;

import java.util.*;
import java.time.*;

public class TimeTester {//using now() with different Date-Time classes
    public static void main(String[] args){
        System.out.println("LocalTime: " + LocalTime.now().toString());
        System.out.println("LocalDateTime: " + LocalDateTime.now().toString());
        System.out.println("ZonedDateTime: " + ZonedDateTime.now().toString());
        System.out.println("OffsetTime: " + OffsetTime.now().toString());
        System.out.println("OffsetDateTime: " + OffsetDateTime.now().toString());
        System.out.println("MonthDay: " + MonthDay.now().toString());
        System.out.println("YearMonth: " + YearMonth.now().toString());
        System.out.println("Instant: " + Instant.now().toString());
    }
}
