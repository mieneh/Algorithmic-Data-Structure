public class Exercise8 {

    // Using Linked List in Lab 1 for this exercise.

    // (a) Implement method addSortedList(E item) to insert new element to a sorted
    // linked list, that means we have to find the first node whose value is bigger
    // than item and insert before it.

    // (b) Suppose we have a linked list contains integer numbers, do the following
    // requirements:
    // Count all even numbers.
    // Sum all numbers.

    public static int countEven(MyLinkedList<Integer> ls) {
        Node<Integer> head = ls.getHead();
        int count = 0;

        while (head != null) {
            if (head.getData() % 2 == 0) {
                count += 1;
            }
            head = head.getNext();
        }

        return count;
    }

    public static int sumAll(MyLinkedList<Integer> ls) {
        Node<Integer> head = ls.getHead();
        int sum = 0;

        while (head != null) {
            sum += head.getData();
            head = head.getNext();
        }

        return sum;
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> ls = new MyLinkedList<>();

        ls.addFirst(3);
        ls.addFirst(23);
        ls.addFirst(32);
        ls.addFirst(13);
        ls.addFirst(31);

        ls.print();
        ls.sort();
        ls.print();
        ls.addSortedList(100);
        ls.print();

        System.out.println("count even: " + countEven(ls));
        System.out.println("sum all: " + sumAll(ls));
    }

}
