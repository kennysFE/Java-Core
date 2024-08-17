package Lab12;

import java.util.PriorityQueue;

public class Stack {
	public static void main(String[] args) {
		// Queue
		// Khai bao mot queue, firt in firt out
		PriorityQueue<String> queue = new PriorityQueue<>();

		// Them value

		queue.offer("a1"); // Tuong tu nhu ham add hay ham put trong HashMap
		queue.offer("a2");
		queue.offer("a3");

		// Lay value theo tuan tu

		System.out.println(queue.poll());// a1
		System.out.println(queue.poll());// a2
		System.out.println(queue.poll());// a3
	}
}
