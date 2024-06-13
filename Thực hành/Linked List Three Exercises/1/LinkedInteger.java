public class LinkedInteger extends LinkedUsingArray<Integer> {

    public int totalGreaterX(Integer item) {
        int total = 0;
        // System.out.println(num_nodes);
        this.print();
        for (int i = 0; i < num_nodes; i++) {
            // Integer current = Integer.valueOf(arr[i]);
            // if (current > item) {
            //     total += 1;
            // }
            System.out.println(this.arr[i]);
        }
        return total;
    }

}
