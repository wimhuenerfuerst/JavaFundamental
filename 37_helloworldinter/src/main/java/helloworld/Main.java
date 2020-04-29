package helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import helloworld.user.HelloWorldUserConstructor;
import helloworld.user.HelloWorldUserField;
import helloworld.user.HelloWorldUserFieldList;
import helloworld.user.HelloWorldUserSetter;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("helloworld");
		
		context.getBean(HelloWorldUserField.class).callAll();
		context.getBean(HelloWorldUserSetter.class).callAll();
		context.getBean(HelloWorldUserConstructor.class).callAll();
		context.getBean(HelloWorldUserFieldList.class).callAll();
		
		context.close();
	}

}
