package model;

public class FoedeVare extends Vare {
	public FoedeVare(int price, String name) {
		// TODO Auto-generated constructor stub
		super(price, name);
	}

	@Override
	public double beregnMoms() {
		// TODO Auto-generated method stub
		return (getPrice() / 100.0) * 5.0;
	}
}
