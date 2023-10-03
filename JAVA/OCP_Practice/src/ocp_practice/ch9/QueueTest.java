package ocp_practice.ch9;
import java.util.*;
public class QueueTest {
    public static void main(String[] args) {
         Queue<Integer> queue = new LinkedList<>();
         queue.add(10);
         queue.add(4);

         System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
