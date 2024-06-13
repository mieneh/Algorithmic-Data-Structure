

class Question3 {
    public static int recur(int n) {
        if (n == 0) {
            return 4;
        }

        if (n == 1) {
            return 3;
        }

        return recur(n - 1) - recur(n - 2) - 1;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        System.out.println(recur(2));
    }
}