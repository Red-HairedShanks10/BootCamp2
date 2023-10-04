/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocp_exam_practice.ch1;

/**
 *
 *Testing instance initializers 
 */
public class Bird {
    public static void main(String[] args) {
   //instance initializers cannot exist inside a method 
   //so the following block of code is not an instance initializer
 { System.out.println("Feathers"); }
 }
  
 //this is an instance initializer
 //because it exists outside the method
 { System.out.println("Snowy"); }
}
