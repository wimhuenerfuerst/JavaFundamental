package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class MyClass {

	@MyAnnotation(value = "TestField", num = 1)
	public String myField;

	protected String myField1;

	private String myField2;

	@MyAnnotation(value = "TestField", num = 2, num2 = 333)
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
			
			System.out.println(Arrays.toString(field.getAnnotations()));
			
			if(field.isAnnotationPresent(MyAnnotation.class)) {
				MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);
				
				System.out.println(myAnnotation);
				System.out.println("value " + myAnnotation.value());
				
				System.out.println("num " + myAnnotation.num());
				System.out.println("num2 " + myAnnotation.num2());
			}
		}

		System.out.println("***");

		for (Field field : MyClass.class.getFields()) {
			System.out.println(field.getName());
			System.out.println(field.getType().getSimpleName());
			System.out.println(Modifier.toString(field.getModifiers()));
			
			System.out.println(Arrays.toString(field.getAnnotations()));
		}
		
		System.out.println("***");

		for (Method method : MyClass.class.getDeclaredMethods()) {
			System.out.println(method.getName());
			System.out.println(method.getReturnType().getSimpleName());
			System.out.println(Modifier.toString(method.getModifiers()));
			
			System.out.println(Arrays.toString(method.getAnnotations()));
		}

		System.out.println("***");

		for (Method method : MyClass.class.getMethods()) {
			System.out.println(method.getName());
			System.out.println(method.getReturnType().getSimpleName());
			System.out.println(Modifier.toString(method.getModifiers()));
			
			System.out.println(Arrays.toString(method.getAnnotations()));
		}
	}
}
