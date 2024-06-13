
import java.util.Arrays;

class Test {

    public static void swap(int[] a, int x, int y) {
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }

    // move min to left
    public static void bubbleSortNormal(int[] a) {
        for( int i = 0 ; i < a.length - 1; i++) {
            for (int j = i +1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    swap(a, i, j);
                }
                // System.out.println(Arrays.toString(a));
            }
        }
    }

    // move max to right
    public static void bubbleSortV2(int[] a) {
        for( int i = a.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]) {
                    swap(a, i, j);
                }
                // System.out.println(Arrays.toString(a));
            }
        }
    }

    public static void bubbleSortUpdate(int[] a) {
        for( int i = 0 ; i < a.length - 1; i++) {

            boolean isSorted = true;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    swap(a, i, j);
                    isSorted = false;
                }
                // System.out.println(Arrays.toString(a));
            }

            if(isSorted) {
                return;
            }
        }
    }

    public static void main(String[] args) {

        int[] a = {4, 12, 1, 23, 4, 2, 1, -10};
        int[] b = {4, 5, 6, 7, 8, 9, 9, 10};
        bubbleSortV2(a);
        bubbleSortV2(b);
        // bubbleSortNormal(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}