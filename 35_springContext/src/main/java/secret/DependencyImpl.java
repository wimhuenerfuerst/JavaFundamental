package secret;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import springdemo.Dependency;

@Component
public class DependencyImpl implements Dependency {
	
	@Value("${mystring}")
	String text;
	
	@Value("${myint}")
	int number;
	
	public DependencyImpl() {
		System.out.println("building DependencyImpl");
	}

	public void doSomething() {
		System.out.println("stuff " + text + number);
	}
}
