package opgave3;

public class mainApp {
	public static void main(String[] args) {
		CircularList<Person> cl = new CircularList<Person>();
		cl.enqueue(new Person("Jens"));
		cl.enqueue(new Person("Kennet"));
		cl.enqueue(new Person("Rasmus"));
		cl.enqueue(new Person("Jonas"));
		cl.enqueue(new Person("Alex"));
		cl.enqueue(new Person("Peter"));
		cl.enqueue(new Person("Torben"));
		cl.enqueue(new Person("Bob"));

		System.out.println(cl);

		System.out.println(cl.dequeue());
		System.out.println(cl);

		System.out.println(cl.pickRandom(7));
		System.out.println(cl);
		System.out.println(cl.pickRandom(2, 7));
	}
}
