package de.slippert.bootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.slippert.bootdemo.db.User;
import de.slippert.bootdemo.db.UserRepo;

@RestController
public class HelloWorldController {

	@Autowired
	UserRepo userRepo;

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@PostMapping("/users")
	public User createUser(User user) {

		userRepo.save(user);

		return user;
	}

	@GetMapping("/users")
	public Iterable<User> listUsers() {
		return userRepo.findAll();
	}

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable("id") long id) {
		return userRepo.findById(id).get();
	}
}
