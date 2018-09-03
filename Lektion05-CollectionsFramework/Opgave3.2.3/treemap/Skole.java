package treemap;

import java.util.Set;
import java.util.TreeMap;

public class Skole {
	private String navn;
	private TreeMap<Integer, Studerende> studerendeListe;

	public Skole(String navn) {
		// TODO Auto-generated constructor stub
		this.navn = navn;
		studerendeListe = new TreeMap<>();
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public void addStuderende(Studerende studerende) {
		// TODO Auto-generated method stub
		studerendeListe.put(studerende.getStudieNr(), studerende);
	}

	public void removeStuderende(Studerende studerende) {
		// TODO Auto-generated method stub
		studerendeListe.remove(studerende.getStudieNr());
	}

	public double gennemsnit() {
		// TODO Auto-generated method stub
		double gennemsnit = 0;
		Set<Integer> keySet = studerendeListe.keySet();
		for (Integer i : keySet) {
			gennemsnit += studerendeListe.get(i).getGennemsnit();
		}
		return gennemsnit / studerendeListe.size();
	}

	public Studerende findStuderende(int studieNr) {
		// TODO Auto-generated method stub

		Set<Integer> keySet = studerendeListe.keySet();
		for (Integer i : keySet) {
			if (studerendeListe.get(i).getStudieNr() == studieNr) {
				return studerendeListe.get(i);
			}
		}
		return null;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return navn + "\n" + studerendeListe;
	}
}
