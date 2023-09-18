package igbooks.igBook1.lesson7;

import java.util.*;

public class TestComparator {
    public static void main(String[] args){
        
        List<Student> studentList = new ArrayList<>(3);
        Comparator<Student> sortName = new StudentSortName();
        Comparator<Student> sortGpa = new StudentSortGpa();
        
        studentList.add(new Student("Ton Djembe", 1000L, 3.9));
        studentList.add(new Student("Ishe Bongo", 2003L, 3.7));
        studentList.add(new Student("Amara Conga", 3001L, 3.8));
        
        Collections.sort(studentList, sortName);
         System.out.println("Student sort names(asc): ");
        for(Student student:studentList){
            System.out.println(student);
        } System.out.println("\\\\\\\\\\\\\\\\");
        
        Collections.sort(studentList, sortGpa); 
        System.out.println("Student sort gpa(desc): ");
        for(Student student:studentList){
            System.out.println(student);
        }
    }
}
