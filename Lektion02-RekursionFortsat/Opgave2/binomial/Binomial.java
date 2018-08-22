package binomial;

public class Binomial {
	public static int binomial(int m, int n) {
		if (n < 0 || m > n) {
			return 0;
		}
		if (m == 0 || n == m) {
			return 1;
		}
		return binomial(m, n - 1) + binomial(m - 1, n - 1);
	}

	public static void main(String[] args) {
		System.out.println(binomial(2, 4));
	}
}
