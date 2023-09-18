/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbooks.igBook1.lesson7;
import java.util.*;

/**
 *
 * @author Marco
 */
public class TestComparable {
    public static void main(String[] args) {
        
        Set<ComparableStudent> studentList = new TreeSet<>();
        
        
        studentList.add(new ComparableStudent("Ton Djembe", 1000L, 3.9));
        studentList.add(new ComparableStudent("Ishe Bongo", 2003L, 3.7));
        studentList.add(new ComparableStudent("Amara Conga", 3001L, 3.8));
        
        for(ComparableStudent student : studentList){
            System.out.println("student: " + student);
        }
    }
}
