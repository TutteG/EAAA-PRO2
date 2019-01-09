package model;

import java.util.ArrayList;

public class Abonnement {
	private double mndPris;
	private double minutPris;

	public Abonnement(double mndPris, double minutPris) {
		// TODO Auto-generated constructor stub
		this.mndPris = mndPris;
		this.minutPris = minutPris;
	}

	public double abonnementPris() {
		return mndPris;
	}

	public static double priser(ArrayList<Abonnement> list) {
		double price = 0;
		for (Abonnement abonnement : list) {
			price += abonnement.abonnementPris();
		}
		return price;
	}
}
