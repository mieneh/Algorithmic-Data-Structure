import java.util.NoSuchElementException;

/**
 * LinkedInteger
 */
public class LinkedList<E> implements ListInterface<E> {

    private ListNode<E> head = null;
    private int num_nodes = 0;

    LinkedList() {
        this.head = null;
    }

    LinkedList(ListNode<E> head) {
        this.head = head;
        this.num_nodes += 1;
    }

    public boolean isEmpty() {
        return num_nodes == 0;
    }

    public int size() {
        return num_nodes;
    }

    public E getFirst() {
        return head.getElement();
    }

    public boolean contains(E item) {
        ListNode<E> current = head;
        while (current != null) {
            if (current.getElement() == item) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void add(E item, int index) throws IndexOutOfBoundsException {
        // check index
        if (index < 0 || index > num_nodes) {
            throw new IndexOutOfBoundsException();
        }


        ListNode<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        // copy next current
        ListNode<E> copyNode = current.getNext();
        ListNode<E> newNode = new ListNode<E>(item, copyNode);
        
        current.setNext(newNode);
    }

    public void addFirst(E item) {
        // save head note
        ListNode<E> current = head;

        // create new node
        ListNode<E> newNode = new ListNode<E>(item, current);
        head = newNode;
        num_nodes += 1;
    }
    
    public E removeFirst() throws NoSuchElementException {
        // check head == null
        if (head == null) {
            throw new NoSuchElementException();
        }

        // copy head current
        ListNode<E> copyHead = head;
        // removeFirst
        head = head.getNext();

       num_nodes -= 1;
        return copyHead.getElement();
    }
    
    public void print() {
        ListNode<E> current = head;
        while (current != null) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println("");
    }
}