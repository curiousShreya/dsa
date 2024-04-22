package Heaps_and_hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(MaxFreq(arr));

	}
	
	public static int MaxFreq(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i<arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		int ans = 0;
		int ansKey = 0;
		
		for (int key: map.keySet()) {
			if (map.get(key) > ans) {
				ans = Math.max(ans, map.get(key));

				ansKey = key;
				
			}
			
		}
		
		return ansKey;
		
		
	}

}
