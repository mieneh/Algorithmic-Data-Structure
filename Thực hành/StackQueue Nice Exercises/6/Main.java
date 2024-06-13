import java.util.*;

public class Main {
    public static void main(String[] args) {

        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<Integer>();

        String requed = "enq(5), enq(3), deq(), enq(2), enq(8), deq(), enq(9), enq(1), deq(), enq(7), enq(6), deq(), deq(), enq(4), deq(), deq()";

        String[] steps = requed.split(", ");
        System.out.println(steps.length);

        for (int i = 0; i < steps.length; i++) {
            if (steps[i].indexOf("enq", 0) != -1) {
                int num = Integer.valueOf(steps[i].substring(steps[i].indexOf('(') + 1, steps[i].indexOf(')')));

                queue.offer(num);
            } else {
                queue.poll();
            }

            // System.out.print(steps[i].substring(0, 3) + ": ");
            System.out.print(steps[i] + ": ");
            queue.print();
        }

        // System.out.println(Arrays.toString());

        // queue.offer(10);

        // queue.offer(12);

        // System.out.println(queue.peek());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.size());

    }

}
