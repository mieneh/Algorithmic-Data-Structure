import java.util.Arrays;

public class Practice {

    public static void swap(int[] a, int x, int y) {
        // System.out.println("x" + x);
        // System.out.println("y" + y);
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static int partition(int[] a, int left, int right) {
        int low = left - 1;
        int pivot = right;
        for(int i = left; i < right; i++) {
            if(a[i] < a[pivot]) {
                low++;
                swap(a, i, low);
            }
        }
        low++;
        swap(a, low, pivot);
        return low;
    }

    public static void quickSort(int[] a, int left, int right) {
        if (left < right) {

            int pivot = partition(a, left, right);

            quickSort(a, left, pivot - 1);
            quickSort(a, pivot + 1, right);
        }
    }

    public static void main(String[] args) {
        // int[] a = { 24, 18, 38, 43, 14, 40, 1, 54 };
        int[] a = { 177, 218, 266, 373, 375, 400, 559, 630, 757, 761, 768, 795, 815, 826, 834, 902, 914, 946, 1047, 1062, 1074, 1247, 1272, 1305, 1512, 1548, 1636, 1870, 1938, 1983 };

        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
