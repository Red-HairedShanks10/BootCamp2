
package exercise.ch10;


public class TestClass {
    public static void main (String args[]){
        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("with if statement, x: " + x);
        
        // Using a ternary operator for same logic.
        x = ((y / x) < 3) ? (x += y) : (x *= y);
        System.out.println("with ternary op, x: " + x);
    }
}
