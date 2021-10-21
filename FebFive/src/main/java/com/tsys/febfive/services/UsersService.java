package com.tsys.febfive.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.tsys.febfive.dao.UsersRepo;
import com.tsys.febfive.entities.Users;

@Service
public class UsersService {

	
	@Autowired
	private UsersRepo usersRepo;
	
	
	public Users getUserByEmail(String email) throws ResourceNotFoundException{
		return usersRepo.findByEmail(email);
		
	}
}
