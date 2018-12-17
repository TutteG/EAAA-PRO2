package geometry;

public class Main {
	public static void main(String[] args) {
		Figur firkant1 = new Leaf("En stor firkant", 100);
		Figur firkant2 = new Leaf("En mindre stor firkant", 90);
		Figur firkant3 = new Leaf("En endnu mindre stor firkant", 50);
		Figur firkant4 = new Leaf("En meget stor firkant", 200);

		Component<Figur> samletFirkant = new Component<Figur>("En masse firkanter");
		samletFirkant.addFigur(firkant1);
		samletFirkant.addFigur(firkant2);
		samletFirkant.addFigur(firkant3);
		samletFirkant.addFigur(firkant4);

		samletFirkant.draw();
		System.out.println(samletFirkant.getArea());
		Component<Figur> trekanter = new Component<Figur>("Et par trekanter");
		Figur trekant1 = new Leaf("En stor trekant", 200);
		Figur trekant2 = new Leaf("En mindre firkant", 50);

		trekanter.addFigur(trekant1);
		trekanter.addFigur(trekant2);
		System.out.println();
		System.out.println("Tegn trekanter");
		trekanter.draw();

		samletFirkant.addFigur(trekanter);
		System.out.println();
		System.out.println("Tegn firkanter og trekanter");
		samletFirkant.draw();
		System.out.println(samletFirkant.getArea());
	}
}
