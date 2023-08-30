package book4.ch4;

import java.util.LinkedList;

public class C_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<>();
        String Rico = "Brigadier General Rico";
        officers.add("Lieutenant General Blake");
        officers.add("General Marco");
        officers.add("Captain Tumijin");
        officers.add("Major General Kurama");
        officers.add("Captain McIntyre");
        officers.add(2,"Sergeant Major Tuttle");
        System.out.println("commissioned officers: " + officers );
       String removeOfficer = officers.set(2,"Murdock");//storing the replaced item to this string variable
       officers.add(5,Rico);//removing with a reference of a string value
        System.out.println("commissioned officers(replacement): " + officers );
        //addFirst
        /*officers.addFirst("Lieutenant General Blake");
        officers.addFirst("General Marco");
        officers.addFirst("Captain Tumijin");
        officers.addFirst("Major General Kurama");
        officers.addFirst("Captain McIntyre");*/

        for (String officer : officers){
            System.out.println("this is commissioned officer: " + officer );
        }

      //  System.out.println("commissioned officer(removed): " + removeOfficer );
        officers.remove(2);
        officers.remove();
        System.out.println("commissioned officers(First Removed):" + officers );

        officers.clear();
        System.out.println("commissioned officers:" + officers );
    }
}
