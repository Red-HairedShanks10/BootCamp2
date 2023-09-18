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
        
        Set<Student> studentList = new TreeSet<>();
        
        
        studentList.add(new Student("Ton Djembe", 1000L, 3.9));
        studentList.add(new Student("Ishe Bongo", 2003L, 3.7));
        studentList.add(new Student("Amara Conga", 3001L, 3.9));
        
        for(Student student : studentList){
            System.out.println("student: " + student);
        }
    }
}
