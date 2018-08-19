package application.model;

public class Triangle {
	private int width;

	public Triangle(int width) {
		// TODO Auto-generated constructor stub
		this.width = width;
	}

	public int getArea() {
		// TODO Auto-generated method stub
		if (width <= 0) {
			return 0;
			// } else if (width == 1) {
			// return 1;
		} else {
			Triangle smallerTriangle = new Triangle(width - 1);
			int smallerArea = smallerTriangle.getArea();
			return smallerArea + width;
		}
	}
}
