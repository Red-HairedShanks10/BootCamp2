package ocp_exam_practice.ch11;

public class MultiCatchTest {
    public static void main(String[] args) {

        try {
            System.out.println(Integer.parseInt(args[1]));
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e);
            System.out.println("Missing or invalid input");
        }
        /*catch (NumberFormatException e){
            System.out.println(e);
            System.out.println("Missing or invalid input");
        }*/
    }
}