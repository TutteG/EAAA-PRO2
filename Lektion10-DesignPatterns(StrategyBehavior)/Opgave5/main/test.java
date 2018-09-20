package main;

import model.Bogtitel;
import model.Indkoeber;
import model.Kunde;
import model.Saelger;

public class test {
	public static void main(String[] args) {
		Saelger saelger = new Saelger("Hansen");
		Indkoeber indkoeber = new Indkoeber("Jensen");

		Bogtitel bogtitel1 = new Bogtitel("Anders And", 6);
		Bogtitel bogtitel2 = new Bogtitel("Java", 8);

		bogtitel1.addObserver(indkoeber);
		bogtitel1.addObserver(saelger);
		bogtitel2.addObserver(indkoeber);
		bogtitel2.addObserver(saelger);

		Kunde kunde1 = new Kunde("Læsehest1");
		Kunde kunde2 = new Kunde("Læsehest2");
		Kunde kunde3 = new Kunde("Læsehest3");

		bogtitel2.etKoeb(kunde1);
		bogtitel2.etKoeb(kunde2);
		bogtitel2.etKoeb(kunde3);

		bogtitel1.etKoeb(kunde1);
		bogtitel1.etKoeb(kunde2);
		bogtitel1.etKoeb(kunde3);

	}
}
