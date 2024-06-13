import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {

        MyStack<Character> stack = new MyStack<>();

        Scanner sc = new Scanner(System.in);

        String sequenString = sc.nextLine();

        for (int i = 0; i < sequenString.length(); i++) {
            stack.push(sequenString.charAt(i));
        }

        while (!stack.isEmpty()) {
            System.out.print("." + stack.pop());
        }

        sc.close();
    }
}
