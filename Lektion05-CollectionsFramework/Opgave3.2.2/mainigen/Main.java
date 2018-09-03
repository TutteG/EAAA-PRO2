package mainigen;

import treeset.Skole;
import treeset.Studerende;

public class Main {
	public static void main(String[] args) {
		Skole skole = new Skole("Erhvervsakademi Aarhus");
		Studerende studerende1 = new Studerende("Michael", 1);
		Studerende studerende2 = new Studerende("Peter", 3);
		Studerende studerende3 = new Studerende("Kennet", 71);
		Studerende studerende4 = new Studerende("Oscar", 11);
		Studerende studerende5 = new Studerende("Tom", 13);
		Studerende studerende6 = new Studerende("Daniel", 21);
		studerende1.addKarakter(12);
		studerende1.addKarakter(10);
		studerende1.addKarakter(7);
		studerende1.addKarakter(10);
		studerende1.addKarakter(2);
		studerende1.addKarakter(0);
		studerende1.addKarakter(12);

		studerende2.addKarakter(12);
		studerende2.addKarakter(10);
		studerende2.addKarakter(7);
		studerende2.addKarakter(10);
		studerende2.addKarakter(2);
		studerende2.addKarakter(0);
		studerende2.addKarakter(12);

		studerende3.addKarakter(12);
		studerende3.addKarakter(10);
		studerende3.addKarakter(7);
		studerende3.addKarakter(10);
		studerende3.addKarakter(2);
		studerende3.addKarakter(0);
		studerende3.addKarakter(12);

		studerende4.addKarakter(12);
		studerende4.addKarakter(10);
		studerende4.addKarakter(7);
		studerende4.addKarakter(10);
		studerende4.addKarakter(2);
		studerende4.addKarakter(0);
		studerende4.addKarakter(12);

		studerende5.addKarakter(12);
		studerende5.addKarakter(10);
		studerende5.addKarakter(7);
		studerende5.addKarakter(10);
		studerende5.addKarakter(2);
		studerende5.addKarakter(0);
		studerende5.addKarakter(12);

		studerende6.addKarakter(12);
		studerende6.addKarakter(10);
		studerende6.addKarakter(7);
		studerende6.addKarakter(10);
		studerende6.addKarakter(2);
		studerende6.addKarakter(0);
		studerende6.addKarakter(12);

		skole.addStuderende(studerende1);
		skole.addStuderende(studerende2);
		skole.addStuderende(studerende3);
		skole.addStuderende(studerende4);
		skole.addStuderende(studerende5);
		skole.addStuderende(studerende6);

		System.out.println(skole);
		System.out.println("Gennemsnit: " + skole.gennemsnit());
		System.out.println("Get studieNr 21: " + skole.findStuderende(21));
	}
}
