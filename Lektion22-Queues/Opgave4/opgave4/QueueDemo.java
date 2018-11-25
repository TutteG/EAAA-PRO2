package opgave4;

import queues.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> q = new StackQueue<String>();
		System.out.println(q.isEmpty() + " " + q.size());

		q.enqueue("Arnold");
		q.enqueue("Sylvester");
		q.enqueue("Clint");
		q.enqueue("Bruce");
		q.enqueue("Dolph");
		q.enqueue("Chuck");
		System.out.println(q.getFront());
		System.out.println(q.isEmpty() + " " + q.size());
		System.out.println();
		while (!q.isEmpty()) {
			System.out.println(q.dequeue());
		}

		System.out.println(q.isEmpty() + " " + q.size());
		System.out.println();
	}
}
