package Heaps_and_hashMap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class kth_largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int num = sc.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(largest_num(arr, num));
		

	}
	
	public static int largest_num(int[] arr, int num) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i = 0; i<num; i++) {
			pq.add(arr[i]);
		}
		
		for (int j = num; j<arr.length; j++) {
			if (arr[j] > pq.peek()) {
				pq.remove();
				pq.add(arr[j]);
			}
		}
		return pq.peek();
	}

}
