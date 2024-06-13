import java.util.NoSuchElementException;

class MaxHeap {
    int[] heap;
    int heapSize;
    int maxSize;

    public MaxHeap(int capity) {
        heapSize = 0;
        this.maxSize = capity + 1;
        heap = new int[maxSize];
        heap[0] = -1;
    }

    private int parent(int i) {
        return i / 2;
    }

    private int left(int i) {
        return 2 * i;
    }

    private int right(int i) {
        return (2 * i) + 1;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int key) {
        if (heapSize == maxSize) {
            throw new NoSuchElementException("Overflow Exception");
        }
        heapSize += 1;
        heap[heapSize] = key;
        shiftUp(heapSize);
    }

    // shiftUp ???

    private void shiftUp(int i) {
        while (i > 1 && heap[parent(i)] < heap[i]) {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    public int extractMax() {
        if (heapSize == 0) {
            throw new NoSuchElementException("Underflow Exception");
        }
        int max = heap[1];
        heap[1] = heap[heapSize];
        heapSize -= 1;
        shiftDown(1);
        return max;
    }

    // shiftDown ???

    private void shiftDown(int i) {
        while (i <= heapSize) {
            int max = heap[i];
            int maxId = i;

            if (left(i) < heapSize && max < heap[left(i)]) {
                max = heap[left(i)];
                maxId = left(i);
            }
            if (right(i) < heapSize && max < heap[right(i)]) {
                max = heap[right(i)];
                maxId = right(i);
            }
            if (maxId != i) {
                swap(maxId, i);
                i = maxId;
            } else {
                break;
            }
        }
    }

    public void show() {
        for (int i = 1; right(i) <= heapSize; i++) {
            System.out.println(
                    String.format("parent: %d -> [left %d, right %d]", heap[i], heap[left(i)], heap[right(i)]));
        }
    }
}