package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<Object>();

	}

}


class Testing {

	public static void add (List<? super Dog> list) {
		list.add(new Dog()); // only dogs can be added in this list
	}

}
