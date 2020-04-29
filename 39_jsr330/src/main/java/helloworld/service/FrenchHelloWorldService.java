package helloworld.service;

import javax.inject.Named;

@Named("french")
public class FrenchHelloWorldService implements HelloWorldService {

	public void helloWorld() {
		System.out.println("Bonjour tout le monde");
	}

}
