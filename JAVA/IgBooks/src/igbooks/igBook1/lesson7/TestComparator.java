package igbooks.igBook1.lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>(3);
        Comparator<Student> sortName = new StudentSortName();
        Comparator<Student> sortGpa = new StudentSortGpa();
        
        studentList.add(new Student("Ton Djembe", 1000L, 3.9));
        studentList.add(new Student("Ishe Bongo", 2003L, 3.7));
        studentList.add(new Student("Amara Conga", 3001L, 3.8));
        
        Collections.sort(studentList, sortName);       
        for(Student student:studentList){
            System.out.println(student);
        }
        
        Collections.sort(studentList, sortGpa);       
        for(Student student:studentList){
            System.out.println(student);
        }
    }
}
