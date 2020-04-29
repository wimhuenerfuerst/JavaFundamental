package helloworld.service;

import javax.inject.Named;

@Named("english")
public class EnglishHelloWorldService implements HelloWorldService {

	public void helloWorld() {
		System.out.println("Hello World");
	}

}
