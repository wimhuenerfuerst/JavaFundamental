package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MyClass {

	@MyAnnotation("Test")
	public String myField;

	protected String myField1;

	private String myField2;

	public void m1() {

	}

	protected void m2() {

	}

	private void m3() {

	}

	public static void main(String[] args) {
		for (Field field : MyClass.class.getDeclaredFields()) {
			System.out.println(field.getName());
			System.out.println(field.getType().getSimpleName());
			System.out.println(Modifier.toString(field.getModifiers()));
		}

		System.out.println("***");

		for (Field field : MyClass.class.getFields()) {
			System.out.println(field.getName());
			System.out.println(field.getType().getSimpleName());
			System.out.println(Modifier.toString(field.getModifiers()));
		}
		
		System.out.println("***");

		for (Method method : MyClass.class.getDeclaredMethods()) {
			System.out.println(method.getName());
			System.out.println(method.getReturnType().getSimpleName());
			System.out.println(Modifier.toString(method.getModifiers()));
		}

		System.out.println("***");

		for (Method method : MyClass.class.getMethods()) {
			System.out.println(method.getName());
			System.out.println(method.getReturnType().getSimpleName());
			System.out.println(Modifier.toString(method.getModifiers()));
		}
	}
}
