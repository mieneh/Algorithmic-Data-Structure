public class TestStack {
    public static void main(String[] args) {

        MyStack<Fraction> stack = new MyStack<>();

        System.out.println("stack is empty? " + stack.isEmpty());
        stack.push(new Fraction(1, 2));
        stack.push(new Fraction(3, 2));
        stack.push(new Fraction(3, 2));

        // System.out.println(stacgetLastk.print());
        // stack.print();
        // System.out.println(stack.getLast());

        System.out.println("top of stack is " + stack.peek());
        stack.push(new Fraction(5, 2));
        System.out.println("top of stack is " + stack.pop());
        stack.push(new Fraction(9, 2));
        stack.pop();
        stack.pop();
        System.out.println("top of stack is " + stack.peek());
        stack.print();i
    }
}
