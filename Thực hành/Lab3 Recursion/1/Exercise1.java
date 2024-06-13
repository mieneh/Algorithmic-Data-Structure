class Exercise1 {

    // Using iteration, define the functions to:

    // (a) Compute factorial of n.
    public static int factorialUsingIteration(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    // (b) Compute x^n.
    public static int powUsingIteration(int x, int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= x;
        }
        return total;
    }

    // (c) Count the number of digits of a positive integer number.
    public static int countNumberOfDigitsUsingIteration(int n) {
        int copyN = n;
        int numberDigit = 0;
        while (copyN > 0) {
            numberDigit++;
            copyN /= 10;
        }
        return numberDigit;
    }

    // (d) Check an positive integer number is prime or not.
    public static boolean isPrimeUsingIteration(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < Math.floor(Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // (e) Find the Greatest Common Divisor (GCD) of 2 positive integer numbers.
    // (Using Euclid algorithm)
    // GCD(A, B) = GCD(B, A%B)
    // thuat toan dung khi A%B = 0

    public static int gcdUsingIteration(int a, int b) {
        while (b != 0) {
            int copyA = a;
            a = b;
            b = copyA % b;
        }

        return a;
    }

    public static void main(String[] args) {

        int n = 10, x = 3;
        // int n = 10, x = 2;
        System.out.println(String.format("factorial(%d) with iteration: ", 3) + factorialUsingIteration(3));
        System.out.println(String.format("pow(%d ^ %d) with iteration: ", x, n) + powUsingIteration(x, n));
        System.out.println(
                String.format("number of digit %d with iteration: ", x) + countNumberOfDigitsUsingIteration(x));
        System.out.println(String.format("%d is prime with iteration: ", x) + isPrimeUsingIteration(x));
        System.out.println(String.format("gcd(%d, %d) with iteration: ", n, x) + gcdUsingIteration(n, x));

    }
}