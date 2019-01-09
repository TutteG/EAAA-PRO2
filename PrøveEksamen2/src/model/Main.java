package model;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Abonnement abo = new Abonnement(100, 1);
		TimePakke timeAbo = new TimePakke(100, 1, 50);
		UdvidelsesPakke udvTimeAbo = new UdvidelsesPakke(100, 1, 50, 50);

		ArrayList<Abonnement> abonnementer = new ArrayList<Abonnement>();
		abonnementer.add(abo);
		abonnementer.add(timeAbo);
		abonnementer.add(udvTimeAbo);

		System.out.println("Abopris: \t\t\t\t" + abo.abonnementPris() + " kr");
		System.out.println("timeAboPris: \t\t\t\t" + timeAbo.abonnementPris() + " kr");
		System.out.println("udvTimeAbopris: \t\t\t" + udvTimeAbo.abonnementPris() + " kr");
		System.out.println("Samlet pris for alle abonnementer: \t" + Abonnement.priser(abonnementer) + " kr");
	}
}
