package practice;

public class String_vs_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder_demo();

	}
	
	public static void String_demo() {
		String s = "";
		for (int i = 0; i<1000000; i++) {
			s += i;
		}
		
		System.out.println(s);
	}
	
	public static void StringBuilder_demo() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i<1000000; i++) {
			s.append(i);
		}
		System.out.println(s);
	}
	
	

}
