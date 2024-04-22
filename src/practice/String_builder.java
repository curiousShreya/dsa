package practice;

public class String_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append("Hii");
		sb.append(1);
		sb.append('t');
//		System.out.println(sb.capacity());
//		System.out.println(sb.length());
		System.out.println(sb);
		
		System.out.println(sb.charAt(1));
		System.out.println(sb.substring(4));
		System.out.println(sb.substring(4, 7));
		 System.out.println(sb.reverse());
		System.out.println(sb);

	}

}
