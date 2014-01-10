package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class SuperClass {

	private void toBeOverriden() {

		System.out.println("In super class.");

	}

}

class ImplClass extends SuperClass {

	public void toBeOverriden() {

		System.out.println("In sub class.");

	}

}

class Main {

	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		SuperClass object = new ImplClass();

		Class<SuperClass> c = SuperClass.class;
		Method method = c.getDeclaredMethod("toBeOverriden");
		method.setAccessible(true);
		method.invoke(object);

	}
}