/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ocp_exam_practice.ch2;

/**
 *
 * @author Marco
 */
public class OperatorsOrderTest {

    /**
     *testing the order of operations with different operators
     */
    public static void main(String[] arg) {
      int cookies = 4;
       double reward = 3 + 2 * --cookies;//operation starts from right to left--decrement then multiply
       
      // double reward = 3 + 2 * cookies--;//starts with the multiplication but some how ignores the decrementation
        System.out.println("Zoo animal receives: "+reward+" reward points");
    }
    
}
