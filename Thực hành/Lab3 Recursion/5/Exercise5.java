class Exercise5 {

    // Define a recursive function to convert a Decimal number to Binary. (The
    // output must be an integer number. Example with input is 8, output must be an
    // integer number 1000).

    public static int decimal2Binary(int decimal) {
        if (decimal == 0) {
            return 0;
        }
        int number = decimal % 2;
        return number + decimal2Binary(decimal / 2) * 10;
    }

    public static void main(String[] args) {
        int n = 15;

        System.out.println(String.format("%d -> %d", n, decimal2Binary(n)));
    }
}