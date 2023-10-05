package ocp_exam_practice.ch9;
import java.util.*;

class A {}
class B extends A {}
class C extends B {}


public class CombinedGenerics {

    public static void main(String[] args) {
        List<?> list1 = new ArrayList<A>();
         List<? extends A> list2 = new ArrayList<A>();
         List<? super A> list3 = new ArrayList<A>();
    }
}
