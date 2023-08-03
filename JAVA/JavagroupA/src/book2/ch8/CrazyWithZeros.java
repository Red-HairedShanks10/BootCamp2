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
}
