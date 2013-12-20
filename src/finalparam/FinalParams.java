package finalparam;

public class FinalParams {

	public static void testFinalParam (Pair p) {
		p = new Pair(3, 3);
	}

	public static void testInteger(Integer i) {
		i = new Integer(22);
	}

	public static void main(String[] args) {
		Pair p = new Pair(1, 0);
		FinalParams.testFinalParam(p);
		System.out.println(p);

		Integer i = new Integer(1);
		FinalParams.testInteger(i);
		System.out.println(i);
	}

}

class Pair {

	int x, y;

	public Pair(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + " " + y;
	}

}
