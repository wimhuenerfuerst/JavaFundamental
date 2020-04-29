package helloworld.service;

import org.springframework.stereotype.Component;

@Component("spanish")
public class SpanishHelloWorldService implements HelloWorldService {

	public void helloWorld() {
		System.out.println("Hola mundo");
	}

}
