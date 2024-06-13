import java.util.NoSuchElementException;

public class LinkedUsingArray<E> implements ListInterface<E> {

    protected static final int MAX_SIZE = 10000;
    protected E[] arr = (E[]) new Object[MAX_SIZE];
    // protected E[] arr = new E[MAX_SIZE];
    protected int num_nodes = 0;

    public boolean isEmpty() {
        return num_nodes == 0;
    }

    public int size() {
        return num_nodes;
    }

    public E getFirst() throws NoSuchElementException {
        if (num_nodes != 0) {
            return arr[0];
        }
        throw new NoSuchElementException();
    }

    public boolean contains(E item) {
        for (int i = 0; i < num_nodes; i++) {
            if (arr[i] == item) {
                return true;
            }
        }

        return false;
    }

    public void addFirst(E item) {
        for (int i = num_nodes; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = item;
        num_nodes += 1;
    }

    public void add(E item, int index) {
        if (index < 0 || index > num_nodes) {
            return;
        }
        for (int i = num_nodes; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
        num_nodes += 1;

    }

    public int find(E item) {
        for (int i = 0; i < num_nodes; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;

    }

    public int totalGreaterX(E item) {
        int total = 0;
        // System.out.println(num_nodes);
        this.print();
        for (int i = 0; i < num_nodes; i++) {
            if ((Integer) arr[i] - (Integer) item > 0) {
                total += 1;
            }
            // System.out.println((Integer) arr[i] - (Integer) item);
        }
        return total;

    }

    public void remove(E item) {
        if (this.contains(item)) {
            for (int i = this.find(item); i < num_nodes - 1; i++) {
                arr[i] = arr[i + 1];
            }
            num_nodes -= 1;
            // return
        }
    }

    public E removeFirst() throws NoSuchElementException {
        E result = arr[0];
        for (int i = 0; i < num_nodes - 1; i++) {
            arr[i] = arr[i + 1];
        }
        num_nodes -= 1;
        return result;
    }

    public void print() {
        for (int i = 0; i < num_nodes; i++) {
            System.out.print(arr[i].toString() + "| ");
        }
        System.out.println("");
    }
}
