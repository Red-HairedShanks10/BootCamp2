package book2.ch2;

public class HelloApp {

    public static String helloMessage;//declaring a class variable of string type
    int num1; //can you declare class variables without 'static' and get away with it?
    public static void main(String[] args)
    {
        //declaring multiple variables in one statement
        // int x,y,z;

      /*   using the class variable   within the main method
        *assigning it a value */
        helloMessage = "Hello World! From book2.ch2 ";
        System.out.println(helloMessage);


    }
}

//line comment (ctrl+/)
//block comment(ctrl + shift + /)
