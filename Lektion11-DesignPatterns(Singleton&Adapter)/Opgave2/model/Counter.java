package model;

public class Counter {
	public int value;
	private static Counter uniqueCounter;

	private Counter() {
		// TODO Auto-generated constructor stub
		this.value = 0;
	}

	public static Counter getCounter() {
		if (uniqueCounter == null) {
			uniqueCounter = new Counter();
		}
		return uniqueCounter;
	}

	public void count() {
		value++;
	}

	public void times2() {
		value *= 2;
	}

	public void zero() {
		value = 0;
	}

	public int getValue() {
		return value;
	}

}
