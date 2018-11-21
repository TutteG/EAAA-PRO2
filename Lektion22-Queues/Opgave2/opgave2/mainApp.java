package opgave2;

public class mainApp {
	public static void main(String[] args) {
		Dequeue d = new Dequeue();
		d.addLast("Arnold");
		d.addLast("Jens");
		d.addLast("Else");
		d.addLast("Kennet");
		d.addLast("Laila");
		System.out.println(d.isEmpty() + " " + d.size());
		System.out.println(d);
		d.addFirst("Klodshans");
		System.out.println(d);
		d.removeFirst();
		d.removeFirst();
		System.out.println(d);
		d.removeLast();
		System.out.println(d);
		System.out.println(d.isEmpty() + " " + d.size());
		while (!d.isEmpty()) {
			d.removeLast();
		}
		System.out.println(d.isEmpty() + " " + d.size());

	}
}
