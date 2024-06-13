import java.util.Stack;

class StackEx1 {
    public static void main(String[] args) {
        String s = "9 2 - 6 * 7 + 7 /";
        System.out.println(CalculatePostfix(s));
    }

    public static String CalculatePostfix(String s) {
        Stack<String> stack = new Stack<>();
        String[] str = s.split(" ");
        for (String c: str) {
            if (isNumber(c)) {
                stack.push(c);
            } else if (!stack.isEmpty() && isOperator(c)) {
                double b = Double.parseDouble(stack.pop()); 
                double a = Double.parseDouble(stack.pop());
                stack.push(Double.toString(calculate(a, b, c)));
            }
        }
        return !stack.isEmpty() ? stack.pop() : "No result";
    }

    public static boolean isOperator(String c) {
        switch(c) {
            case "+": return true;
            case "-": return true;
            case "*": return true;
            case "/": return true;
            default: return false;
        }
    }

    public static double calculate(double a, double b, String operator) {
        double result = 0;
        switch(operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a*1.0 / b;
                break;
        }
        return result;
    }

    public static boolean isNumber(String str) {
        return str.matches("0|([1-9][0-9]*)");
    }   

    
}