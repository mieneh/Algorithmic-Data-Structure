// import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<Integer>();

        queue.offer(10);

        queue.offer(12);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());

    }

}
