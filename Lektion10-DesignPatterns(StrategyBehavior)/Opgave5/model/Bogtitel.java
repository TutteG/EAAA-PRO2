package model;

import java.util.ArrayList;
import java.util.Observable;

public class Bogtitel extends Observable {
	private String titel;
	private int antal;
	private ArrayList<Kunde> kunder;

	public Bogtitel(String titel, int antal) {
		this.titel = titel;
		this.antal = antal;
		this.kunder = new ArrayList<Kunde>();
	}

	public String getTitel() {
		return titel;
	}

	public int getAntal() {
		return antal;
	}

	public void indkoebTilLager(int antal) {
		this.antal += antal;
	}

	public ArrayList<Kunde> getKunder() {
		return kunder;
	}

	public void etKoeb(Kunde k) {
		kunder.add(k);
		k.addBogtitel(this);
		antal--;
		setChanged();
		notifyObservers();
	}
}
