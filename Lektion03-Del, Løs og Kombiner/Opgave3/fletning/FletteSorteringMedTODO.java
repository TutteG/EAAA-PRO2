package fletning;

import java.util.ArrayList;

public class FletteSorteringMedTODO {

	// den metode der saetter fletningen i gang
	public void fletteSort(ArrayList<Integer> list) {
		mergesort(list, 0, list.size() - 1);
	}

	// den rekursive metode der implementere del-loes og kombiner skabelonen
	private void mergesort(ArrayList<Integer> list, int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			mergesort(list, l, m);
			mergesort(list, m + 1, h);
			merge(list, l, m, h);
		}
	}

	// kombiner er realiseret ved fletteskabelonen
	private void merge(ArrayList<Integer> list, int low, int middle, int high) {
		// TODO
		ArrayList<Integer> temp = new ArrayList<>();

		ArrayList<Integer> array1 = new ArrayList<>(list.subList(low, middle + 1));

		ArrayList<Integer> array2 = new ArrayList<>(list.subList(middle + 1, high + 1));

		int i1 = 0;
		int i2 = 0;

		while (i1 < array1.size() && i2 < array2.size()) {
			if (array1.get(i1).compareTo(array2.get(i2)) <= 0) {
				temp.add(array1.get(i1));
				i1++;
			} else {
				temp.add(array2.get(i2));
				i2++;
			}
		}
		while (i1 < array1.size()) {
			temp.add(array1.get(i1));
			i1++;
		}

		while (i2 < array2.size()) {
			temp.add(array2.get(i2));
			i2++;
		}

		for (int i = 0; i < temp.size(); i++) {
			list.set(low + i, temp.get(i));
		}
	}

}
