public class Test {

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.addFirst(1);
		list.addFirst(2);
		list.addLast(3);
		list.print();

		list.removeCurr(list.getHead().getNext().getNext());

		list.print();
	}
}