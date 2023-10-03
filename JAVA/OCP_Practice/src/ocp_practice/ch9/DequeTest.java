package ocp_practice.ch9;
import java.util.*;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

         deque.offerFirst(10);
         deque.offerLast(7);
        deque.offerLast(4);
        deque.offerLast(11);
        System.out.println("peak first: " + deque.peekFirst());
        System.out.println("pollFirst: " + deque.pollFirst());


        System.out.println("peakFirst: " +  deque.peekFirst());
        System.out.println("pollLast: " + deque.pollLast());
        System.out.println("pollFirst: " + deque.pollFirst() );
        System.out.println("peakFirst: " +  deque.peekFirst());




        Deque<Integer> stack = new ArrayDeque<>();
         stack.push(11);
        stack.push(2);
         stack.peek();
        stack.poll();

         stack.poll();
        stack.peek();
    }
}
