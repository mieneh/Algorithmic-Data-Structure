// import java.util.Queue;
// test my Stack

public class Main {
    public static void main(String[] args) {

        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<Integer>();

        stack.push(10);

        stack.push(12);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());

    }

}
