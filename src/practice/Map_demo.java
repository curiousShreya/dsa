package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		//add
		map.put("Raj", 98);
		map.put("Anku", 50);
		map.put("Shahshi", 27);
		map.put("Neha", 78);
		map.put("Shalu", 88);
		System.out.println(map);
		
		//get
		System.out.println(map.get("Neha"));
		
		//containsKey
		System.out.println(map.containsKey("Ankss"));
		
		//remove
		System.out.println(map.remove("Raj"));
		
		System.out.println(map);
		
		System.out.println(map.size());
		
		
		TreeMap<String, Integer> map1 = new TreeMap<>();
		
		map1.put("Shreya", 99);
		map1.put("Ravi", 88);
		map1.put("Crane", 89);
		map1.put("Sneha", 85);
		
		System.out.println(map1);
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Ram", 100);
		map2.put("Rahim", 90);
		map2.put("Shyam", 92);
		map2.put("ABram", 50);
		System.out.println(map2);
		System.out.println(map2.get("Shams"));
		System.out.println(map2.containsKey("Ram"));
		
		

	}

}
