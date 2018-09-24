package model;

public class Spiritus {
	private int prisen;
	private String betegnelse;

	public Spiritus(int prisen, String betegnelse) {
		// TODO Auto-generated constructor stub
		this.prisen = prisen;
		this.betegnelse = betegnelse;
	}

	public String getBetegnelse() {
		return betegnelse;
	}

	public int getPrisen() {
		return prisen;
	}

	public void setBetegnelse(String betegnelse) {
		this.betegnelse = betegnelse;
	}

	public void setPrisen(int prisen) {
		this.prisen = prisen;
	}

	public double hentMoms() {
		// TODO Auto-generated method stub
		if (getPrisen() < 90) {
			return (getPrisen() / 100.0) * 80.0;
		} else {
			return (getPrisen() / 100.0) * 120.0;
		}
	}
}
