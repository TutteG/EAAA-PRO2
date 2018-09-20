package opgave5;

public class VATFødevare implements IVAT {
	@Override
	public double getPricePlusVAT(double price) {
		// TODO Auto-generated method stub
		return price * 1.05;
	}
}
