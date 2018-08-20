package rectangle;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		if (width == 1) {
			return height;
		} else if (width < 1) {
			return 0;
		} else {
			Rectangle smallerRectangle = new Rectangle(width - 1, height);
			int smallerArea = smallerRectangle.getArea();
			return smallerArea + height;
		}
	}
}
