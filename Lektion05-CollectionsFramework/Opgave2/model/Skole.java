package model;

import java.util.LinkedList;

public class Skole {
	private String navn;
	private LinkedList<Studerende> studerendeListe;

	public Skole(String navn) {
		// TODO Auto-generated constructor stub
		this.navn = navn;
		studerendeListe = new LinkedList<>();
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public void addStuderende(Studerende studerende) {
		// TODO Auto-generated method stub
		studerendeListe.add(studerende);
	}

	public void removeStuderende(Studerende studerende) {
		// TODO Auto-generated method stub
		studerendeListe.remove(studerende);
	}

	public double gennemsnit() {
		// TODO Auto-generated method stub
		double gennemsnit = 0;
		for (Studerende studerende : studerendeListe) {
			gennemsnit += studerende.getGennemsnit();
		}
		return gennemsnit / studerendeListe.size();
	}

	public Studerende findStuderende(int studieNr) {
		// TODO Auto-generated method stub
		for (Studerende studerende : studerendeListe) {
			if (studerende.getStudieNr() == studieNr) {
				return studerende;
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
