package arithmetic;

public class ArithmeticExpression {
	private ExpressionTokenizer tokenizer;

	public ArithmeticExpression(String anExpression) {
		tokenizer = new ExpressionTokenizer(anExpression);
	}

	public int getExpressionValue() {
		int value = getTermValue();
		boolean done = false;
		while (!done) {
			String next = tokenizer.peekToken();
			if ("+".equals(next) || "-".equals(next)) {
				tokenizer.nextToken(); // Discard "+" or "-"
				int value2 = getTermValue();
				if ("+".equals(next)) {
					value += value2;
				} else {
					value -= value2;
				}
			} else {
				done = true;
			}
		}
		return value;
	}

	private int getTermValue() {
		// TODO Auto-generated method stub
		int value = getFactorValue();
		boolean done = false;
		while (!done) {
			String next = tokenizer.peekToken();
			if ("*".equals(next) || "/".equals(next)) {
				tokenizer.nextToken();
				int value2 = getFactorValue();
				if ("*".equals(next)) {
					value *= value2;
				} else {
					value /= value2;
				}
			} else {
				done = true;
			}
		}
		return value;
	}

	private int getFactorValue() {
		// TODO Auto-generated method stub
		int value;
		String next = tokenizer.peekToken();
		if ("(".equals(next)) {
			tokenizer.nextToken(); // Discard "("
			value = getExpressionValue();
			tokenizer.nextToken(); // Discard ")"
		} else {
			value = Integer.parseInt(tokenizer.nextToken());
		}
		return value;
	}
}
