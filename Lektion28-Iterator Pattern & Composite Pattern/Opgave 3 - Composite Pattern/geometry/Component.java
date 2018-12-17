package geometry;

import java.util.ArrayList;

public class Component<T extends Figur> extends Figur {
	private ArrayList<T> components;

	public Component(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		components = new ArrayList<>();
	}

	public void addFigur(T figur) {
		components.add(figur);
	}

	@Override
	public double getArea() {
		double componentsArea = 0;
		for (T t : components) {

			componentsArea += t.getArea();
		}
		return componentsArea;
	}

	@Override
	public void draw() {
		System.out.println(getName());
		for (T t : components) {
			t.draw();
		}
	}
}
