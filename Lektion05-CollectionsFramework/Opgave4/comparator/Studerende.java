package comparator;

import java.util.TreeSet;

public class Studerende implements Comparable<Studerende> {
	private int studieNr;
	private String navn;
	private TreeSet<Integer> karakterer;

	public Studerende(String navn, int studieNr) {
		// TODO Auto-generated constructor stub
		this.karakterer = new TreeSet<Integer>();
		this.navn = navn;
		this.studieNr = studieNr;
	}

	public TreeSet<Integer> getKarakterer() {
		return karakterer;
	}

	public double getGennemsnit() {
		// TODO Auto-generated method stub
		double gennemsnit = 0;
		for (Integer integer : karakterer) {
			gennemsnit += integer;
		}
		return gennemsnit / karakterer.size();
	}

	public String getNavn() {
		return navn;
	}

	public int getStudieNr() {
		return studieNr;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public void addKarakter(int karakter) {
		karakterer.add(karakter);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Navn: " + navn + "\tStudie Nr: " + studieNr + "\n";
	}

	@Override
	public int compareTo(Studerende o) {
		// TODO Auto-generated method stub
		if (o.getStudieNr() == this.studieNr) {
			return navn.compareTo(o.getNavn());
		}
		return Integer.compare(studieNr, o.getStudieNr());

	}
}
