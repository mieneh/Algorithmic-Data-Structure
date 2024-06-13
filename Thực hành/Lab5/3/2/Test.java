
class Test {
    // using iterator
    public static double aUsingIterator(int n) {
        double total = 0;
        for (int i = 1; i <= n; i++) {
            total += Math.pow(2, i);
        }
        return total;
    }

    public static double bUsingIterator(int n) {
        double total = 0;
        for (int i = 0; i <= n; i++) {
            total += (i + 1) / 2;
        }
        return total;
    }

    public static double cUsingIterator(int n) {
        double total = 0;
        for (int i = 1; i <= n; i++) {
            total += eUsingIterator(i) / (eUsingIterator(i - 1));
        }
        return total;
    }

    public static double dUsingIterator(int n) {
        double total = 0;
        for (int i = 1; i <= n; i++) {
            total += i * (i - 1);
        }
        return total;
    }

    public static double eUsingIterator(int n) {
        double total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    // using recursion
    public static double aUsingRecursion(int n) {

        if (n == 1)
            return 2;

        return Math.pow(2, n) + aUsingRecursion(n - 1);
    }

    public static double bUsingRecursion(int n) {
        if (n == 0) {
            return 1 / 2;
        }
        return (n + 1) / 2 + bUsingRecursion(n - 1);
    }

    public static double cUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return eUsingIterator(n) / eUsingIterator(n - 1) + cUsingRecursion(n - 1);
    }

    public static double dUsingRecursion(int n) {
        if (n == 1) {
            return 0;
        }
        return n * (n - 1) + dUsingRecursion(n - 1);
    }

    public static double eUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n * eUsingRecursion(n - 1);
    }

    public static void main(String[] args) {

        int n = 4;
        System.out.println("a: (Iterator) \t" + aUsingIterator(n));
        System.out.println("a: (Recursion) \t" + aUsingRecursion(n));

        System.out.println("b: (Iterator) \t" + bUsingIterator(n));
        System.out.println("b: (Recursion) \t" + bUsingIterator(n));

        System.out.println("c: (Iterator) \t" + cUsingIterator(n));
        System.out.println("c: (Recursion) \t" + cUsingRecursion(n));

        System.out.println("d: (Iterator) \t" + dUsingIterator(n));
        System.out.println("d: (Recursion) \t" + dUsingRecursion(n));

        System.out.println("e: (Iterator) \t" + eUsingIterator(n));
        System.out.println("e: (Recursion) \t" + eUsingRecursion(n));
    }
}