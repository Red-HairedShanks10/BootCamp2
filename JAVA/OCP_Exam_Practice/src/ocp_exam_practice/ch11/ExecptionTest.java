package ocp_exam_practice.ch11;

import java.io.IOException;

public class ExecptionTest {
   static void fall(int distance) throws IOException {
        if(distance > 10) {
            throw new IOException();
        }
    }

    public static void main(String[] args) {

    }
}
