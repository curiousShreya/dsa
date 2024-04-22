package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(2);
		set.add(100);
		set.add(170);
		set.add(57);
		set.add(89);
		
		System.out.println(set);
		
		//contains
		System.out.println(set.contains(1000));
		
//		System.out.println(set.remove(57));
		System.out.println(set);
		
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(20);
		set1.add(110);
		set1.add(160);
		set1.add(53);
		set1.add(86);
		
		System.out.println(set1);
		
		//contains
		System.out.println(set1.contains(1000));
		
		System.out.println(set1.remove(53));
		System.out.println(set1);
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(20);
		set2.add(110);
		set2.add(160);
		set2.add(53);
		set2.add(86);
		
		System.out.println(set2);
//		
//		for  (int v: set) {
//			System.out.println(v + " ");
//		}

		
	}

}
