package helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import helloworld.user.HelloWorldUserField;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorldUserField worldUserField = context.getBean(HelloWorldUserField.class);
		worldUserField.callAll();
		context.close();		
	}

}
