package book2.ch8;

public class CrazyWithZeros {

    public static void main(String[] args)
    {
        try
        {
            int answer = divideTheseNumbers(5, 0);
        }
        catch (Exception e)
        {
            System.out.println("Tried twice, "
                    + "still didn't work!");
        }
    }


    public static int divideTheseNumbers(int a, int b) →16
            throws Exception
    {
        int c;
        try
        {
            c = a / b; →22
            System.out.println("It worked!"); →23
        }





}
