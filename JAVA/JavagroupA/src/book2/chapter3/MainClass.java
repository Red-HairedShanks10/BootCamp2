package book2.chapter3;

import java.text.NumberFormat;

/*Using this class to work on miscellaneous code*/
public class MainClass {
    public static void main(String[] args) {


        /*Unary plus and minus operators*/
        int a = 5; // a is 5
        int b = -a; // b is -5
        int c = -b; // c is +5

        //unary plus doesn't do anything here...
        int a2 = -5; // a is -5
        int b2 = +a2; // b is -5
        a2 = 5; // a is now 5
        int c2 = +a2; // c is 5

        //unary operators with complex expressions
        int a3 = 3, b3 = 4, c3 = 5;
        int d = a3 * -(b3 + c3); // d is -27
      /***************/

       double salesTax = 2.425;
        NumberFormat cf = NumberFormat.getCurrencyInstance();


    }
}
