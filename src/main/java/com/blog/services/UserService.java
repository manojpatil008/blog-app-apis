package com.blog.services;

import java.util.List;

import com.blog.payloads.UserDto;

public interface UserService {

	UserDto registerNewUser(UserDto userDto);
	
	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto userD, Integer userId);
	
	UserDto getUserById(Integer useId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);

}
