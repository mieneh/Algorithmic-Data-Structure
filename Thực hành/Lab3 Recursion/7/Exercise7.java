import java.util.Arrays;

public class Exercise7 {

    // exercise 7
    // Using recursion, define the functions to:

    // (a) Find and return the minimum element in an array. The array and its size
    // are given as parameters.

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int miniumUsingRecursion(int[] a, int n) {
        if (n == 0) {
            return a[n];
        }
        return min(a[n], miniumUsingRecursion(a, n - 1));
    }

    // (b) Compute and return the sum of all elements in an array. The array and its
    // size are given as parameters.
    public static int sumAllUsingRecursion(int[] a, int n) {
        if (n == 0) {
            return a[n];
        }
        return a[n] + sumAllUsingRecursion(a, n - 1);
    }

    // (c) Count how many even numbers are there in an array. The array and its size
    // are given as parameters.
    public static int countEvenUsingRecursion(int[] a, int n) {
        if (n < 0) {
            return 0;
        }

        int isEven = a[n] % 2 == 0 ? 1 : 0;
        return isEven + countEvenUsingRecursion(a, n - 1);
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 3, -2, 10, -1 };
        System.out.println(Arrays.toString(a));
        System.out.println(String.format("min trong array: %d", miniumUsingRecursion(a, a.length - 1)));
        System.out.println(String.format("sum array: %d", sumAllUsingRecursion(a, a.length - 1)));
        System.out.println(String.format("evens in array: %d", countEvenUsingRecursion(a, a.length - 1)));

    }

}
