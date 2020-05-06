package de.slippert.bootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import de.slippert.bootdemo.db.UserRepo;

@Controller
@RequestMapping("/template")
public class TemplateController {
	
	@Autowired
	UserRepo userRepo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam("pname") String pname, Model model) {
		model.addAttribute("name", pname);
		
		return "greeting";
	}
	
	@GetMapping("/users")
	public String users(Model model) {		
		
		model.addAttribute("users", userRepo.findAll());
		
		return "table";
	}

}
