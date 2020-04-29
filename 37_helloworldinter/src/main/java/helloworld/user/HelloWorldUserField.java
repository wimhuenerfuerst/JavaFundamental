package helloworld.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import helloworld.service.HelloWorldService;

@Component
public class HelloWorldUserField {

	@Autowired
	@Qualifier("english")
	HelloWorldService english;

	@Autowired
	@Qualifier("french")
	HelloWorldService french;

	@Autowired
	@Qualifier("german")
	HelloWorldService german;

	@Autowired
	@Qualifier("spanish")
	HelloWorldService spanish;

	@Autowired
	@Qualifier("anonyomous")
	HelloWorldService anonyomous;

	@Autowired
	@Qualifier("properties")
	HelloWorldService properties;

	public void callAll() {
		
		System.out.println("***   " + getClass().getSimpleName() + "   ***");
		
		
		english.helloWorld();
		french.helloWorld();
		german.helloWorld();
		spanish.helloWorld();
		anonyomous.helloWorld();
		properties.helloWorld();
	}

}
