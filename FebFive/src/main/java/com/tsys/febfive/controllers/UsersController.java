package com.tsys.febfive.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tsys.febfive.entities.Users;
import com.tsys.febfive.services.UsersService;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	public UsersController() {
	System.out.println("user controller call");
	}
	
	@PostMapping(path = "/getUserByEmail", consumes = "application/json",produces = "application/json")
	public Users getUserByEmail(@RequestBody Users users) {
		return usersService.getUserByEmail(users.getEmail());
	}
}
