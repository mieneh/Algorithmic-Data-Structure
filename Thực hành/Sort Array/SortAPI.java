// package sortArray;

// import java.lang.reflect.Array;
import java.util.*;

public class SortAPI {
    public static void main(String[] args) {
        // int[] arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 5;
        // arr[3] = 2;
        // arr[4] = 0;
        // Arrays.sort(arr);
        // // System.out.println(Arrays.toString(arr.sort(func)));

        // // String s = Arrays.deepToString(arr);
        // // Arrays.reverse(arr);
        // System.out.println(Arrays.toString(arr));
        Integer[] arr = { 1, 2, 3 };

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
