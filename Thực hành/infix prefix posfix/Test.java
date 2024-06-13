
import java.util.Stack;

class Test {


    public static boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
            return true;
        }

        return false;
    }

    public static double compute(char c, double x, double y) {
        if(c == '+') {
            return y + x;
        }
        if(c == '-') {
            return y - x;
        }
        if(c == '*') {
            return y * x;
        }
        if(c == '/') {
            return y / x;
        }
        if(c == '^') {
            return Math.pow(y, x);
        }

        return 0;
    }   
    // hau to
    public static double computePosfix(String exp) {
        Stack<Double> stack = new Stack<>();
        for(int i = 0; i < exp.length(); i++) {
            // System.out.println(exp.charAt(i));
            char c = exp.charAt(i);
            if (isOperator(c)) {
                double first = stack.pop();
                double second = stack.pop();
                double total = compute(c, first, second);
                System.out.println("total " + total);
                System.out.println(c + " " + first + " " + second);
                stack.push(total);
            } else {
                System.out.println("push " + (Double.valueOf(c) - 48));
                stack.push(Double.valueOf(c) - 48);
            }
        }

        return stack.pop();
    }

    pulic static boolean compare(char first, char second) {
        int f, s;

        if (first == '+' || first == '-') {
            f = 1;
        }

        if (first == '*' || first == '/') {
            f = 2;
        }

        if (first == '^') {
            f = 3;
        }

        if (second == '+' || second == '-') {
            s = 1;
        }

        if (second == '*' || second == '/') {
            s = 2;
        }

        if (second == '^') {
            s = 3;
        }

        return f > s;
    }

    public static double infix2posfix(String exp) {
        Stack<Double> stack = new Stack<>();
        String s = "";
        for(int i = 0; i < exp.length(); i++) {
            // System.out.println(exp.charAt(i));
            char c = exp.charAt(i);
            if (isOperator(c)) {
                if(compare(c, stack.peek()))
            } else {
                s += c;
            }
        }


        return s;
    }



    public static void main(String[] args) {
        // String exp = "245/53-5^4^*+";
        // String exp = "245/53-5^*+";
        // double sum = computePosfix(exp);
        // System.out.println(exp);
        // System.out.println("sum " + sum);

        String exp = "2+4/5*(5-3)^5^4";
    }
}