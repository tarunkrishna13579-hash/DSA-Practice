package Heap;

import java.util.PriorityQueue;

public class heap {

	public static void main(String[] args) {
		PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
		pq.add(30);
		pq.add(20);
		pq.add(80);
		pq.add(50);
		pq.add(40);
		pq.add(25);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
	}

}
