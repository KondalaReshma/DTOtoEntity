package com.dtoexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dtoexample.model.Location;
import com.dtoexample.model.User;
import com.dtoexample.repository.LocationRepository;
import com.dtoexample.repository.UserRepository;

@SpringBootApplication
public class SpringbootDtoExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoExampleApplication.class, args);
	}
	
	
	@Autowired
	private UserRepository userRepoitory;
	
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		Location location = new Location();
		location.setPlace("pune");
		location.setDescription("pune is great place  to live");
		location.setLongitude(40.5);
		location.setLatitude(30.6);
		locationRepository.save(location);
		
		
		User user1 = new User();
		user1.setFirstname("Reshma");
		user1.setLastname("Kondala");
		user1.setEmail("reshmakondala@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepoitory.save(user1);
		
		
		
		
		User user2 = new User();
		user2.setFirstname("Saikishore");
		user2.setLastname("Kondala");
		user2.setEmail("saikishorekondala@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepoitory.save(user2);
		
		
	}

}
