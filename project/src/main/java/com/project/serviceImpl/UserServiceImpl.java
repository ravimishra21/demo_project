package com.project.serviceImpl;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.entity.User;
import com.project.repository.UserRepository;
import com.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder encoder;
	
	@Override
	public User getUserDetailById(Integer user_id) {
		// TODO Auto-generated method stub
		
		Optional<User> detailById = userRepository.findById(user_id);
		
		User user = detailById.get();
		
		return user;
	}
	
	
	
	private Integer id;
	private String username;
	private String fullName;
	private String mobileNumber;
	private String email;
	private String password;
	private String country;
	private String state;
	private String district;
	private String city;
	private String pincode;
	private String status;
	private String createdDate;
	private String updatedDate;
	private Set<String> roles;
	 
//	update user detail
	public User updateUserById(User user, Integer id) {

		User user2 = new User();

		user2.setId(id);
		user2.setUsername(user.getUsername());
		user2.setFullName(user.getFullName());
		user2.setMobileNumber(user.getMobileNumber());
		user2.setEmail(user.getEmail());
		user2.setPassword(encoder.encode(user.getPassword()));
		user2.setCountry(user.getCountry());
		user2.setState(user.getState());
		user2.setDistrict(user.getDistrict());
		user2.setCity(user.getCity());
		user2.setPincode(user.getPincode());
		user2.setStatus(user.getStatus());
		user2.setCreatedDate(user.getCreatedDate());
		user2.setUpdatedDate(user.getUpdatedDate());
//		user2.setRoles(user.getRoles());
		User updatedUser = userRepository.save(user2);

		return updatedUser;

	}

	@Override
	public User deleteUserById( Integer id) {
		// TODO Auto-generated method stub
		
		userRepository.deleteById(id);
		
		return null;
	}

}