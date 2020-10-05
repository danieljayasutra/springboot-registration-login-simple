package com.kangdan.registration.service;

import java.util.Arrays;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.kangdan.registration.controller.dto.UserRegistrationDto;
import com.kangdan.registration.model.Role;
import com.kangdan.registration.model.User;
import com.kangdan.registration.repository.UserRepository;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User findByEmail(String email) {

		return userRepository.findByEmail(email);
	}

	@Override
	public User save(UserRegistrationDto userRegistrationDto) {
		
		User user = new User();
		BeanUtils.copyProperties(userRegistrationDto, user);
		
		user.setRoles(Arrays.asList(new Role("ROLE_USER")));
		
		return null;
	}

}
