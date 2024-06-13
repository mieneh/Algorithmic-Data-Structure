public class Test {

	// exercises 1 Count the number of even item in the list.
	public static int countEven(MyLinkedList<Integer> list) {
		int count = 0;
		Node<Integer> current = list.getHead();
		while (current != null) {
			if (current.getData() % 2 == 0) {
				count += 1;
			}
			current = current.getNext();
		}

		return count;
	}

	public static boolean isPrime(int num) {
		if (num <= 1) return false;

		for (int i = 2; i <= Math.round(Math.sqrt(num)); i++) {
			if (num % i == 0) return false;
		}

		return true;
	}

	// exercises 2 Count the number of prime item in the list.
	public static int countPrime(MyLinkedList<Integer> list) {
		int count = 0;
		Node<Integer> current = list.getHead();
		while (current != null) {
			if (isPrime(current.getData())) {
				count += 1;
			}
			current = current.getNext();
		}

		return count;
	}

	// exercises 3 Add item X before the first even element in the list.
	public static void addBeforeFirstEven(MyLinkedList<Integer> list, int item) {
		Node<Integer> current = list.getHead();
		Node<Integer> pre = list.getHead();

		while (current != null) {
			if (current.getData() % 2 == 0) {
				if (pre == list.getHead()) {
					list.addFirst(item);
				} else {
					list.addAfter(pre, item);
				}
				return;
			}
			pre = current;
			current = current.getNext();
		}
	}

	// exercises 4 Find the maximum number in the list.
	public static int findMax(MyLinkedList<Integer> list) {
		if (list.isEmpty()) return -1;

		Node<Integer> current = list.getHead();
		int maxValue = current.getData();

		while (current != null) {
			maxValue = current.getData() > maxValue ? current.getData() : maxValue;
			current = current.getNext();
		}

		return maxValue;
	}


	public static void swap(Node<Integer> first, Node<Integer> second) {
		int temp = first.getData();
		first.setData(second.getData());
		second.setData(temp);
	}

	// exercises 5 Sort the list in ascending order. 
	public static void sort(MyLinkedList<Integer> list, boolean isAscending) {
		if (list.isEmpty()) return;

		Node<Integer> current = list.getHead();

		if (isAscending) {
			while (current != null) {
				Node<Integer> pre = current.getNext();
				while (pre != null) {
					if (current.getData() > pre.getData()) {
						swap(current, pre);
					}
					pre = pre.getNext();
				}
				current = current.getNext();
			}
		} else {
			while (current != null) {
				Node<Integer> pre = current.getNext();
				while (pre != null) {
					if (current.getData() < pre.getData()) {
						swap(current, pre);
					}
					pre = pre.getNext();
				}
				current = current.getNext();
			}
		}
	}


	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.addLast(7);
		list.addLast(3);
		list.addLast(5);
		list.addLast(9);
		list.addLast(1);
		list.addLast(21);
		list.addLast(25);
		list.addLast(10);
		list.print();

		System.out.println(countEven(list));
		System.out.println(countPrime(list));

		addBeforeFirstEven(list, 999);
		list.print();

		System.out.println(findMax(list));

		sort(list, false);
		list.print();
	}

}