/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_practice1;

/**
 *
 * @author Marco
 */
public class SwitchTest {

  
    public static void main(String[] args) {
        String color = "Blue";
        String shirt = " shirt";
        
        switch(color){
            case "Blue":
                shirt = "Blue" + shirt;
                break;
                
            case "Red": 
                 shirt = "Blue" + shirt;
                break;
                
            default: shirt = "White" + shirt;
                }
                    System.out.println("Shirt type: " + shirt);
        
    }
    
}
