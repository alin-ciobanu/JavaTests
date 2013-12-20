package override_boxing_widening_varargs;

public class Alien {

	String invade(short ships) {
		return "a few";
	}

	String invade(short... ships) {
		return "many";
	}
}

class Defender {

	public static void main(String [] args) {

		System.out.println(new Alien().invade((short) 7, (short) 1));

	}

}
