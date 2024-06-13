public class ListNode<E> {
    private E element;
    private ListNode<E> next;

    public ListNode(E item) {
        this.element = item;
        this.next = null;
    }

    public ListNode(E item, ListNode<E> next) {
        this.element = item;
        this.next = next;
    }

    public ListNode<E> getNext() {
        return this.next;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public E getElement() {
        return this.element;
    }

    public void setNext(ListNode<E> next) {
        this.next = next;
    }

}
