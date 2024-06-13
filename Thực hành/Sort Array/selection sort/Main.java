
// import java.util.Arrays;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;

            // find minium
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }

            if (i == min) {
                continue;
            }
            // swap
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            System.out.println(Arrays.toString(a));

        }
    }


    public static void sortV2(int[] a) {
        for (int i = a.length-1; i >= 0; i--) {
            int max = i;

            // find max
            for (int j = 0; j < i; j++) {
                if (a[max] < a[j]) {
                    max = j;
                }
            }

            if (i == max) {
                continue;
            }
            // swap
            // System.out.println(a[max]);
            int temp = a[max];
            a[max] = a[i];
            a[i] = temp;
            // System.out.println(Arrays.toString(a));

        }
    }

    public static void main(String[] args) {

        // int[] a = { 2, 1, 3, 0, 5 };
        int[] a = { 2, 1, 3, 0, 5, 10, -10, 30, -29, -27, 5, 3, -3, -2 };

        System.out.println(Arrays.toString(a)); 
        sortV2(a);
        System.out.println(Arrays.toString(a));

    }
}
