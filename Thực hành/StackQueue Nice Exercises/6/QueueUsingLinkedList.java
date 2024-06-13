// import java.util.LinkedList;

public class QueueUsingLinkedList<E> implements QueueADT<E> {
    private MyLinkedList<E> list = new MyLinkedList<E>();
    // private int num_nodes = 0;

    public int size() {
        // return num_nodes;
        return list.size();
    }

    public boolean isEmpty() {
        // return num_nodes == 0;
        return list.isEmpty();
    }

    // return first element
    public E peek() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return list.getFirst();
    }

    // remove and return first element
    public E poll() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return list.removeFirst();
    }

    public boolean offer(E item) {
        // if (num_nodes == MAX_ELEMENT) {
        // // throw new ArrayIndexOutOfBoundsException();
        // return false;
        // }

        list.addAfter(item);
        return true;
    }

    public void print() {
        // ListNode<E> current = list.getHead();
        System.out.print("front -> ");
        // while (current.getNext() != null) {
        // System.out.print(current.getElement() + " -> ");
        // current = current.getNext();
        // }
        list.print();
        System.out.println("back");
    }

}
