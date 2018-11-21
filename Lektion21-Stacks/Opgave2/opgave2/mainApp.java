package opgave2;

public class mainApp {
	public static void main(String[] args) {
		String string = "(3+{5{99{*}}[23[{67}67]]})";
		String string2 = "(3+{5{99{*}}[23[{67}67]})]";
		System.out.println(checkParenthesis(string));
		System.out.println(checkParenthesis(string2));
	}

	public static boolean checkParenthesis(String s) {
		Arraystack<Character> stack = new Arraystack<Character>();
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '(':
				stack.push('(');
				break;
			case '[':
				stack.push('[');
				break;
			case '{':
				stack.push('{');
				break;
			case ')':
				if (stack.peek().equals('(')) {
					stack.pop();
				} else {
					return false;
				}
				break;
			case ']':
				if (stack.peek().equals('[')) {
					stack.pop();
				} else {
					return false;
				}
				break;
			case '}':
				if (stack.peek().equals('{')) {
					stack.pop();
				} else {
					return false;
				}
				break;
			default:
				break;
			}
		}
		if (stack.size() == 0) {
			return true;
		}
		return false;
	}
}
