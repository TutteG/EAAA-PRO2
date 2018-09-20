package opgave5;

public class ElArtikel extends Vare {
	private double averagePowerConsumptionPerHour;
	IVAT vat = new VATEl();

	public ElArtikel(double price, String name, String description, double averagePowerConsumptionPerHour) {
		super(price, name, description);
		this.averagePowerConsumptionPerHour = averagePowerConsumptionPerHour;
		vat = new VATEl();
	}

	public double getAveragePowerConsumptionPerHour() {
		return averagePowerConsumptionPerHour;
	}

	public void setAveragePowerConsumptionPerHour(double averagePowerConsumptionPerHour) {
		this.averagePowerConsumptionPerHour = averagePowerConsumptionPerHour;
	}

	@Override
	public double getPricePlusVAT() {
		return vat.getPricePlusVAT(getPrice());
	}
}
