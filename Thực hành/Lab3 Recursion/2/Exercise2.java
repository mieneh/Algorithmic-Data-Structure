class Exercise2 {

    // Using recursion, define the functions to:

    // (a) Compute factorial of n.
    public static int factorialUsingRecursion(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorialUsingRecursion(n - 1);
    }

    // (b) Compute x^n.
    public static int powUsingRecursion(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * powUsingRecursion(x, n - 1);
    }

    // (c) Count the number of digits of a positive integer number.
    public static int countNumberOfDigitsUsingRecursion(int n) {
        if (n < 10) {
            return 1;
        }

        return 1 + countNumberOfDigitsUsingRecursion(n / 10);
    }

    // (d) Find the Greatest Common Divisor (GCD) of 2 positive integer numbers.
    // (Using Euclid algorithm)
    // GCD(A, B) = GCD(B, A%B)
    // thuat toan dung khi A%B = 0

    public static int gcdUsingRecursion(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcdUsingRecursion(b, a % b);
    }

    public static void main(String[] args) {

        int n = 10, x = 3;
        // int n = 10, x = 2;
        System.out.println(String.format("factorial(%d) with iteration: ", 3) + factorialUsingRecursion(3));
        System.out.println(String.format("pow(%d ^ %d) with iteration: ", x, n) + powUsingRecursion(x, n));
        System.out.println(
                String.format("number of digit %d with iteration: ", x) + countNumberOfDigitsUsingRecursion(x));
        System.out.println(String.format("gcd(%d, %d) with iteration: ", n, x) + gcdUsingRecursion(n, x));

    }
}