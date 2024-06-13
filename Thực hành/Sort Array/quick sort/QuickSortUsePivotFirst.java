import java.util.Arrays;

public class QuickSortUsePivotFirst {

    public static int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low;

        for (int j = low + 1; j <= high; j++) {
            if (a[j] < pivot) {
                i++;

                // swap
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }

        // swap
        int temp = a[i];
        a[i] = a[low];
        a[low] = temp;

        return i;
    }

    public static void quickSort(int[] a, int low, int high) {

        if (low < high) {

            int pi = partition(a, low, high);

            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] a = { 24, 18, 38, 43, 14, 40, 1, 54 };
        quickSort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }
}
