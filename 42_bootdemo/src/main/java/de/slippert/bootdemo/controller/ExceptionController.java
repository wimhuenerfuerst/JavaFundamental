package de.slippert.bootdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import de.slippert.bootdemo.controller.exception.MyCustomException;

@Controller
public class ExceptionController {

	@GetMapping(value = "/exception")
	public ResponseEntity<Void> exception() {
		throw new MyCustomException("12345", "Testing Exceptions");
	}
}
