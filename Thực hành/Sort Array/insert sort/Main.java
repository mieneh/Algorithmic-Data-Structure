
// import java.util.Arrays;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i;
            int copy = a[i];
            while(j >= 1 && copy < a[j-1]) {
                a[j] = a[j-1];
                j--;
            }

            a[j] = copy;
        }
    }

    public static void insertSortV2(int[] a) {
        for (int i = a.length - 2; i >= 0; i--) {
            int j = i;
            int copy = a[i];
            while(j <= a.length - 2 && copy > a[j+1]) {
                a[j] = a[j+1];
                j++;
            }

            a[j] = copy;
        }
    }

    public static void main(String[] args) {

        int[] a = { 2, 1, 3, 0, 5, 10, -10, 30, -29, -27, 5, 3, -3, -2 };
        // int[] a = { -3, -2 };

        System.out.println(Arrays.toString(a));
        // insertSort(a);
        insertSortV2(a);

        System.out.println(Arrays.toString(a));

    }
}
