public class Main {
    public static void main(String[] args) {
        LinkedUsingArray<Integer> list = new LinkedUsingArray<Integer>();
        list.addFirst(10);
        list.addFirst(10);
        list.addFirst(10);

        list.add(2, 2);
        list.addFirst(8);

        list.print();

        list.remove(8);

        list.print();

        int num = list.totalGreaterX(2);
        System.out.println(num);

    }

}
