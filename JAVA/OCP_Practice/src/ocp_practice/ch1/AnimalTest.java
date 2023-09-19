/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ocp_practice.ch1;

import static ocp_practice.ch1.Animal.*;

/**
  * Testing out Fields and methods of the Animal class
  */
public class AnimalTest {

    
    public static void main(String[] args) {
        Animal snake = new Animal();
        snake.setName("Mamba");//set name of Animal object
        
        //species is static variable//we can acces it without instatiation
        //getName returns the value from setName()
        species = snake.getName();//species stores the returned value
        
        System.out.println("Species is: " + species);
        
    }
    
}
