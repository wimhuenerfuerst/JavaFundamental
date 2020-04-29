package helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import helloworld.user.HelloWorldUserField;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("helloworld");
		
		context.getBean(HelloWorldUserField.class).callAll();
		
		System.out.println(context.getBean(HelloWorldUserField.class));
		System.out.println(context.getBean(HelloWorldUserField.class));
		
		context.close();
	}

}
