package com.kangdan.registration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "users_roles")
public class UsersRoles {
	
	@Id
	private int userid;
	
	@Id
	private int roleid;
}
