// import java.util.Queue;
// test my Stack

public class Main {

    public static boolean isPrime(int amount) {
        if (amount < 2) {
            return false;
        }

        for (int i = 2; i < Math.round(Math.sqrt(amount)); i++) {
            if (amount % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<Integer>();

        stack.push(10);
        stack.push(12);
        stack.push(3);
        stack.push(5);
        stack.push(11);

        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (isPrime(top)) {
                System.out.println(top);
            }
        }
    }

}
