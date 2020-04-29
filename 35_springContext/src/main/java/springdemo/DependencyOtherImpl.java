package springdemo;

import org.springframework.stereotype.Component;

@Component("myDependency")
public class DependencyOtherImpl implements Dependency {
	
	public DependencyOtherImpl() {
		System.out.println("building myDependency");
	}

	public void doSomething() {
		System.out.println("other stuff");
	}
}
