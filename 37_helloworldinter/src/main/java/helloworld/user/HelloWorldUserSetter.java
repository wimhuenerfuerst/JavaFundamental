package helloworld.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import helloworld.service.HelloWorldService;

@Component
public class HelloWorldUserSetter {

	HelloWorldService english;

	HelloWorldService french;

	HelloWorldService german;

	HelloWorldService spanish;

	HelloWorldService anonyomous;

	HelloWorldService properties;

	@Autowired
	@Qualifier("english")
	public void setEnglish(HelloWorldService english) {
		this.english = english;
	}

	@Autowired
	@Qualifier("french")
	public void setFrench(HelloWorldService french) {
		this.french = french;
	}

	@Autowired
	@Qualifier("german")
	public void setGerman(HelloWorldService german) {
		this.german = german;
	}

	@Autowired
	@Qualifier("spanish")
	public void setSpanish(HelloWorldService spanish) {
		this.spanish = spanish;
	}

	@Autowired
	@Qualifier("anonyomous")
	public void setAnonyomous(HelloWorldService anonyomous) {
		this.anonyomous = anonyomous;
	}

	@Autowired
	@Qualifier("properties")
	public void setProperties(HelloWorldService properties) {
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
