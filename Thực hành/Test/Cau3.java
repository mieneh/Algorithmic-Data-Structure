class Cau3 {

    public static int recur(int a, int b) {
        if (a == b) {
            return a;
        }

        if (a > b) {
            return recur(a - b, b);
        }

        return recur(a, b - a);
    }
}