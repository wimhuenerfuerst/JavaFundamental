package helloworld.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import helloworld.service.HelloWorldService;

@Component
public class HelloWorldUserFieldList {

	@Autowired
	List<HelloWorldService> helloWorldServices;
	
	public void callAll() {
		
		System.out.println("***   " + getClass().getSimpleName() + "   ***");
		
		
		helloWorldServices.stream().forEach(s -> s.helloWorld());
	}

}
