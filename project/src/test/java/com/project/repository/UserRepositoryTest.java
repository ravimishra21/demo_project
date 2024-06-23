package com.project.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.project.entity.User;


@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Test
	void existsByUsername() {
		
		// Create new user's  details
		User user = new User("ravi","Ravi Mishra", "9854893489",
				"ravim@gmail.com", encoder.encode("ABC"), "India", "Bihar",
				"Patna", "Bihta", "563423", "active",
				"2023-06-19T10:00:00Z", "2023-06-19T10:00:00Z"

		);
		
		userRepository.save(user);
		
		Boolean actualResult =userRepository.existsByUsername("ravi");
		
		assertThat(actualResult).isTrue();
		
		userRepository.delete(user);
		
	}
	
	
	
	@Test
	void existsByEmail() {
		
		// Create new user's  details
		User user = new User("ravi","Ravi Mishra", "9854893489",
				"ravim@gmail.com", encoder.encode("ABC"), "India", "Bihar",
				"Patna", "Bihta", "563423", "active",
				"2023-06-19T10:00:00Z", "2023-06-19T10:00:00Z"

		);
		
		userRepository.save(user);
		
		Boolean actualResult =userRepository.existsByEmail("ravim@gmail.com");
		
		assertThat(actualResult).isTrue();
		
		userRepository.delete(user);
		
	}
	
	
	@Test
	void existsByMobileNumber() {
		
		// Create new user's  details
		User user = new User("ravi","Ravi Mishra", "9854893489",
				"ravim@gmail.com", encoder.encode("ABC"), "India", "Bihar",
				"Patna", "Bihta", "563423", "active",
				"2023-06-19T10:00:00Z", "2023-06-19T10:00:00Z"

		);
		
		userRepository.save(user);
		
		Boolean actualResult =userRepository.existsByMobileNumber("9854893489");
		
		assertThat(actualResult).isTrue();
		
		userRepository.delete(user);
		
	}
	
	
	
	
	
	
	
}
