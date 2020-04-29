package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("springdemo");
		
		DependencyUser dependencyUser1 = context.getBean(DependencyUser.class);
		DependencyUser dependencyUser2 = context.getBean(DependencyUser.class);
		
		//System.out.println(dependencyUser1);
		//System.out.println(dependencyUser2);		
		
		//Dependency dependency = context.getBean("dependencyImpl", Dependency.class);
		
		//dependency = (Dependency) context.getBean("dependencyImpl");
		
		//System.out.println(dependency);
		//dependency.doSomething();
		
		dependencyUser1.test();
		
		context.close();		
	}

}
