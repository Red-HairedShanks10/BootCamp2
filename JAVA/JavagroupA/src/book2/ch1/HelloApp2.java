package book2.ch1;

import book2.ch2.HelloApp; //import this HelloApp

//creating instance of the Greeter class in HelloAPP
public class HelloApp2 {
    public static void main(String[] args) {

       /* Greeter gObject = new Greeter();
        gObject.sayHello(); */

       /*System.out.println(HelloApp.helloMessage);//will be null becoz of the initial declaration in HelloApp
       HelloApp.main(args);//the helloMessage string will display a value bcoz main is where assign value to the string */

        //**Using an instance from a different package
        HelloApp instanceVarBTwo = new HelloApp();
        System.out.println(instanceVarBTwo.iHelloMessage);//will return null becoz of initial declaration....
        //*can we assign a value to this instance var?
        instanceVarBTwo.iHelloMessage = "Hello message from HelloApp2";
        System.out.println(instanceVarBTwo.iHelloMessage);





    }


}