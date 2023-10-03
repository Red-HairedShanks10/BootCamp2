package ocp_practice.ch9;
import java.util.*;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
         deque.offerFirst(10);
         deque.offerLast(7);
         deque.peekFirst();
         deque.pollFirst();

         deque.pollLast();
         deque.pollFirst();
         deque.peekFirst();

        Deque<Integer> stack = new ArrayDeque<>();
         stack.push(10); 
        stack.push(4); 4 10
         stack.peek(); // 4 4 10
        stack.poll(); // 4
    }
}
