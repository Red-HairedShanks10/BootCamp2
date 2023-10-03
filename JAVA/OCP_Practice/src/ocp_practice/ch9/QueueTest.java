package ocp_practice.ch9;
import java.util.*;
public class QueueTest {
    public static void main(String[] args) {
         Queue<Integer> queue = new LinkedList<>();
         queue.add(10);
         queue.offer(4);

        System.out.println("peek : " + queue.peek());
         System.out.println("remove" + queue.remove());
        System.out.println("peek2 : " + queue.peek());

    }
}
