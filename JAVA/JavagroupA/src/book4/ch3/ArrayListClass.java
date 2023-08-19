package book4.ch3;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Marco");
        names.add("Muzi");
        names.add("Tumi");
        names.add("Zico");
        names.add(2, "Kamo");
        System.out.println(names);
    }
}
