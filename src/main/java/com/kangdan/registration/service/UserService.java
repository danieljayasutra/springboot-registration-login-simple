package com.kangdan.registration.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.kangdan.registration.controller.dto.UserRegistrationDto;
import com.kangdan.registration.model.User;

@Service
public interface UserService {
	
	User findByEmail(String email);
	User save(UserRegistrationDto userRegistrationDto);
}
