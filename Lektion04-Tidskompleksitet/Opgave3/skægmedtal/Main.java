package skægmedtal;

public class Main {
	public static void main(String[] args) {
		// TODO
		int[] array = new int[] { 5, 10, 5, 6, 4, 9, 8 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(prefixAverage(array)[i]);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(prefixAverageV2(array)[i]);
		}
	}

	// Kvadratisk udgave
	public static double[] prefixAverage(int[] inputTal) {
		double[] prefixArray = new double[inputTal.length];
		for (int i = 0; i < inputTal.length; i++) {
			double sum = 0;
			for (int j = i; j >= 0; j--) {
				sum += inputTal[j];
			}
			prefixArray[i] = sum / (i + 1);
		}
		return prefixArray;
	}

	// Lineær udgave
	public static double[] prefixAverageV2(int[] inputTal) {
		double[] prefixArray = new double[inputTal.length];
		double sum = 0;
		for (int i = 0; i < inputTal.length; i++) {
			sum += inputTal[i];
			prefixArray[i] = sum / (i + 1);
		}
		return prefixArray;
	}
}
