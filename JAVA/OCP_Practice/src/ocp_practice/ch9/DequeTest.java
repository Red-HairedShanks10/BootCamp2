package ocp_practice.ch9;
import java.util.*;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
         deque.offerFirst(10);
         deque.offerLast(4);
         deque.peekFirst(); 
         deque.pollFirst();

         deque.pollLast();
         deque.pollFirst();
         deque.peekFirst();
    }
}
