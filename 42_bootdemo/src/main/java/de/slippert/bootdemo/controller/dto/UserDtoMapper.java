package de.slippert.bootdemo.controller.dto;

import de.slippert.bootdemo.db.User;

public final class UserDtoMapper {

	private UserDtoMapper() {

	}

	public static User mapUsersDto(UserDto userDto) {
		User user = new User();

		user.setFirstname(userDto.getFirstname());
		user.setLastname(userDto.getLastname());
		user.setPassword(userDto.getPassword());

		return user;
	}

	public static UserDto mapUser(User user) {
		UserDto userDto = new UserDto();

		userDto.setId(user.getId());
		userDto.setFirstname(user.getFirstname());
		userDto.setLastname(user.getLastname());
		userDto.setPassword(user.getPassword());

		return userDto;
	}

	public static UserDto mapUserWithoutPassword(User user) {
		UserDto userDto = new UserDto();

		userDto.setId(user.getId());
		userDto.setFirstname(user.getFirstname());
		userDto.setLastname(user.getLastname());

		return userDto;
	}
}
