package helloworld.user;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import helloworld.service.HelloWorldService;

@Named
@Scope("prototype")
public class HelloWorldUserField {

	@Inject
	@Named("english")
	HelloWorldService english;

	@Inject
	@Named("french")
	HelloWorldService french;

	public void callAll() {

		System.out.println("***   " + getClass().getSimpleName() + "   ***");

		english.helloWorld();
		french.helloWorld();
	}

}
