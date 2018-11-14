package opgave3;

import java.util.ArrayList;
import java.util.Collections;

public class mainApp {
	public static void main(String[] args) {
		Person<String> person = new Person<String>("Niels");
		System.out.println(person.getNavn());

		Navn navn = new Navn("Niels", "Christiansen");
		Person<Navn> person2 = new Person<Navn>(navn);
		System.out.println(person2.getNavn());

		Navn navn1 = new Navn("Niels", "Christiansen");
		Navn navn2 = new Navn("Nuller", "Christiansen");
		Navn navn3 = new Navn("Michael", "Christiansen");
		Navn navn4 = new Navn("Niels", "Christiansen");
		Navn navn5 = new Navn("Niels", "Messerschmidt");
		Navn navn6 = new Navn("Alexander", "Christiansen");
		Navn navn7 = new Navn("Peter", "Christiansen");
		Navn navn8 = new Navn("Kennet", "Christiansen");
		Navn navn9 = new Navn("Rasmus", "Christiansen");

		Person<Navn> person3 = new Person<>(navn1);
		Person<Navn> person4 = new Person<>(navn2);
		Person<Navn> person5 = new Person<>(navn3);
		Person<Navn> person6 = new Person<>(navn4);
		Person<Navn> person7 = new Person<>(navn5);
		Person<Navn> person8 = new Person<>(navn6);
		Person<Navn> person9 = new Person<>(navn7);
		Person<Navn> person10 = new Person<>(navn8);
		Person<Navn> person11 = new Person<>(navn9);

		ArrayList<Person<Navn>> personer = new ArrayList<Person<Navn>>();
		personer.add(person3);
		personer.add(person4);
		personer.add(person5);
		personer.add(person6);
		personer.add(person7);
		personer.add(person8);
		personer.add(person9);
		personer.add(person10);
		personer.add(person11);
		System.out.println(personer);

		Collections.sort(personer);
		System.out.println(personer);
	}
}
