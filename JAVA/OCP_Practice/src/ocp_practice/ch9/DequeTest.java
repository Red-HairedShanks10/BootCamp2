package ocp_practice.ch9;
import java.util.*;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        13: deque.offerFirst(10); // true 10
        14: deque.offerLast(4); // true 10 4
        15: deque.peekFirst(); // 10 10 4
        16: deque.pollFirst();

         deque.pollLast(); // 4
         deque.pollFirst(); // null
         deque.peekFirst();
    }
}
