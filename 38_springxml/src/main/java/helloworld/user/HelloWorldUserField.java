package helloworld.user;

import helloworld.service.HelloWorldService;

public class HelloWorldUserField {

	HelloWorldService english;

	HelloWorldService french;

	HelloWorldService german;

	public void callAll() {

		System.out.println("***   " + getClass().getSimpleName() + "   ***");

		english.helloWorld();
		french.helloWorld();
		german.helloWorld();
	}

	public void setEnglish(HelloWorldService english) {
		this.english = english;
	}

	public void setFrench(HelloWorldService french) {
		this.french = french;
	}

	public void setGerman(HelloWorldService german) {
		this.german = german;
	}

}
