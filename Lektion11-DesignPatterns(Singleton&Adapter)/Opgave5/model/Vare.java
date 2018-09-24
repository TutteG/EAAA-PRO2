package model;

public abstract class Vare {
	private int price;
	private String name;

	public Vare(int price, String name) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract double beregnMoms();
}
