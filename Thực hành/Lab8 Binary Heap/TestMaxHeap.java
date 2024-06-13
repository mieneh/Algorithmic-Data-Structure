import java.util.Arrays;

public class TestMaxHeap {

    public static void HeapSort(int[] array) {

        MaxHeap maxheap = new MaxHeap(array.length);
        for (int i = 0; i < array.length; i++) {
            maxheap.insert(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = maxheap.extractMax();
        }
    }

    public static void main(String[] args) {
        int[] a = { 10, 4, 56, 6, 7, 4, 6, 7, 8, 1, 2, 3, 1, 2, 0, 19, 20, 452 };

        System.out.println("list: " + Arrays.toString(a));

        MaxHeap maxheap = new MaxHeap(a.length);
        for (int i = 0; i < a.length; i++) {
            maxheap.insert(a[i]);
        }
        maxheap.show();

        HeapSort(a);
        System.out.println("sort: " + Arrays.toString(a));
    }
}