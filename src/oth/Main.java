package oth;

class Pair {
	
	public int x, y;
	
	@Override
	public String toString() {
		return x + " " + y;
	}
	
}

public class Main {

	public static void main(String[] args) {
		

		Pair p = new Pair();
		p.x = 10;
		p.y = 12;
		
		Pair p1 = p;
		Pair p2 = p;
		
		System.out.println(p1 == p2);
		System.out.println(p2);
		
		p1.x = 14;
		
		System.out.println(p1 == p2);
		System.out.println(p2);
		System.out.println(p);
		
	}
	
}
