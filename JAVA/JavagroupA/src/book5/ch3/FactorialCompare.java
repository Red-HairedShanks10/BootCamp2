package book5.ch3;

public class FactorialCompare {

    public static void main(String[] args) {
      int n = 5;
     long nonRecFactorial =  factorial_nRecursive(n);
     System.out.println("(Non-Recursive)factorial of " + n + " is " + nonRecFactorial);


        int r = 7;
        long recursiveFactorial =  factorialRecursive(r);
        System.out.println("(Recursive)factorial of " + r + " is " + recursiveFactorial);

    }




    //non-recursive solution
    //method using a for loop to calculate factorial
    private static long factorial_nRecursive(int n)
    {
        long f = 1;
        for (int i = 1; i <=n; i++)
            f = f * i;
        return f;
    }

    //recursive solution
    //using recursion to calculate factorial
    private static long factorialRecursive(int n)
    {
        if (n == 1)
            return 1;
        else
            return n * factorialRecursive(n-1);//the method calls itself
    }


}
