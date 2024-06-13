import java.util.Scanner;

public class TestDoubleStack {
    public static void main(String[] args) {

        MyDoubleStack<Character> queue = new MyDoubleStack<>();

        Scanner sc = new Scanner(System.in);

        String sequenString = sc.nextLine();

        for (int i = 0; i < sequenString.length(); i++) {
            queue.enQueue(sequenString.charAt(i));
        }

        while (!queue.isEmpty()) {
            System.out.print("." + queue.deQueue());
        }

        sc.close();
    }
}
