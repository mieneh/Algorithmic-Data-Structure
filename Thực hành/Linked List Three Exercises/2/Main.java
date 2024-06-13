public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        // add element
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(3); 
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(9);

        // output element
        list.print();

        // add x with index p
        list.add(100, 3);
        list.print();
    }

}
