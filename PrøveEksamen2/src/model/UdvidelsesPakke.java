package model;

public class UdvidelsesPakke extends TimePakke {
	private double plusPris;

	public UdvidelsesPakke(double mndPris, double minutPris, int frieTimer, double plusPris) {
		// TODO Auto-generated constructor stub
		super(mndPris, minutPris, frieTimer);
		this.plusPris = plusPris;
	}

	@Override
	public double abonnementPris() {
		// TODO Auto-generated method stub
		return plusPris + super.abonnementPris();
	}

}
