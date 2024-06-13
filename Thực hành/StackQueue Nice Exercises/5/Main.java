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

        StackUsingLinkedList<Character> stack = new StackUsingLinkedList<>();

        String s = "EAS*Y**QUE***ST***I*ON";
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (c == '*') {
                System.out.print(stack.pop());
            } else {
                stack.push(c);
            }

        }
        // System.out.print(stack.pop());
    }

}
