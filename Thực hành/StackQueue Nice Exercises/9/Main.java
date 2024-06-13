// import java.util.Queue;
// test my Stack

public class Main {

    public static void main(String[] args) {
        StackUsingLinkedList<String> stack = new StackUsingLinkedList<>();
        QueueUsingLinkedList<String> queue = new QueueUsingLinkedList<>();

        String s = "123456789";

        String[] steps = s.split("");
        // System.out.println(steps.length);

        System.out.println("9A.---");

        for (int i = 0; i < steps.length; i++) {
            stack.push(steps[i]);

        }

        while (!stack.isEmpty()) {
            String top = stack.pop();
            System.out.print(top);

            // 9b
            queue.offer(top);
        }
        System.out.println();

        System.out.println("9B.---");
        // System.out.println(queue.size());
        while (!queue.isEmpty()) {
            String front = queue.poll();
            System.out.print(front);
        }
    }

}
