package book4.ch5;
import java.util.*;
public class GenQueue<E> {
    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E item){
        list.addLast(item);
    }

    public E dequeue(){
        return list.poll();
    }

}
