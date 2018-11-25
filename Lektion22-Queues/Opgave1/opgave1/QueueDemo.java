package opgave1;

import queues.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> q = new ArrayQueue<String>();
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

		System.out.println("Linkedlist\n");

		Queue<String> ll = new LinkedListQueue<String>();
		System.out.println(ll.isEmpty() + " " + ll.size());
		ll.enqueue("Arne");
		ll.enqueue("Kennet");
		ll.enqueue("Rasmus");
		ll.enqueue("Peter");
		ll.enqueue("Jonas");
		ll.enqueue("Torben");

		System.out.println(ll.getFront());
		System.out.println(ll.isEmpty() + " " + ll.size());

		System.out.println();
		while (!ll.isEmpty()) {
			System.out.println(ll.dequeue());
		}
		System.out.println(ll.isEmpty() + " " + ll.size());
	}
}
