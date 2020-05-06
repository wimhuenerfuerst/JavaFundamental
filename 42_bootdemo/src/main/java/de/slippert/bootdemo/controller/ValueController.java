package de.slippert.bootdemo.controller;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/value")
public class ValueController {

	@Value("${myproperty}")
	String myproperty;

	@Autowired
	@Qualifier("systemProperties")
	Properties properties;

	@GetMapping("/get")
	public String getValue() {
		return myproperty;
	}

	@GetMapping("/get1")
	public String getValue(@Value("${myproperty}") String prop) {
		return prop;
	}

	@GetMapping("/user")
	public String getUser(@Value("${user.name}") String user) {
		return user;
	}

	@GetMapping("/user1")
	public String getUser1() {
		return properties.getProperty("user.name");
	}
	
	@GetMapping("/user2")
	public String getUser2(@Value("#{systemProperties['user.name']}") String user) {
		return user;
	}
}
