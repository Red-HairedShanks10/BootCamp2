/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocp_practice.ch1;

/**
 *Understanding members of a class
 *
 */
public class Animal {
        
    String name;// create a class variable
 
 // get method to return the string vallue name   
 public String getName() {
 return name;//return the values store in name from the setName()
 }
 //set method to set the value of the name
 public void setName(String newName) {//string parameter of a newName
 name = newName;//then assign the paramter value to the name variable
 }
}
