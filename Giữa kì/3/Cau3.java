import java.util.Stack;

class Cau3 {
	public static int calculate(String[] expression) {

		Stack<Integer> stack = new Stack<>();
		int o3 = 0;

		for (int i = 0; i < expression.length; i++) {
			if (expression[i] == "+" || expression[i] == "-") {

				// i'm fire
				int o1 = stack.pop();
				int o2 = stack.pop();
				if (expression[i] == "+") {
					o3 = o1 + o2;
				} else {
					o3 = o2 - o1;
				}
				stack.push(o3);
			} else {
				stack.push(Integer.valueOf(expression[i]));
			}

		}
		return o3;

	}

	private static boolean isNumber(String str) {
		return str.matches("0|([1-9][0-9]*)");
	}

	public static void main(String[] args) {
		String[] epx = { "3", "4", "+", "2", "1", "+", "-" };
		System.out.println(calculate(epx));
	}
}
