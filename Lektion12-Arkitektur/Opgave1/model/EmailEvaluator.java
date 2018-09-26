package model;

public class EmailEvaluator implements Evaluator {

	@Override
	public boolean isValid(String s) {
		if (s.contains("@")) {
			int atIndex = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '@') {
					atIndex = i;
				}
			}
			if (atIndex != 0 && atIndex != s.length() - 1 && s.charAt(s.length() - 1) != '.') {
				return true;
			}
		}
		return false;
	}

}
