package book2.ch8;

public class MyException {


    public static void main(String[] args)
    {
        try
        {
            doSomething(true);
        }
        catch (Exception error) {
            System.out.println(error);
        }
    }
    public static void doSomething(boolean t) throws Exception {
        String name = "N";
        if (name.length() < 2) {
            throw new Exception();
        }
    }
}
