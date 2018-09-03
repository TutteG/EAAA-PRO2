package comparator;

import java.util.Comparator;

public class StuderendeComparator implements Comparator<Studerende> {
	public StuderendeComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Studerende o1, Studerende o2) {

		if (o1.getStudieNr() == o2.getStudieNr()) {
			return o1.getNavn().compareTo(o2.getNavn());
		}
		return Integer.compare(o1.getStudieNr(), o2.getStudieNr());
	}
}
