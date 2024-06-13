import java.util.Arrays;

public class TestMinHeap {

    // HeapSort(array)
    // BuildHeap(array)
    // for i <- 0 -> n-1 do
    // A[i] = ExtracMax()
    // end
    // return A

    public static void HeapSort(int[] array) {
        MinHeap minheap = new MinHeap(array.length);
        for (int i = 0; i < array.length; i++) {
            minheap.insert(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = minheap.extractMin();
        }
    }

    public static void main(String[] args) {
        int[] a = { 10, 4, 56, 6, 7, 4, 6, 7, 8, 1, 2, 3, 1, 2, 0, 19, 20, 452 };

        System.out.println("list: " + Arrays.toString(a));

        MinHeap minheap = new MinHeap(a.length);
        for (int i = 0; i < a.length; i++) {
            minheap.insert(a[i]);
        }
        minheap.show();

        HeapSort(a);

        System.out.println(Arrays.toString(a));
    }
}