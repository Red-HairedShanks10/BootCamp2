/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbooks.igBook1.lesson7;

import java.util.*;


/*Using Set interface, which only has unique elements*
 *
 * 
 */
public class SetExample {
    public static void main(String[] args){
    Set<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("C");//item value is not unique//wont be added
        
        for (String item : set) {
            System.out.println("Item is: " + item);
        }
    }
}
