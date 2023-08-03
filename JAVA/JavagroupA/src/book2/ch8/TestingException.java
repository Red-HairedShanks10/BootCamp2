package book2.ch8;

public class TestingException {
    public static void main(String[] args) {

        int a = 10,b = 0;

        try
        {
            int c = a / b;
        }
        catch (Exception e)
        {
            System.out.println("error: Oops, you can't "
                    + e);
        }
    }
}
