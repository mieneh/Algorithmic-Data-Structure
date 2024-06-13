import java.util.*;

public interface StackADT<E> {
    // check whether stack is empty
    public boolean isEmpty();

    // retrieve topmost item on stack
    public E peek() throws EmptyStackException;

    // remove and return topmost item on stack
    public E pop();

    // insert item onto stack
    public void push(E item) throws EmptyStackException;
}
