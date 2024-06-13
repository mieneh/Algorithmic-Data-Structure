class Exercise3 {
    // Define a recursive function public static boolean checkPrime(int n, int d)
    // that check whether a number is prime (d is current divisor to check)

    public static boolean checkPrime(int n, int d) {
        if (n <= 1) {
            return false;
        }

        if (d > Math.floor(Math.sqrt(n))) {
            return true;
        }

        if (n % d == 0) {
            return false;
        }

        return checkPrime(n, d + 1);
    }

    public static void main(String[] args) {

        int n = 10;
        System.out.println(String.format("check prime %d ", n) + checkPrime(n, 2));
        System.out.println(String.format("check prime %d ", 19) + checkPrime(19, 2));
    }
}