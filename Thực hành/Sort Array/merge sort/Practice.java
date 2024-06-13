
import java.util.Arrays;

class Practice {

    public static void merge(int[] a, int l, int m, int r) {

        int[] newArr = new int[a.length];
        
    }

    public static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(a, left, middle);
            mergeSort(a, middle + 1, right);

            merge(a, left, middle, right);
        }
    }

    public static void main(String[] args) {
        int[] a = {
            177, 218, 266, 373, 375, 400, 559, 630, 757, 761, 768, 795, 815, 826, 834, 902, 914, 946, 1047, 1062, 1074, 1247, 1272, 1305, 1512, 1548, 1636, 1870, 1938, 1983
        };
        System.out.println(Arrays.toString(a));
        mergeSort(a);
        System.out.println(Arrays.toString(a));

    }
}