// import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        QueueUsingArray<Integer> queue = new QueueUsingArray<Integer>();

        queue.offer(10);

        queue.offer(12);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());

    }

}
