package practice;

public class HashMap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Rajni", 80);
		map.put("Kanya", 40);
		map.put("Shyam", 70);
		System.out.println(map);
		
		System.out.println(map.get("Kanya"));
		System.out.println(map.remove("Rajni"));
		System.out.println(map);

	}

}
