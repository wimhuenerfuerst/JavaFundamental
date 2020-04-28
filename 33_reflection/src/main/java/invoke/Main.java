package invoke;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		InvokeAndReadWrite invokeAndReadWrite = new InvokeAndReadWrite("Test Name", "password123");

		Class<?> clazz = invokeAndReadWrite.getClass();

		for (Field field : clazz.getDeclaredFields()) {
			field.setAccessible(true);

			Object fieldValue = field.get(invokeAndReadWrite);
			System.out.println(fieldValue);
		}

		for (Field field : clazz.getDeclaredFields()) {
			field.setAccessible(true);

			field.set(invokeAndReadWrite, "overridden");
		}

		for (Field field : clazz.getDeclaredFields()) {
			field.setAccessible(true);

			Object fieldValue = field.get(invokeAndReadWrite);
			System.out.println(fieldValue);
		}

		for (Method method : clazz.getDeclaredMethods()) {
			method.setAccessible(true);

			method.invoke(invokeAndReadWrite);
		}

	}

}
