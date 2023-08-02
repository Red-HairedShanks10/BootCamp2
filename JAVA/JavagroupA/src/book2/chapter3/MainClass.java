package book2.chapter3;
/*Using this class to work on miscellaneous code*/
public class MainClass {
    public static void main(String[] args) {


        /*Unary plus and minus operators*/
        int a = 5; // a is 5
        int b = -a; // b is -5
        int c = -b; // c is +5

        //unary plus doesnt do anything here...
        int a2 = -5; // a is -5
        int b2 = +a2; // b is -5
        a2 = 5; // a is now 5
        int c2 = +a2; // c is 5

        //unary operators with complex expressions
        int a = 3, b = 4, c = 5;
        int d = a * -(b + c); // d is -27
      /***************/
    }
}
