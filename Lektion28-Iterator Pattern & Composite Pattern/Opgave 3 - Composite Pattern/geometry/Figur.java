package geometry;

public abstract class Figur {
	public String name;

	public Figur(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void draw() {
		System.out.println(getName());
	};

	public double getArea() {
		return 0;
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
