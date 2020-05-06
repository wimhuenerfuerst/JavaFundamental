package de.slippert.bootdemo.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.slippert.bootdemo.db.User;
import de.slippert.bootdemo.db.UserRepo;

@RestController
@RequestMapping("/website")
public class WebsiteController {

	@Autowired
	UserRepo userRepo;

	@Value("classpath:form.html")
	Resource form;

	@GetMapping("/hello")
	public String hello() throws IOException, URISyntaxException {

		String content = new String(
				Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("test.html").toURI())));
		return content;
	}

	@GetMapping("/hello2")
	public String hello2(@RequestParam("name") String name) {

		StringBuilder sb = new StringBuilder();

		sb.append("<!DOCTYPE html>");
		sb.append("<html lang='de'>");
		sb.append("<head>");
		sb.append("<meta charset='utf-8' />");
		sb.append("<title>Titel</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>Das ist meine erste Webseite</h1>");

		for (User user : userRepo.findAll()) {
			sb.append("<h2>Hallo " + user.getFirstname() + "</h2>");
		}

		sb.append("<h2>Hallo " + name + "</h2>");

		sb.append("</body>");
		sb.append("</html>");

		return sb.toString();
	}

	@GetMapping("/form")
	public String form() throws IOException, URISyntaxException {

		String content = new String(Files.readAllBytes(Paths.get(form.getURI())));
		return content;
	}

	@GetMapping("/action")
	public String action(@RequestParam("fname") String firstname, @RequestParam("lname") String lastname) {
		User user = new User();

		user.setFirstname(firstname);
		user.setLastname(lastname);

		userRepo.save(user);

		return "User created";
	}
}
