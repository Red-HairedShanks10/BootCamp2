package book5.ch4;

import java.util.*;
import java.time.*;

public class TimeTester {
    public static void main(String[] args){
        System.out.println("LocalTime: " + LocalTime.now().toString());
        System.out.println("LocalDateTime: " + LocalDateTime.now().toString());
        System.out.println("ZonedDateTime: " + ZonedDateTime.now().toString());
        System.out.println("OffsetTime: " + OffsetTime.now().toString());
        System.out.println("OffsetDateTime: " + OffsetDateTime.now().toString());

    }
}
