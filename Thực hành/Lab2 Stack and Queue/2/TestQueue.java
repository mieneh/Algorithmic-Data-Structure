public class TestQueue {
    public static void main(String[] args) {

        MyQueue<Fraction> queue = new MyQueue<>();

        System.out.println("stack is empty? " + queue.isEmpty());

        queue.enQueue(new Fraction(1, 2));
        queue.enQueue(new Fraction(3, 2));
        queue.print();

        // System.out.println(stacgetLastk.print());
        // System.out.println(stack.getLast());

        System.out.println("front of queue is " + queue.front());
        queue.enQueue(new Fraction(9, 2));
        // queue.print();
        System.out.println("front of queue is " + queue.deQueue());
        queue.enQueue(new Fraction(3, 2));
        // queue.print();
        queue.deQueue();
        queue.deQueue();
        System.out.println("front of queue is " + queue.front());

        queue.print();
    }
}
