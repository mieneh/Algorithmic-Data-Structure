class Test {

    public static double aUsingRecursion(int n) {
        if (n == 0) {
            return 2;
        }

        return 2 - 0.5 * aUsingRecursion(n - 1);
    }

    public static double bUsingRecursion(int n) {
        if (n < 10) {
            return 1;
        }

        return 1 + bUsingRecursion(n / 10);
    }

    public static double cUsingRecursion(int n, int k) {

        if (k == 1)
            return n;

        return n + cUsingRecursion(n, k - 1);
    }

    public static double dUsingRecursion(int n) {
        if (n <= 1) {
            return n;
        }

        return dUsingRecursion(n - 1) + dUsingRecursion(n - 2);
    }

    public static double aUsingIterator(int n) {
        double total = 2;
        for (int i = 1; i <= n; i++) {
            total = (2 - 0.5 * total);
        }

        return total;
    }

    public static double bUsingIterator(int n) {
        double total = 1;
        while (n >= 10) {
            total = 1 + total;
            n = n / 10;
        }
        return total;
    }

    public static double cUsingIterator(int n, int k) {
        double total = 0;
        for (int i = 1; i <= k; i++) {
            total += n;
        }
        return total;
    }

    public static double dUsingIterator(int n) {
        if (n <= 1) {
            return n;
        }
        double total = 0;
        double first = 0;
        double second = 1;

        for (int i = 2; i <= n; i++) {
            total = first + second;
            first = second;
            second = total;
        }
        return total;
    }

    public static void main(String[] args) {
        int n = 11;
        int k = 2;
        System.out.println("a: (Iterator) \t" + aUsingIterator(n));
        System.out.println("a: (Recursion) \t" + aUsingRecursion(n));

        System.out.println("b: (Iterator) \t" + bUsingIterator(n));
        System.out.println("b: (Recursion) \t" + bUsingIterator(n));

        System.out.println("c: (Iterator) \t" + cUsingIterator(n, k));
        System.out.println("c: (Recursion) \t" + cUsingRecursion(n, k));

        System.out.println("d: (Iterator) \t" + dUsingIterator(n));
        System.out.println("d: (Recursion) \t" + dUsingRecursion(n));

    }
}