package ackerman;

public class Ackerman {
	public static long AckermanExpression(long x, long y) {
		if (x == 0) {
			return y += 1;
		} else if (y == 0) {
			return AckermanExpression(x - 1, 1);
		} else {
			return AckermanExpression(x - 1, AckermanExpression(x, y - 1));
		}
	}

	public static void main(String[] args) {
		System.out.println(AckermanExpression(1, 3));
	}
}
