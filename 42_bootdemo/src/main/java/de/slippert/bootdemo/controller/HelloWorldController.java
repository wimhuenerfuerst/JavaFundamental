package de.slippert.bootdemo.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import de.slippert.bootdemo.controller.dto.UserDto;
import de.slippert.bootdemo.controller.dto.UserDtoMapper;
import de.slippert.bootdemo.db.User;
import de.slippert.bootdemo.db.UserRepo;

@RestController
@RequestMapping("/controller1")
public class HelloWorldController {

	@Autowired
	UserRepo userRepo;

	@GetMapping(value = "/hello")
	// @RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String hello(@RequestParam(value = "name1", required = false) String name1,
			@RequestParam(value = "name2", required = false) String name2) {
		return String.format("Hello %s, %s!", name1, name2);
	}

	@PostMapping(value = "/users")
	public ResponseEntity<Void> createUser(@RequestBody UserDto userDto, HttpServletRequest httpServletRequest) {

		User user = UserDtoMapper.mapUsersDto(userDto);

		userRepo.save(user);

		URI uri = ServletUriComponentsBuilder.fromServletMapping(httpServletRequest)
				.path("/controller1/users/" + user.getId()).build().toUri();

		return ResponseEntity.created(uri).build();
	}

	@GetMapping("/users")
	public ResponseEntity<List<UserDto>> listUsers() {
		List<UserDto> userDtos = new ArrayList<UserDto>();

		for (User user : userRepo.findAll()) {
			userDtos.add(UserDtoMapper.mapUserWithoutPassword(user));
		}

		return ResponseEntity.ok(userDtos);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<UserDto> getUser(@PathVariable(value = "id") long id) {

		UserDto userDto = UserDtoMapper.mapUserWithoutPassword(userRepo.findById(id).get());

		return ResponseEntity.ok(userDto);
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable(value = "id") long id) {
		User user = userRepo.findById(id).get();
		userRepo.delete(user);
		
		return ResponseEntity.noContent().build();
	}

	@PutMapping(value = "/users/{id}")
	public ResponseEntity<UserDto> updateUser(@PathVariable(value = "id") long id, @RequestBody UserDto userDto) {

		User user = userRepo.findById(id).get();

		user.setFirstname(userDto.getFirstname());
		user.setLastname(userDto.getLastname());
		user.setPassword(userDto.getPassword());

		userRepo.save(user);

		return ResponseEntity.ok(UserDtoMapper.mapUser(user));
	}
}
