/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbooks.igBook1.lesson7;

/**
 *
 * @author Marco
 */
public class Student implements Comparable{

    private String name;
    private Long id;
    private Double gpa = 0.0;
    
    public Student(String name, Long id, Double gpa){
    
        this.name = name;
        this.id = id;
    }
    
    
    
    
    
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
