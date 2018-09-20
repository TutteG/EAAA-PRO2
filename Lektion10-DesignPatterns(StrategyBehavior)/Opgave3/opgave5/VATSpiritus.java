package opgave5;

public class VATSpiritus implements IVAT {
	@Override
	public double getPricePlusVAT(double price) {
		if (price <= 90) {
			return price * 1.8;
		} else {
			return price * 2.2;
		}
	}
}
