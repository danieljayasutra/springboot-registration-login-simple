package com.kangdan.registration.controller.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.kangdan.registration.constraint.FieldMatch;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@FieldMatch.List({
    @FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match"),
    @FieldMatch(first = "email", second = "confirmEmail", message = "The email fields must match")
})
public class UserRegistrationDto {
	
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String confirmPassword;
	
	@Email
	@NotEmpty
	private String email;
	
	@Email
	@NotEmpty
	private String confirmEmail;
	
	@AssertTrue
	private boolean terms;
}
