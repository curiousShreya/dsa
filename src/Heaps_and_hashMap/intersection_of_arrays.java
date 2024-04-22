package Heaps_and_hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class intersection_of_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		
		for (int i = 0; i<size; i++) {
			arr1[i] = sc.nextInt();
		}
		
		for (int j = 0; j<size; j++) {
			arr2[j] = sc.nextInt();
		}
		
		Intersection(arr1, arr2);

	}
	
	
	public static void Intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i  = 0; i<arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			} else {
				map.put(arr1[i], 1);
			}
		}
		
		ArrayList<Integer> ll = new ArrayList<>();
		
		for (int i = 0; i<arr2.length; i++) {
			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				ll.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i])-1);
			}
		}
		
		int[] ans = new int[ll.size()];
		for (int i = 0; i<ans.length; i++) {
			ans[i] = ll.get(i);
		
		}
		Arrays.sort(ans);
		
		System.out.print("[");
		for (int i = 0; i<ans.length; i++) {
			if (i==ans.length-1) {
				System.out.print(ans[i]);
			} else {
				System.out.print(ans[i] + ", ");
			}
			
		}
		System.out.println("]");
		
		
		
	}

}
