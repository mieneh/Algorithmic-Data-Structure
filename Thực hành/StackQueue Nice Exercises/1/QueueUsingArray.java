
public class QueueUsingArray<E> implements QueueAdt<E> {
    private final int MAX_ELEMENT = 100;
    private E[] list = (E[]) new Object[MAX_ELEMENT];
    private int num_nodes = 0;

    public int size() {
        return num_nodes;
    }

    public boolean isEmpty() {
        return num_nodes == 0;
    }

    // return first element
    public E peek() {
        if (isEmpty()) {

            throw new ArrayIndexOutOfBoundsException();
        }
        return list[0];
    }

    // remove and return first element
    public E poll() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        // move all element after front element
        E firstElement = list[0];
        for (int i = 0; i < num_nodes - 1; i++) {
            list[i] = list[i + 1];
        }
        num_nodes--;
        return firstElement;
    }

    public boolean offer(E item) {
        if (num_nodes == MAX_ELEMENT) {
            // throw new ArrayIndexOutOfBoundsException();
            return false;
        }

        list[num_nodes] = item;
        num_nodes++;
        return true;
    }

}
