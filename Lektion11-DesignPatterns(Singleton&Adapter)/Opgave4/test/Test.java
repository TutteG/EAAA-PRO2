package test;

import model.Person;
import model.PersonAdministration;

public class Test {
	public static void main(String[] args) {
		Person person1 = new Person("Michael");
		Person person2 = new Person("Michael");
		Person person3 = new Person("Michael");
		Person person4 = new Person("Torben");
		Person person5 = new Person("Michael");
		Person person6 = new Person("Michael");
		Person person7 = new Person("Michael");
		Person person8 = new Person("Michael");

		PersonAdministration.getPersonAdministration().addPerson(person1);
		PersonAdministration.getPersonAdministration().addPerson(person2);
		PersonAdministration.getPersonAdministration().addPerson(person3);
		PersonAdministration.getPersonAdministration().addPerson(person4);
		PersonAdministration.getPersonAdministration().addPerson(person5);
		PersonAdministration.getPersonAdministration().addPerson(person6);
		PersonAdministration.getPersonAdministration().addPerson(person7);
		PersonAdministration.getPersonAdministration().addPerson(person8);

		System.out.println(PersonAdministration.getPersonAdministration().getPersons());
	}
}
