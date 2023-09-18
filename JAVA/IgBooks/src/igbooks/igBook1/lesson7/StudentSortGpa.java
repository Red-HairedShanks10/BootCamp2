package igbooks.igBook1.lesson7;

import java.util.Comparator;

public class StudentSortGpa implements Comparator<Student>{
    public int compare(ComparableStudent s1, ComparableStudent s2){
        if (s1.getGpa() < s2.getGpa()) { return 1; }
        else if (s1.getGpa() > s2.getGpa()) { return -1; }
        else { return 0; } 
    }

    @Override
    public int compare(Student s1, Student s2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}