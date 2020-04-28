package orm;

import java.lang.reflect.Field;

import reflection.MyClass;

public class Main {

	public static void printTable(Class<?> clazz) {
		if (clazz.isAnnotationPresent(Table.class)) {
			Table anno = clazz.getAnnotation(Table.class);
			System.out.println("Class " + clazz.getSimpleName() + " is mapped to " + anno.value());

		}
	}

	public static void printColumns(Class<?> clazz) {

		for (Field field : clazz.getDeclaredFields()) {
			if (field.isAnnotationPresent(Column.class)) {
				Column anno = field.getAnnotation(Column.class);
				System.out.println("Field " + field.getName() + " is mapped to " + anno.value());
			}
		}
	}

	public static void main(String[] args) {
		printTable(Person.class);
		printColumns(Person.class);

		System.out.println("***");

		printTable(Address.class);
		printColumns(Address.class);
		
		System.out.println("***");

		printTable(MyClass.class);
		printColumns(MyClass.class);
	}

}
