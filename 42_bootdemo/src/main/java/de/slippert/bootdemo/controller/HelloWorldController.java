package de.slippert.bootdemo.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import de.slippert.bootdemo.controller.dto.UserDto;
import de.slippert.bootdemo.controller.dto.UserDtoMapper;
import de.slippert.bootdemo.db.User;
import de.slippert.bootdemo.db.UserRepo;

@RestController
@RequestMapping("/controller1")
public class HelloWorldController {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

	@Autowired
	UserRepo userRepo;

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

		Optional<User> optional = userRepo.findById(id);
		
		throw new RuntimeException("Test");

		/*return optional.map(UserDtoMapper::mapUserWithoutPassword)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());*/
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable(value = "id") long id) {

		Optional<User> optional = userRepo.findById(id);

		if (optional.isPresent()) {
			User user = optional.get();
			userRepo.delete(user);
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.notFound().build();
	}

	@PutMapping(value = "/users/{id}")
	public ResponseEntity<UserDto> updateUser(@PathVariable(value = "id") long id, @RequestBody UserDto userDto) {

		Optional<User> optional = userRepo.findById(id);
		if (optional.isPresent()) {

			User user = optional.get();

			user.setFirstname(userDto.getFirstname());
			user.setLastname(userDto.getLastname());
			user.setPassword(userDto.getPassword());

			userRepo.save(user);

			return ResponseEntity.ok(UserDtoMapper.mapUser(user));
		}

		return ResponseEntity.notFound().build();
	}
}
