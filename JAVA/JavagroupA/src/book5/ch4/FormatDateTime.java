package book5.ch4;
import java.util.*;
import java.time.*;
import java.time.format.*;
public class FormatDateTime {
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        printDate(now, "YYYY-MM-dd");
        printDate(now, "MM-dd-YYYY");
        printDate(now, "dd MMM YYYY");
        printDate(now, "MMMM d, YYYY");
        printDate(now, "HH:mm");
        printDate(now, "h:mm a");
    }
}
