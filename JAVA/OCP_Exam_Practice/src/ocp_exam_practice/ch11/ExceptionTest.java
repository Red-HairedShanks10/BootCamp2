package ocp_exam_practice.ch11;

import java.io.IOException;

public class ExceptionTest {
   static void fall(int distance){

       try {
           if (distance > 10) {
               throw new IOException();
           }else {
               System.out.println("fall successful");
           }
       }catch (Exception e){
          // e.printStackTrace();

           System.out.println("fall error: " + e);
       }
    }

   static void fall2(int distance) throws IOException {
        if(distance > 10) {
            throw new IOException();
        }
    }

    void fall(String input) {
        System.out.println(input.toLowerCase());
    }

    public static void main(String[] args) {
        fall(9);

        //fall(null);

        try{
            fall2(23);
        }catch (IOException e){
            System.out.println("fall 2 error: " + e);
        }
    }
}
