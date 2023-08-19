package book4.ch3;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Marco");
        names.add("Muzi");
        names.add("Tumi");
        names.add("Zico");
        names.add(2, "Kamo");//specifying the position of this element value
        System.out.println(names);
    ///using regular loop//to process names arrayList
     /*   for (int i = 0; i < names.size(); i++){
            System.out.println("this person is: " + names.get(i));
        }*/

        ///using enhanced for loop
        for(Object n : names ){
            System.out.println("name of person is: " + n);
        }

        String s;
        Iterator e = nums.iterator();

    }
}
