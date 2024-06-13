import java.util.Stack;
class Cau2 {

    public static String dec2bin(int num) {
        Stack<Integer> st = new Stack<>();
        while(num != 0) {
            st.push(num % 2);
            num /= 2;
        }

        String s = "";
        while(!st.isEmpty()) {
            s += st.pop();
        }

        return s;
    }

    public static void main(String[] args) {
    }
}