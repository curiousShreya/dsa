package practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> hp = new PriorityQueue<Integer>(Collections.reverseOrder());
		hp.add(5);
		hp.add(7);
		hp.add(10);
		hp.add(2);
		hp.add(4);
		hp.add(6);
		hp.add(1);
		hp.add(8);
		hp.add(-2);
		System.out.println(hp);

	}

}
