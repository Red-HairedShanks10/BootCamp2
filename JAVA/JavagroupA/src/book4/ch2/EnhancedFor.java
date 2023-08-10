package book4.ch2;

public class EnhancedFor {
    public static void main(String[] args) {

        String[] daysOfWeek = getDaysOfWeek();
         printStringArray(daysOfWeek);
    }
    public static String[] getDaysOfWeek(){
        String[] days = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday"};
        return days;
    }

    public static void printStringArray(String[] array){
            for(String stringArray: array){
                System.out.println(stringArray);
            }
    }

}
