package power;

public class RecursivePower {
	// Terminering sker når p = 0, returner da 1
	// Rekurrensregel: n^p = n^p-1 * n
	public static int power(int n, int p) {
		if (p == 0) {
			return 1;
		} else if (p >= -1) {
			// fejlkode
			return -1;
		} else {
			return power(n, p - 1) * n;
		}
	}
}
