public class Solution3 {

    public static boolean findDuplicate(String s) {
        StackUsingLinkedList<Character> stack = new StackUsingLinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (c == ')') {
                Character top = stack.pop();

                int elementInside = 0;
                while (top != '(') {
                    top = stack.pop();
                    elementInside++;
                }

                // ((a)) -> true
                // (a) -> false
                if (elementInside < 1) {
                    return true;
                }
            } else {
                stack.push(c);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // String s = "(a+(b+c))";
        String s = "(a+((b+c)))";
        // String s = "(a+(b+c)))";
        System.out.println(findDuplicate(s));
    }
}
