package Heaps_and_hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

import Heaps_and_hashMap.merge_k_sorted_lists.ListNode;

public class sort_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		
		int ref = sc.nextInt();
		int count = sc.nextInt();
		
		for (int i = 0; i<count; i++) {
			map.put(sc.next(), sc.nextInt());
		}
		
        ans(map, ref);		

	}
	
	public static void ans(HashMap<String, Integer> map, int ref) {
		int max = 100;
		
		ArrayList<Integer> ll = new ArrayList<>();
		
		for (String a: map.keySet()) {
			if (map.get(a)>ref) {
				ll.add(map.get(a));
				System.out.println(a + " " + map.get(a));
			}
		}
				
		
		
	}

}
