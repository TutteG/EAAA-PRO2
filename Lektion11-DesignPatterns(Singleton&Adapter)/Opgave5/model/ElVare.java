package model;

public class ElVare extends Vare {
	public ElVare(int price, String name) {
		// TODO Auto-generated constructor stub
		super(price, name);
	}

	@Override
	public double beregnMoms() {
		// TODO Auto-generated method stub
		double moms = (getPrice() / 100.0) * 30.0;
		if (moms < 3) {
			return 3;
		}
		return moms;
	}
}
