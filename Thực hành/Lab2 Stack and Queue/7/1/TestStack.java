import java.util.Scanner;

public class TestStack {

    // s = "123"
    // stack = "123" <- top
    // compare [123] to [top -> 321]
    public static boolean isPalindrome(String s) {
        MyStack<Character> stack = new MyStack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            stack.push(c);
        }

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c != stack.pop()) {
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
