package opgave3;

public class FixedDiscount extends Discount {
	double amount;

	public FixedDiscount(double originalPrice) {
		// TODO Auto-generated constructor stub
		super(originalPrice);
		this.amount = 0;
	}

	private void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	@Override
	public double getDiscountedPrice(double originalPrice) {
		// TODO Auto-generated method stub
		if (originalPrice > 1000) {
			setAmount(250);
		} else {
			setAmount(0);
		}
		return super.getDiscountedPrice(originalPrice) - amount;
	}
}
