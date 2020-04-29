package helloworld.service;

import org.springframework.stereotype.Component;

@Component("english")
public class EnglishHelloWorldService implements HelloWorldService {

	public void helloWorld() {
		System.out.println("Hello World");
	}

}
