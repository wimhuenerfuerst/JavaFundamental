package helloworld.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import helloworld.service.HelloWorldService;

@Component
public class HelloWorldUserConstructor {

	HelloWorldService english;

	HelloWorldService french;

	HelloWorldService german;

	HelloWorldService spanish;

	HelloWorldService anonyomous;

	HelloWorldService properties;

	@Autowired
	public HelloWorldUserConstructor(@Qualifier("english") HelloWorldService english,
			@Qualifier("french") HelloWorldService french, @Qualifier("german") HelloWorldService german,
			@Qualifier("spanish") HelloWorldService spanish, @Qualifier("anonyomous") HelloWorldService anonyomous,
			@Qualifier("properties") HelloWorldService properties) {
		super();
		this.english = english;
		this.french = french;
		this.german = german;
		this.spanish = spanish;
		this.anonyomous = anonyomous;
		this.properties = properties;
	}

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
