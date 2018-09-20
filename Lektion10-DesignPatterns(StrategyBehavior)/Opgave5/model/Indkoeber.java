package model;

import java.util.Observable;
import java.util.Observer;

public class Indkoeber implements Observer {
	private String navn;

	public Indkoeber(String navn) {
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Bogtitel b = (Bogtitel) o;
		if (b.getAntal() < 6) {
			System.out.println("Der bestilles nu 10 bøger af: " + b.getTitel());
			b.indkoebTilLager(10);
		}
		// else do nothing
	}
}
