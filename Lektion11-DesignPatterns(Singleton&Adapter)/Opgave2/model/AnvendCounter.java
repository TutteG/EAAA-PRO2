package model;

public class AnvendCounter {
	public static void main(String[] args) {

		Counter counter = Counter.getCounter();
		Counter counter2 = Counter.getCounter();

		System.out.println(Counter.getCounter().getValue());
		Counter.getCounter().count();
		System.out.println(Counter.getCounter().getValue());
		Counter.getCounter().times2();
		System.out.println(Counter.getCounter().getValue());
		Counter.getCounter().zero();
		System.out.println(Counter.getCounter().getValue());

		// why would i do this??? // Too remove warnings..
		counter.count();
		counter2.count();
	}
}
