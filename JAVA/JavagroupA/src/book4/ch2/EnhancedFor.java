package book4.ch2;

public class EnhancedFor {
    public static void main(String[] args) {

        String[] daysOfWeek = getDaysOfWeek();
        for (String d: days){
            System.out.println(d);
        }
    }
    public static String[] getDaysOfWeek(){
        String[] days = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday"};
        return days;
    }

}
