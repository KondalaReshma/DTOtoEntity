package com.dtoexample.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtoexample.dto.UserLocationDTO;
import com.dtoexample.model.User;
import com.dtoexample.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepository; 
	
	public List<UserLocationDTO> getAllUsersLocation(){
		
		return userRepository.findAll()
				.stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
		
		
	}
	
	
	public List<User> getusers(){
		return userRepository.findAll();
		
	}
      
	
	private UserLocationDTO convertEntityToDto(User user) {
		
		
		UserLocationDTO  userLocationDTO = new UserLocationDTO();
		userLocationDTO.setUserId(user.getId());
		userLocationDTO.setEmail(user.getEmail());
		userLocationDTO.setPlace(user.getLocation().getPlace());
		userLocationDTO.setLongitude(user.getLocation().getLongitude());
		userLocationDTO.setLatitude(user.getLocation().getLatitude());
		userLocationDTO.setEmail(user.getEmail());
		
		return userLocationDTO;
	}
	
	
	private User dtoToEntity(UserLocationDTO userlocationdto) {
		
		User  user = new User();
		
		user.setId(userlocationdto.getUserId());
		user.setEmail(userlocationdto.getEmail());
			
		
		return user;
		
		
	}

}

