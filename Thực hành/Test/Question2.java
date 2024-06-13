

import java.util.Stack;

class Question2 {
    public static String reverseIntList(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }

        String s = "";
        while(!st.isEmpty()) {
            s += st.pop();
        }

        return s;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        System.out.println(reverseIntList(a));
    }
}