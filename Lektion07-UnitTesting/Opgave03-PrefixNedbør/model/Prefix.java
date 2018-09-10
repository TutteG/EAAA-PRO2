package model;

public class Prefix {

	public Prefix() {
		// TODO Auto-generated constructor stub
	}

	// Lineær udgave
	public double[] prefixAverageV2(int[] inputTal) {
		double[] prefixArray = new double[inputTal.length];
		double sum = 0;
		for (int i = 0; i < inputTal.length; i++) {
			sum += inputTal[i];
			prefixArray[i] = sum / (i + 1);
		}
		return prefixArray;
	}
}
