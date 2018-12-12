package opgave2;

import java.util.ArrayList;
import java.util.List;

public class mainApp {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		SearchableList<String> linearList = new SearchableList<String>(list);
		list.add("Holme");
		list.add("Skåde");
		list.add("Viby");
		list.add("Beder");
		list.add("Engdal");
		list.add("Forældreskolen");
		list.add("Malling");

		System.out.println(linearList.search("Skåde"));
		System.out.println(linearList.search("Malling"));
		System.out.println(linearList.search("Riisskov"));

		String[] array = { "Holme", "Skåde", "Viby", "Beder", "Engdal", "Forældreskolen", "Malling" };
		SearchableArray<String> linearArray = new SearchableArray<String>(array);
		System.out.println(linearArray.search("Skåde"));
		System.out.println(linearArray.search("Riiskov"));

		String[] binaryArray = { "A", "B", "C", "D", "E", "F", "G" };
		SearchableArrayBinary<String> binaryArraySearch = new SearchableArrayBinary<String>(binaryArray);
		System.out.println(binaryArraySearch.search("A"));
		System.out.println(binaryArraySearch.search("E"));
		System.out.println(binaryArraySearch.search("R"));
	}
}
