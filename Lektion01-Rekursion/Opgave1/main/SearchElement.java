package main;

import java.util.ArrayList;

public class SearchElement {
	public static int searchBiggestInt(ArrayList<Integer> integerList, int index) {
		if (index == 1) {
			return integerList.get(index);
		} else {
			return Integer.max(searchBiggestInt(integerList, index - 1), integerList.get(index - 1));
		}
	}

	public static int searchBiggestInt(ArrayList<Integer> integers) {

		return searchBiggestInt(integers, integers.size());
	}

	public static int sumOfAllInt(ArrayList<Integer> integerList, int index) {
		if (index == 1) {
			return integerList.get(index);
		} else {
			return sumOfAllInt(integerList, index - 1) + integerList.get(index);
		}
	}

	public static int sumOfAllInt(ArrayList<Integer> integerList) {
		return searchBiggestInt(integerList, integerList.size() - 1);
	}

}
