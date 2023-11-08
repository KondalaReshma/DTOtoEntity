package com.dtoexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtoexample.dto.UserLocationDTO;
import com.dtoexample.model.User;
import com.dtoexample.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/EnitytoDTO")
	
	public List<UserLocationDTO> getAllUsersLocation(){
		
		return userService.getAllUsersLocation();
	}
	
	@GetMapping("/DTOtoEntity")
	public List<User> getusers(){
		return userService.getusers();
	}

}
