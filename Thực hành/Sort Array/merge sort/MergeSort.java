import java.util.Arrays;

/**
 * MergeSort
 */
public class MergeSort {

    public static int[] merge(int[] first, int[] second) {
        int[] mergeArray = new int[first.length + second.length];

        int index = 0;
        int indexFirst = 0;
        int indexSecond = 0;

        while (indexFirst != first.length || indexSecond != second.length) {
            if (indexFirst == first.length) {
                mergeArray[index] = second[indexSecond];
                indexSecond++;
                index++;
                continue;
            }
            if (indexSecond == second.length) {
                mergeArray[index] = first[indexFirst];
                indexFirst++;
                index++;
                continue;
            }
            if (first[indexFirst] < second[indexSecond]) {
                mergeArray[index] = first[indexFirst];
                indexFirst++;
                index++;
                continue;
            }
            if (first[indexFirst] > second[indexSecond]) {
                mergeArray[index] = second[indexSecond];
                indexSecond++;
                index++;
                continue;
            }
        }

        return mergeArray;
    }

    public static void sort(int[] array, int l, int r) {
        int middle = l + (l + r) / 2;

    }

    public static void main(String[] args) {

        int[] array = { 5, 4, 3, 4, 2, 1 };

        sort(array, 0, array.length);
        System.out.println(Arrays.toString(array));

        int[] a = { 1, 3 };
        int[] b = { 2, 4 };
        int[] c = merge(a, b);
        System.out.println(Arrays.toString(c));
    }
}