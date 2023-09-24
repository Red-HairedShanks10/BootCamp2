/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ocp_practice.ch1;

import java.util.Random;//specify the Random class/interface

/**
 *
 * @author Marco
 */
public class NumberPicker {

    /**
     * 
     */
    
    public static void main(String[] args) {
    Random r = new Random(); // DOES NOT COMPILE, needs import of random class
    System.out.println(r.nextInt(10));
}
    
}
