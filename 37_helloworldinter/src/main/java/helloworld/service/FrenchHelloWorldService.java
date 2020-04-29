package helloworld.service;

import org.springframework.stereotype.Component;

@Component("french")
public class FrenchHelloWorldService implements HelloWorldService {

	public void helloWorld() {
		System.out.println("Bonjour tout le monde");
	}

}
