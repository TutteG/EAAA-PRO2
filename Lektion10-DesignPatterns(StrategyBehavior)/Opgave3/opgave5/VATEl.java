package opgave5;

public class VATEl implements IVAT {
	@Override
	public double getPricePlusVAT(double price) {
		double minimum = price * 1.30 - price;
		if (minimum < 3) {
			return price + 3;
		} else {
			return price * 1.30;
		}
	}
}
