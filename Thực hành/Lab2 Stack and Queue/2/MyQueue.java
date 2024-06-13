public class MyQueue<E> extends MyLinkedList<E> implements QueueADT<E> {

    // private Node<E> top = null;
    // private int numNode = 0;

    MyQueue() {
        super();
    }

    // MyStack(Node<E> node) {
    // top = node;
    // numNode = 1;
    // }

    public void enQueue(E item) {
        this.addLast(item);
    }

    public E deQueue() {
        return this.removeFirst();
    }

    // public void print() {

    // }

    // public boolean isEmpty() {

    // }

    public E front() {
        return this.getFirst();
    }
}