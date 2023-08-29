package book4.ch3;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
       ArrayList<Employee> workers = new ArrayList();
       ArrayList<String> nums = new ArrayList<>(2);
       ArrayList<String> names = new ArrayList();//initial capacity of ArrayList is ten//you can change the capacity later on
        Employee emp1 = new Employee("Red", "Marco");
        Employee emp2 = new Employee("Jules", "Jones");

        //adding workers:
        workers.add(emp1);
        workers.add(emp2);
        System.out.println("current employees: " + workers);
       // names.add("Marco");
        names.add("Muzi");
        names.add("Tumi");
        names.add("Zico");
        names.add(3, emp1.toString());
       // names.add(230);//cant add unspecified type in this String List
        names.add(2, "Kamo");//specifying the position of this element value
      //  System.out.println("current names: " + names);
    ///using regular loop//to process names arrayList
     /*   for (int i = 0; i < names.size(); i++){
            System.out.println("this person is: " + names.get(i));
        }*/

        ///using enhanced for loop
       /* for(Object n : names ){
            System.out.println("name of person is: " + n);
        }*/

        //using the Iterator interface and its methods for accessing arraylists
        /*String s;
        Iterator e_names = names.iterator();
        while(e_names.hasNext()){
            s = (String)e_names.next();
            System.out.println(s);
        }*/

        //updating values/elements
       /* names.set(0, "ludo");
        names.set(2, "Drako");
        System.out.println("new names: " + names);*/


    }
}


class Employee {

    String lastName, firstName;
    public Employee(String lastName, String firstName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return this.lastName + " " + firstName;
    }

}