public class MyStack<E> extends MyLinkedList<E> implements StackADT<E> {

    // private Node<E> top = null;
    // private int numNode = 0;

    MyStack() {
        super();
    }

    // MyStack(Node<E> node) {
    // top = node;
    // numNode = 1;
    // }

    public void push(E item) {
        this.addLast(item);
    }

    public E pop() {
        return this.removeLast();
    }

    // public void print() {

    // }

    // public boolean isEmpty() {

    // }

    public E peek() {
        return this.getLast();
    }
}