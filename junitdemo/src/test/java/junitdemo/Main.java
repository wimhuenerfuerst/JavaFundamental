package junitdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("junitdemo");
		//InterfaceA interfaceA = ctx.getBean(InterfaceA.class);
		InterfaceA interfaceA = ctx.getBean("beanA", InterfaceA.class);
		interfaceA.test();
		InterfaceA interfaceA2 = ctx.getBean("beanA", InterfaceA.class);
		interfaceA2.test();
	}
}
