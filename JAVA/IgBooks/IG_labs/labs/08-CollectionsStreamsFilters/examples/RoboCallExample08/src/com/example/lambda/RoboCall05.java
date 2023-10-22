package com.example.lambda;
//ch8...2
import java.util.List;
import java.util.function.Predicate;

/**
 *RoboCall class with different methods that can be used
 * for stream and filter operations 
 * 
 */
public class RoboCall05 {
    
  public void phoneContacts(List<Person> pl, Predicate<Person> pred){
    for(Person p:pl){
      if (pred.test(p)){
        roboCall(p);
      }
    }
  }

  public void emailContacts(List<Person> pl, Predicate<Person> pred){
    for(Person p:pl){
      if (pred.test(p)){
        roboEmail(p);
      }
    }
  }

  public void mailContacts(List<Person> pl, Predicate<Person> pred){
    for(Person p:pl){
      if (pred.test(p)){
        roboMail(p);
      }
    }
  }  
  
  //takes in Person Object
  //print out the person's details
  public void roboCall(Person p){
    System.out.println("Calling " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getPhone());
  }
  
  public void roboEmail(Person p){
    System.out.println("EMailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getEmail());
  }
  
  public void roboMail(Person p){
    System.out.println("Mailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getAddress() + ", " + p.getCity() + ", " + p.getState() + " " + p.getCode());
  }

}
