package divideandconquer;

import java.util.ArrayList;

public class MergeSort {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(maximum(list));
	}

	public static int maximum(ArrayList<Integer> list) {
		int sum = 0;
		sum = maximum(list, 0, list.size() - 1);
		return sum;
	}

	private static int maximum(ArrayList<Integer> list, int low, int high) {
		if (low == high) {
			return list.get(low);
		} else {
			int middle = (low + high) / 2;
			int max1 = maximum(list, low, middle);
			int max2 = maximum(list, middle + 1, high);
			return max1 + max2;
		}

	}
}
