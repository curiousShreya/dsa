package Heaps_and_hashMap;

import java.util.HashSet;
import java.util.Scanner;

public class exist_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n!=0) {
			int len = sc.nextInt();
			int[] arr = new int[len];
			
			HashSet<Integer> s = new HashSet<>();
			
			for (int i = 0; i<len; i++) {
				s.add(sc.nextInt());
			}
			
			
			int querySize = sc.nextInt();
			String[] ans = new String[querySize];
			
			for (int j = 0; j<querySize; j++) {
				int query = sc.nextInt();
				ans[j] = DoesExist(query, s);
			}
			
			for (int k = 0; k<ans.length; k++) {
				System.out.println(ans[k]);
			}
			n--;
		}
	}
	
	
	public static String DoesExist(int query, HashSet<Integer> s) {
		if (s.contains(query)) {
			return "Yes";
		} else {
			return "No";
		}
	}

}
