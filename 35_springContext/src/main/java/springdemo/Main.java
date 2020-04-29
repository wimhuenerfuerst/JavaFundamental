package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("springdemo");
		DependencyUser dependencyUser = context.getBean(DependencyUser.class);
		
		dependencyUser.test();
		
		context.close();		
	}

}
