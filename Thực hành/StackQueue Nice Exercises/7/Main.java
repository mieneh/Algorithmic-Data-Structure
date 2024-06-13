// import java.util.Queue;
// test my Stack

public class Main {

    public static boolean isOperator(String s) {

        String[] operators = { "+", "-", "*", "/", "^" };

        for (String steps : operators) {
            if (steps.equals(s)) {
                return true;
            }
        }

        return false;
    }

    public static int precedence(String s) {
        switch (s) {
            case "+":
            case "-":
                return 1;

            case "*":
            case "/":
                return 2;

            case "^":
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {

        StackUsingLinkedList<String> stack = new StackUsingLinkedList<>();

        // String s = "a - b * c ^ d + f";
        // String s = "A * B + C / D";
        String s = "A * ( B + C / D )";

        String[] steps = s.split(" ");
        for (int i = 0; i < steps.length; i++) {
            // Character c = s.charAt(i);

            if (isOperator(steps[i])) {
                // if (stack.isEmpty() || stack.peek().is
                // if (stack.isEmpty()) {
                // stack.push(steps[i]);
                // continue;
                // }

                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(steps[i])) {
                    // System.out.print("-" + stack.pop());
                    System.out.print(stack.pop());
                }

                stack.push(steps[i]);
            } else if (steps[i].equals(")")) {

                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    // System.out.print("-" + stack.pop());
                    System.out.print(stack.pop());
                }
                stack.pop();
                // System.out.println(stack.size());
                // stack.print();
                // System.out.println(stack.pop());
                // System.out.println(stack.pop());
                // while (!stack.peek().equals("(")) {
                // // System.out.println(stack.peek());
                // System.out.print(stack.pop());
                // // System.out.print(1);

                // }
            } else if (steps[i].equals("(")) {
                stack.push(steps[i]);
            } else {
                System.out.print(steps[i]);
                // System.out.print(steps[i] + "-");
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        // System.out.print(isOperator("0"));
    }

}
