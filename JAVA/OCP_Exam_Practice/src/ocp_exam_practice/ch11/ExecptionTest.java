package ocp_exam_practice.ch11;

import java.io.IOException;

public class ExecptionTest {
   static void fall(int distance) throws IOException {

       try {
           if (distance > 10) {
               throw new IOException();
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    public static void main(String[] args) {
        fall(20);
    }
}
