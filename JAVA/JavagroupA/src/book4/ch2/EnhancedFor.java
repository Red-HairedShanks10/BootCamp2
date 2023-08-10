package book4.ch2;

public class EnhancedFor {
    public static void main(String[] args) {

        String[] daysOfWeek = getDaysOfWeek();
        for (String d: daysOfWeek){
            System.out.println(d);
        }
    }
    public static String[] getDaysOfWeek(){
        String[] days = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday"};
        return days;
    }

    public static void printStringArray(String[] array){
            
    }

}
