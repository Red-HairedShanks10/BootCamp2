package book4.ch3;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
       ArrayList<Employee> emps = new ArrayList();
       ArrayList<String> nums = new ArrayList<>(2);//setting initial cap to 2
       ArrayList<String> names = new ArrayList();//initial capacity of ArrayList is ten//you can change the capacity later on
        Employee emp1 = new Employee("Red", "Marco");
        Employee emp2 = new Employee("Kenshin", "Himura");
        Employee emp3 = new Employee("Urameshi", "Yusuke");

        //adding nums strings
        nums.add("One");
        nums.add("Two");
        nums.add("Three");//modifies capacity of Arraylist automatically
        //nums.add(10,"Ten");//index needs to exist before adding an element to it...
        //adding workers:
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp2);
       // System.out.println("current employees: " + workers);
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

       /* for (int i = 0; i < nums.size(); i++){
            System.out.println("this number is: " + nums.get(i));
        } */

        ///using enhanced for loop
       /* for(Object n : names ){
            System.out.println("name of person is: " + n);
        }*/

        //for numbers
       /* for(Object n : nums ){//using an index of an element
            int i = nums.indexOf(n);
            System.out.println("number is: " + n + " at index: " + i);
        }*/

        //using the Iterator interface and its methods for accessing arraylists
        /* String s;
        Iterator e_names = names.iterator();
        while(e_names.hasNext()){
            s = (String)e_names.next();
            System.out.println(s);
        }*/
        //Iterator with nums
        /*String n;
        Iterator iNums = nums.iterator();
        while(iNums.hasNext()) {//using while to iterate through nums collection//if theres at least an element remaining...
          n = (String) iNums.next();//...then get next element
            System.out.println("nums retrieved by iterator: " + n);
        }*/

        //updating values/elements
       /* names.set(0, "ludo");
        names.set(2, "Drako");
        System.out.println("new names: " + names);*/

      /*  ArrayList<String> newItems = new ArrayList<>();
        newItems.add(0,"Uno");
        newItems.add(1, "Dos");
        newItems.add(2,"Tres");
        for (int i = 0; i < newItems.size(); i++){
            nums.set(i, newItems.get(i));
        }
        System.out.println("este numero es: " + nums);*/


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