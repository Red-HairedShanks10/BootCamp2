package book4.ch3;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Marco");
        names.add("Muzi");
        names.add("Tumi");
        names.add("Zico");
        names.add(2, "Kamo");//specifying the position of this element value
        System.out.println(names);
    ///using regular loop
        for (int i = 0; i < names.size(); i++){
            System.out.println("this person is: " + names.get(i));
        }

        ///using enhanced for loop
        for(Object n : names ){

        }

    }
}
