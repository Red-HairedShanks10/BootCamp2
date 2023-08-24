package exercise.ch14;

public class ShoppingCart14_1 {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int addResult = calc.add(12, 56);
        System.out.println("Add Result: "+addResult);
        
        // Handle possible ArithmeticException
        try {           
            double divResult = calc.divide(15, 0);
            System.out.println("Division Result: "+divResult);
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }        
    }
}
