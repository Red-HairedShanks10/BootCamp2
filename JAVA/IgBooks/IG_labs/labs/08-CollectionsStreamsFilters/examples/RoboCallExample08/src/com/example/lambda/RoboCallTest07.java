package com.example.lambda;
//ch8...3

import java.util.List;
import java.util.function.Predicate;

/**
 *Using Stream() to perform different operations on collections
 * 
 */
public class RoboCallTest07 {
  
  public static void main(String[] args){ 

      //colection of people
    List<Person> pl = Person.createShortList();
    RoboCall05 robo = new RoboCall05();    
    
    System.out.println("\n=== Calling all Drivers Lambda ===");
   //starting stream operations
   //filter takes in a Predicate as parameter
   //..and uses that param to filter collection elements that
   //...match the Predicate criteria
    pl.stream()
        .filter(p -> p.getAge() >= 23 && p.getAge() <= 65)
        .forEach(p -> robo.roboCall(p));//return the results 
    
  }
}
