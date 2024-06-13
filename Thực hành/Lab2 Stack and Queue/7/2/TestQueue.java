import java.util.Scanner;

public class TestQueue {

    // s = "123"
    // queu = front -> "321" enQueue resert s
    // compare [123] to [front -> 321]
    public static boolean isPalindrome(String s) {
        MyQueue<Character> queue = new MyQueue<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            Character c = s.charAt(i);
            queue.enQueue(c);
        }

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c != queue.deQueue()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(isPalindrome(s));
        sc.close();
    }
}
