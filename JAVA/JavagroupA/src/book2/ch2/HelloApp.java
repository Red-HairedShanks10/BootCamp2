package book2.ch2;

public class HelloApp {

    public static String helloMessage;//declaring a class variable of string type
  public int num1; //can you declare class variables without 'static' and get away with it?//answr: num1 bcomes an instance variable
  public String iHelloMessage;//instance variable

    public static void main(String[] args)
    {
        //declaring multiple variables in one statement
      //   int x,y,z;

      /*   using the class variable   within the main method
        *assigning it a value */

       /* helloMessage = "Hello World! From book2.ch2 ";
        System.out.println(helloMessage); */

      /*  HelloApp numberInstance = new HelloApp();// to use num1 instance variable
        numberInstance.num1 = 45; */

        System.out.println("Variables used IN Main:");
        //****using instance variable
        HelloApp instanceVarMessage = new HelloApp();//first create an instance
        instanceVarMessage.iHelloMessage = "Hello World im an instance Variable From HelloApp";//use instance to access non-stat var
        System.out.println(instanceVarMessage.iHelloMessage);

        //**Using Class variable without making an instance...
        helloMessage = "Hello I am a Class Variable From HelloApp ";
        System.out.println(helloMessage);





    }
}

//line comment (ctrl+/)
//block comment(ctrl + shift + /)
