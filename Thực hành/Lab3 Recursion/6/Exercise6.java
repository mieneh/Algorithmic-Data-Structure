import java.util.Arrays;

public class Exercise6 {
    // Using iteration, define the functions to:

    // (a) Find and return the minimum element in an array. The array and its size
    // are given as parameters.
    public static int miniumUsingIteration(int[] a, int n) {
        int min = 0;
        for (int i = 1; i < n; i++) {
            min = a[i] < a[min] ? i : min;
        }
        return a[min];
    }

    // (b) Compute and return the sum of all elements in an array. The array and its
    // size are given as parameters.
    public static int sumAllUsingIteration(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }

    // (c) Count how many even numbers are there in an array. The array and its size
    // are given as parameters.
    public static int countEvenUsingIteration(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += a[i] % 2 == 0 ? 1 : 0;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 3, 2, 1, -1 };
        System.out.println(Arrays.toString(a));
        System.out.println(String.format("min trong array: %d", miniumUsingIteration(a, a.length)));
        System.out.println(String.format("sum array: %d", sumAllUsingIteration(a, a.length)));
        System.out.println(String.format("evens in array: %d", countEvenUsingIteration(a, a.length)));

    }
}
