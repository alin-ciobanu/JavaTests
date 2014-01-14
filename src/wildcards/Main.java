package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Animal> animalList = new ArrayList<Animal>();
		List<SpecialDog> specialDogList = new ArrayList<SpecialDog>();

		Testing.add(animalList);

		// this will result in a compile error:
		// Testing.add(specialDogList); // compile error
		// you need to pass a List<? super Dog>

	}

}


class Testing {

	public static void add (List<? super Dog> list) {
		list.add(new Dog());
		list.add(new SpecialDog());
		// only dogs and subtypes of dog can be added in this list

		// don't try these:
		// list.add(new Object()); // compile error
		/*
		list.add(new AbstractAnimal() {

			@Override
			public void makeSound() {
				System.out.println("MOO");
			}
		}); */// compile error - AbstractAnimal is a supertype of Dog, can't add

	}

}
