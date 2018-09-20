package opgave5;

import java.util.ArrayList;

public class Indkøbskurv {
	ArrayList<Vare> vareList = new ArrayList<Vare>();

	public Indkøbskurv() {
		// TODO Auto-generated constructor stub
	}

	public void addVare(Vare vare) {
		// TODO Auto-generated method stub
		vareList.add(vare);
	}

	public void removeVare(Vare vare) {
		// TODO Auto-generated method stub
		vareList.remove(vare);
	}

	public double getTotalPrice() {
		// TODO Auto-generated method stub
		double price = 0;
		for (Vare vare : vareList) {
			price += vare.getPricePlusVAT();
		}
		return price;
	}

	public void printReceipt() {
		System.out.println("Her er dit køb");
		for (Vare vare : vareList) {
			System.out.println(vare.getName() + "\t" + vare.getPricePlusVAT());
		}
	}
}
