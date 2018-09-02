package hashmap;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Color> favoriteColors = new HashMap<String, Color>();
		favoriteColors.put("Juliet", Color.BLUE);
		favoriteColors.put("Romeo", Color.GREEN);
		favoriteColors.put("Adam", Color.RED);
		favoriteColors.put("Eve", Color.BLUE);

		Set<String> keySet = favoriteColors.keySet();
		for (String string : keySet) {
			Color value = favoriteColors.get(string);
			System.out.println(string + " : " + value);
		}
	}
}
