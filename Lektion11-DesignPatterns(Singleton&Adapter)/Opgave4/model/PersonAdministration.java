package model;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministration {
	private Set<Person> persons;
	private static PersonAdministration personAdministration;

	private PersonAdministration() {
		this.persons = new HashSet<Person>();
	}

	public static PersonAdministration getPersonAdministration() {
		if (personAdministration == null) {
			personAdministration = new PersonAdministration();
		}
		return personAdministration;
	}

	public Set<Person> getPersons() {
		return persons;
	}

	public void addPerson(Person p) {
		persons.add(p);
	}

	public void removePerson(Person p) {
		persons.remove(p);
	}
}
