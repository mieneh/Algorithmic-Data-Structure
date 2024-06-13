import java.util.Scanner;

public class TestStack {

    public static int isOpen(Character c) {
        if (c == '(') {
            return 1;
        }
        if (c == '[') {
            return 2;
        }
        if (c == '{') {
            return 3;
        }

        return 0;
    }

    public static int isClose(Character c) {
        if (c == ')') {
            return 1;
        }
        if (c == ']') {
            return 2;
        }
        if (c == '}') {
            return 3;
        }

        return 0;
    }

    public static boolean isCheck(String sequenString) {
        MyStack<Character> stack = new MyStack<>();
        for (int i = 0; i < sequenString.length(); i++) {
            // stack.push(sequenString.charAt(i));
            Character c = sequenString.charAt(i);
            if (isOpen(c) != 0) {
                stack.push(c);
            } else if (isClose(c) != 0) {
                if (stack.isEmpty() || (stack.pop()) != isClose(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sequenString = sc.nextLine();
        System.out.println(sequenString + " is balanced " + isCheck(sequenString));
        // while (!stack.isEmpty()) {
        // System.out.print("." + stack.pop());
        // }

        sc.close();
    }
}
