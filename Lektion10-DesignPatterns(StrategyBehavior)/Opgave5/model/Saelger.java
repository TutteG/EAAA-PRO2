package model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Saelger implements Observer {
	private String navn;

	public Saelger(String navn) {
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Bogtitel bogtitel = (Bogtitel) o;
		System.out.println("Følgende bøger er købt af samme kunde:");
		ArrayList<Bogtitel> bogtitels = new ArrayList<Bogtitel>();
		bogtitels.add(bogtitel);
		for (Kunde kunde : bogtitel.getKunder()) {
			for (Bogtitel bogtitle : kunde.getBogtitels()) {
				if (!bogtitels.contains(bogtitle)) {
					bogtitels.add(bogtitle);
					System.out.println(bogtitle.getTitel());
				}
			}
		}
	}
}
