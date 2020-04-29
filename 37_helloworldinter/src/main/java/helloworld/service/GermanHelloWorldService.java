package helloworld.service;

import org.springframework.stereotype.Component;

@Component("german")
public class GermanHelloWorldService implements HelloWorldService {

	public void helloWorld() {
		System.out.println("Hallo Welt");
	}

}
