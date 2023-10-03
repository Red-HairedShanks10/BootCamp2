package ocp_practice.ch9;
import java.util.*;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

         deque.offerFirst(10);
         deque.offerLast(7);
        deque.offerLast(4);
        deque.offerLast(11);
        System.out.println("peak first: " + deque.peekFirst());//get first element
        System.out.println("pollFirst: " + deque.pollFirst());


        System.out.println("peakFirst: " +  deque.peekFirst());
        System.out.println("pollLast: " + deque.pollLast());
        System.out.println("pollFirst: " + deque.pollFirst() );
        System.out.println("peakFirst: " +  deque.peekFirst());




        Deque<Integer> stack = new ArrayDeque<>();
         stack.push(11);
        stack.push(2);
        System.out.println("peak: " + stack.peek());
        System.out.println("poll" +  stack.poll());



        System.out.println("poll2 " +  stack.poll());
        System.out.println("peak2 " + stack.peek());


    }
}
