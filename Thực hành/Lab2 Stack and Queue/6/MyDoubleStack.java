import java.util.Queue;

public class MyDoubleStack<E> implements QueueADT<E> {

    private MyStack<E> stack1 = new MyStack<>();
    private MyStack<E> stack2 = new MyStack<>();

    public void enQueue(E item) {
        stack1.push(item);
    }

    public E deQueue() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        E front = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return front;
    }

    public int size() {
        return stack1.size();
    }

    public boolean contains(E item) {
        return stack1.contains(item);
    }

    public void print() {

    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public E front() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        E front = stack2.peek();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return front;
    }
}
