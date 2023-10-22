package com.example;
//Created custom Exceptions by creating custom Exception Classes

public class CustomExceptionExample {
    

    public static void main(String[] args) {

        //try-catch 1
        try {
             //execute code
            CustomExceptionExample.checkPassWord("pass");
            System.out.println("no errors");//this line is skipped if theres an error

        } catch (InvalidPasswordException e) {
            //use the custom Exception to display password error 
            e.printStackTrace();

        }

        //try-catch 2
        try {
             //passing a null value
            CustomExceptionExample.checkPassWord(null);
            System.out.println("no errors");

        } catch (InvalidPasswordException e) {

            //will print out the NullPointerException
            //printStactTrace helps track where the exception happened
            e.printStackTrace();

        }
        
        
        //try-catch 3
       /* try {
             
            CustomExceptionExample.checkPassWord("HelloWorld");
             System.out.println("no errors");
        } catch (InvalidPasswordException e) {

            e.printStackTrace();

        } */

    }

    //password checker method throws the custom exception
    //methods that throw Exceptions demand a try-catch block when called
    public static void checkPassWord(String pass) throws InvalidPasswordException {

        int minPassLength = 5;

        try {

            if (pass.length() < minPassLength) {
                //thow a new custom exception instance with message
                throw new InvalidPasswordException("The password provided is too short");
            }else{
                    System.out.println("Nice long password");
            }

        } catch (NullPointerException e) {
            //throw new custom exception in case of Null 
            //then display message and NullPointer exception instance as the cause
            throw new InvalidPasswordException("No password provided", e);

        }
    }
}


//Custom Exception Class
class InvalidPasswordException extends Exception {

    InvalidPasswordException() {
    }

    InvalidPasswordException(String message) {

        super(message);
    }

    InvalidPasswordException(String message, Throwable cause) {

        super(message, cause);
    }
}
