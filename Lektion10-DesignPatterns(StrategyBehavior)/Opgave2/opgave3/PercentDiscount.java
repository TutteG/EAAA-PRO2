package opgave3;

public class PercentDiscount extends Discount {
	private int percent;

	public PercentDiscount(double originalPrice) {
		// TODO Auto-generated constructor stub
		super(originalPrice);
		this.percent = 0;
	}

	public int getPercent() {
		return percent;
	}

	private void setPercent(int percent) {
		this.percent = percent;
	}

	@Override
	public double getDiscountedPrice(double originalPrice) {
		if (originalPrice > 1000) {
			setPercent(25);
		} else {
			setPercent(0);
		}
		double discount = (super.getDiscountedPrice(originalPrice) / 100) * percent;
		return super.getDiscountedPrice(originalPrice) - discount;
	}
}
