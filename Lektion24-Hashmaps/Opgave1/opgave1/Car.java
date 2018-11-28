package opgave1;

public class Car {
	private String registration;
	private String brand;
	private String model;
	private Colour colour;

	public Car(String registration, String brand, String model, Colour colour) {
		// TODO Auto-generated constructor stub
		this.registration = registration;
		this.brand = brand;
		this.model = model;
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public Colour getColour() {
		return colour;
	}

	public String getModel() {
		return model;
	}

	public String getRegistration() {
		return registration;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Car) {
			Car car = (Car) obj;
			if (registration.equals(car.getRegistration()) && brand.equals(car.getBrand())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return registration.hashCode() + brand.hashCode();
	}

	@Override
	public String toString() {
		return brand + ", " + model + " - " + colour + " RegistreringsNr: " + registration + "\n";
	}
}
