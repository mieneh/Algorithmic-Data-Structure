class exercise4 {

    // +(2i + 1)
    public static int computeA(int n) {
        if (n == 1) {
            return 3;
        }

        return (2 * n + 1) + computeA(n - 1);
    }

    public static int factorialUsingRecursion(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorialUsingRecursion(n - 1);
    }

    // +(i!)
    public static int computeB(int n) {
        if (n == 1) {
            return 1;
        }

        return factorialUsingRecursion(n) + computeB(n - 1);
    }

    // *(i!)
    public static int computeC(int n) {
        if (n == 1) {
            return 1;
        }

        return factorialUsingRecursion(n) * computeC(n - 1);
    }

    // n >= r > 0
    // n(n-1)(n-2)...(n-r+1)
    // otherwise 1
    public static int computeD(int n, int r) {
        if (r > n) {
            return 1;
        }

        if (r == 1) {
            return n;
        }

        return (n - r + 1) * computeD(n, r - 1);
    }

    // 2^n + n^2 + P(n - 1)
    public static double computeE(int n) {
        if (n == 1) {
            return 3;
        }

        return Math.pow(2, n) + Math.pow(n, 2) + computeE(n - 1);
    }

    public static void main(String[] args) {
        int n = 3, r = 2;
        // int n = 5, r = 3;

        System.out.println("n = " + n);
        System.out.println("r = " + r);
        System.out.println("a: " + computeA(n));
        System.out.println("b: " + computeB(n));
        System.out.println("c: " + computeC(n));
        System.out.println("d: " + computeD(n, r));
        System.out.println("e: " + computeE(n));
    }
}