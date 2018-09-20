package opgave5;

public class VATVare implements IVAT {
	@Override
	public double getPricePlusVAT(double price) {
		return price * 1.25;
	}
}
