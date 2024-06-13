import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		MyLinkedList<Fraction> list = new MyLinkedList<>();
		Fraction curr = new Fraction(1, 3);
		list.addFirst(new Fraction(1, 2));
		list.addFirst(curr);
		list.addLast(new Fraction(1, 5));
		list.print();
	}
}