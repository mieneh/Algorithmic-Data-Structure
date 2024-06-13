public class Test {

    public static double byRecursive(int n) {
        if (n == 1) {
            return 3;
        } else {
            return Math.pow(2, n) + Math.pow(n, 2) + byRecursive(n - 1);
        }
    }

    public static double byStack(int n) {
        MyStack<Double> stack = new MyStack<>();
        while (n > 0) {
            stack.push(Math.pow(2, n) + Math.pow(n, 2));

            n--;
        }
        double result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(byRecursive(3));
        System.out.println(byStack(3));

    }
}
