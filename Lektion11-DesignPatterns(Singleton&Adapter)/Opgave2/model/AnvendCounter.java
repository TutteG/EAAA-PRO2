package model;

public class AnvendCounter {
	public static void main(String[] args) {

		Counter counter = Counter.getCounter();
		Counter counter2 = counter.getCounter();
		counter2.count();
		// y would i do this???

		System.out.println(Counter.getCounter().getValue());
		Counter.getCounter().count();
		System.out.println(Counter.getCounter().getValue());
		Counter.getCounter().times2();
		System.out.println(Counter.getCounter().getValue());
		Counter.getCounter().zero();
		System.out.println(Counter.getCounter().getValue());
	}
}
