package opgave5;

public class Spiritus extends Vare {
	private double percentAlcohol;
	IVAT vat;

	public Spiritus(double price, String name, String description, double percentAlcohol) {
		super(price, name, description);
		// TODO Auto-generated constructor stub
		this.percentAlcohol = percentAlcohol;
		vat = new VATSpiritus();
	}

	public double getPercentAlcohol() {
		return percentAlcohol;
	}

	public void setPercentAlcohol(double percentAlcohol) {
		this.percentAlcohol = percentAlcohol;
	}

	@Override
	public double getPricePlusVAT() {
		return vat.getPricePlusVAT(getPrice());
	}
}
