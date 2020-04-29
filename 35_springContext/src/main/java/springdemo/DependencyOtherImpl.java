package springdemo;

import org.springframework.stereotype.Component;

@Component("myDependency")
public class DependencyOtherImpl implements Dependency {

	public void doSomething() {
		System.out.println("other stuff");
	}
}
