package opgave5;

import java.time.LocalDate;

public class IndkøbsApp {
	public static void main(String[] args) {
		Vare vare = new Vare(10.5, "Toiletpapir", "3-lags");
		LocalDate holdbarhed = LocalDate.parse("2018-04-20");
		Vare mælk = new Fødevare(7.5, "Sødmælk", "3,5% fedt", holdbarhed);
		Vare ps4 = new ElArtikel(1500.0, "PS4", "Den med Uncharted", 11.4);
		Vare fernet = new Spiritus(110, "Fernet Mensa", "Fy for satan", 46);

		Indkøbskurv kurv = new Indkøbskurv();
		kurv.addVare(vare);
		kurv.addVare(mælk);
		kurv.addVare(ps4);
		kurv.addVare(fernet);
		System.out.println(kurv.getTotalPrice());
		kurv.printReceipt();
	}
}
