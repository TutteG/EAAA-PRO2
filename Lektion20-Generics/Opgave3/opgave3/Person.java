package opgave3;

public class Person<T extends Comparable<T>> implements Comparable<Person<T>> {
	T navn;

	public Person(T navn) {
		this.navn = navn;
	}

	public T getNavn() {
		return navn;
	}

	@Override
	public int compareTo(Person<T> o) {
		// TODO Auto-generated method stub
		return navn.compareTo(o.getNavn());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + getNavn();
	}
}
