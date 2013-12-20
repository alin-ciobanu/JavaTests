package constructor;

public class SubClass extends UberClass {
	
	int i;
	{ i = 6; }
	
	public SubClass () {
		// compile error
		// Implicit super constructor is undefined. Must explicitly invoke another constructor.
		super(1, 2);
		System.out.println("This is the SubClass contructor with no params.");
		System.out.println("i = " + i);
	}
	
	public int getI () {
		return i;
	}

	public static void main(String[] args) {
		
		SubClass s;
		s = new SubClass();
		System.out.println(s.getI());
		
	}
	
}
