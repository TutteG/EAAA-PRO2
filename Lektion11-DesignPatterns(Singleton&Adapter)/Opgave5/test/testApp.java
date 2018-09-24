package test;

import model.ElVare;
import model.FoedeVare;
import model.Spiritus;
import model.SpiritusAdapter;

public class testApp {
	public static void main(String[] args) {
		ElVare elVare = new ElVare(11, "LED-Pære");
		System.out.println(elVare.beregnMoms());
		FoedeVare foedeVare = new FoedeVare(11, "Et Stort Æble");
		System.out.println(foedeVare.beregnMoms());

		Spiritus spiritus = new Spiritus(21, "Slavevodka");
		SpiritusAdapter spiritusAdapter = new SpiritusAdapter(spiritus);
		System.out.println(spiritusAdapter.beregnMoms());
	}
}
