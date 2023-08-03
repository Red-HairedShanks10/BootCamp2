package book2.ch8;

public class DividebyZero {
    public static void main(String[] args) {

        try{
            int a = 10, b = 0;
            System.out.println(a/b);
        }catch(ArithmeticException ex){
            System.out.println("error: " + ex.getMessage());

        }


    }


}
