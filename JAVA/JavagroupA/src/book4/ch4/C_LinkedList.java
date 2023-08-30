package book4.ch4;

import java.util.LinkedList;

public class C_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<>();

        officers.add("Lieutenant General Blake");
        officers.add("General Marco");
        officers.add("Captain Tumijin");
        officers.add("Major General Kurama");
        officers.add("Captain McIntyre");
        officers.add(2,"Sergeant Major Tuttle");

        //addFirst
        /*officers.addFirst("Lieutenant General Blake");
        officers.addFirst("General Marco");
        officers.addFirst("Captain Tumijin");
        officers.addFirst("Major General Kurama");
        officers.addFirst("Captain McIntyre");*/

        for (String officer : officers){
            System.out.println("this is commissioned officer: " + officer );
        }
    }
}
