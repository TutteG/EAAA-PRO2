package arithmetic;

public class ExpressionTokenizer {
	private String input;
	private int start;
	private int end;

	public ExpressionTokenizer(String anInput) {
		this.input = anInput;
		this.start = 0;
		this.end = 0;
		nextToken();
	}

	public String peekToken() {
		if (start >= input.length()) {
			return null;
		} else {
			return input.substring(start, end);
		}
	}

	public String nextToken() {
		// TODO Auto-generated method stub
		String r = peekToken();
		start = end;
		if (start >= input.length()) {
			return r;
		}
		if (Character.isDigit(input.charAt(start))) {
			end = start + 1;
			while (end < input.length() && Character.isDigit(input.charAt(end))) {
				end++;
			}
		} else {
			end = start + 1;
		}
		return r;
	}

}