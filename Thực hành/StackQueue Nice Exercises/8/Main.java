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

    public static String compute(double second, double first, String opeator) {
        switch (opeator) {
            case "+":
                return String.valueOf(first + second);
            case "-":
                return String.valueOf(first - second);
            case "*":
                return String.valueOf(first * second);
            case "/":
                return String.valueOf(first / second);
            case "^":
                return String.valueOf(Math.pow(first, second));

            default:
                return "";
        }

    }

    public static void main(String[] args) {

        StackUsingLinkedList<String> stack = new StackUsingLinkedList<>();

        String s = "1 2 ^ 2 3 ^ 10 / + 1 +";
        // String s = "1 2 + 3 1 + * 1 1 + 1 + /";

        String[] steps = s.split(" ");
        for (int i = 0; i < steps.length; i++) {
            // Character c = s.charAt(i);

            if (isOperator(steps[i])) {
                double first = Double.valueOf(stack.pop());
                double second = Double.valueOf(stack.pop());

                stack.push(compute(first, second, steps[i]));
                // System.out.println(compute(first, second, steps[i]));
            } else {
                stack.push(steps[i]);
            }
        }

        // System.out.println(stack.size());
        System.out.println(stack.pop());
    }

}
