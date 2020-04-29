package springdemo;

import org.springframework.stereotype.Component;

@Component
public class DependencyImpl implements Dependency {

	public void doSomething() {
		System.out.println("stuff");
	}
}
