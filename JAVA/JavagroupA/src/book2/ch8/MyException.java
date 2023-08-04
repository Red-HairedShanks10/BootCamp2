package book2.ch8;

public class MyException {


    public static void main(String[] args)
    {
        try
        {
            doSomething(true);//call doSomething()
        }
        catch (Exception error) {//catch thrown error and display message
            System.out.println(error);
        }
    }
    public static void doSomething(boolean t) throws Exception {//throws an exception if boolean is true...
        String name = "N";
        if (name.length() < 2) {
            throw new Exception("name to short");
        }
    }
}
