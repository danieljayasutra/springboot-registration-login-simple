package com.kangdan.registration.repository;

import org.springframework.data.repository.CrudRepository;

import com.kangdan.registration.model.User;

public interface UserRepository extends CrudRepository<User, Long > {
	
	User findByEmail(String email);
}
