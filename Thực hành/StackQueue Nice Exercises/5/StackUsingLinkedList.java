import java.util.*;

public class StackUsingLinkedList<E> implements StackADT<E> {

    private MyLinkedList<E> list = new MyLinkedList<E>();

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    // return last element
    public E peek() throws EmptyStackException {
        return list.getLast();
    }

    // remove and return topmost item on stack
    public E pop() throws EmptyStackException {
        return list.removeLast();
    }

    // insert item onto stack
    public void push(E item) {
        list.addLast(item);
    }
}
