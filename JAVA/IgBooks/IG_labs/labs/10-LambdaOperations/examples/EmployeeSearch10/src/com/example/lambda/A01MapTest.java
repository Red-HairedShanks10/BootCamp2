package com.example.lambda;
//ch10...1
import com.example.lambda.extra_Lambda_examples.Bonus;
import com.example.lambda.extra_Lambda_examples.Employee;
import com.example.lambda.extra_Lambda_examples.Role;
import java.util.List;

/**
 *Using map within a stream to perform operations 
 * ..on data stored in collections
 * 
 */
public class A01MapTest {
    
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();
                            
        System.out.println("\n== CO Bonuses ==");
        //the 1st filter limits collection data to the Role value of Executive
        //the 2nd filter further limits collection data to the State value of "CO"
        //then we use map multiply the salary by bonus for a specific Role
        //use the foreach to print bonus paid
        eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .filter(e -> e.getState().equals("CO"))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( s -> System.out.printf("Bonus paid: $%,6.2f %n", s));
        
      
        //do the same thing for the Eng Manager Bonus
        System.out.println("\n== Eng Manager Bonus ==");
        eList.stream()
            .filter(e -> e.getRole().equals(Role.MANAGER))
            .filter(e -> e.getDept().equals("Eng"))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( 
                s -> System.out.printf("Bonus paid: $%,6.2f %n", s)
            );

    }
    
}