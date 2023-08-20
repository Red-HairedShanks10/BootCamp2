package book4.ch4;

public class GenStack<E> {
    private LinkedList<E> list = new LinkedList<E>();

    public void push(E item){
        list.addFirst(item);
    }

    public E pop(){

    }
}
