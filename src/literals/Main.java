package literals;

public class Main {

	public static void main(String[] args) {
		
		int i = 1111111111;
		
//		float f = 14.3;
		
		char c = 61;
		
		byte b = (byte) 128;
		
		System.out.println(b);
		
		String s = "test";
		String t = s;
		
		t.toUpperCase(); // String is immutable
		
		System.out.println(s);
		System.out.println(t);
		
	}
	
}
