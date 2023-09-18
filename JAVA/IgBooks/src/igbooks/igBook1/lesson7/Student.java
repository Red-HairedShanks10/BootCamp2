/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbooks.igBook1.lesson7;

/**
 *
 * @author Marco
 */
public class Student implements Comparable<Student>{

    private String name;
    private Long id;
    private Double gpa = 0.0;
    
    public Student(String name, Long id, Double gpa){
    
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    
    
    
    
    
    @Override
    public int compareTo(Student s) {
       int result = this.gpa.compareTo(s.getGpa());//you can sort by id or name...
       
       if(result > 0 ){
           return 1;
       }
       else if(result < 0){
           return -1;
       }else{
           return 0;
       }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return this.name + " " + this.gpa; 
    }

    
}
