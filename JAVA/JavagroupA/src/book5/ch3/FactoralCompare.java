package book5.ch3;

public class FactorialCompare {

    public static void main(String[] args) {

     long nonRecFactorial =  factorial_nRecursive(4);
     System.out.println("factorial");
    }





    //method using a for loop to calculate factoral
    private static long factorial_nRecursive(int n)
    {
        long f = 1;
        for (int i = 1; i <=n; i++)
            f = f * i;
        return f;
    }
}
