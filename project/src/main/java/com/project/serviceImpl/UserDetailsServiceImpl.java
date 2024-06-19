package com.project.serviceImpl;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.project.entity.Role;
import com.project.entity.RoleInput;
import com.project.entity.User;
import com.project.repository.UserRepository;
import com.project.security.JwtUtils;




@Service
public class UserDetailsServiceImpl implements UserDetailsService {
 
	@Autowired
	UserRepository userRepository;

	@Autowired
	private PasswordEncoder encoder2;
	
	@Autowired
	private JwtUtils jwtUtils;
	
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = null;
		if (username.contains("@")) {
			user = userRepository.findByEmail(username)
					.orElseThrow(() -> new UsernameNotFoundException("User Not Found with this email : " + username));

		} else if (username.matches("^[0-9]{10}$")) {

			Optional<User> user2 = userRepository.findByMobileNumber(username);

			user = userRepository.findByMobileNumber(username).orElseThrow(
					() -> new UsernameNotFoundException("User Not Found with this phone number: " + username));
		}

		else {
			user = userRepository.findByUsername(username)
					.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
		}

		return UserDetailsImpl.build(user);
	}
  
  
  @Transactional
	public UserDetails assignRole(RoleInput roleInput, Role role) throws UsernameNotFoundException {
		User user = userRepository.findById(roleInput.getUserId()).orElseThrow(
				() -> new UsernameNotFoundException("User Not Found with username: " + roleInput.getUserId()));
		user.getRoles().add(role);
		return UserDetailsImpl.build(user);
	}
 
//  public List<User> getUserCount() {
//
//		List<User> allData = userRepository.findAll();
//		return allData;
//	}
  
//	update the Car By Id
//	public User updateUserById(User user, Integer id) throws IOException {
//
//		User user2 = new User();
//
//		user2.setId(id);
//		user2.setEmail(user.getEmail());
//		user2.setUsername(user.getUsername());
//		user2.setPassword(encoder2.encode(user.getPassword()));
//		user2.setPhone(user.getPhone());
//		user2.setRoles(user.getRoles());
//		User updatedUser = userRepository.save(user2);
//
//		return updatedUser;
//
//	}
	
//	public User findByUsername(String username) {
//
//		Optional<User> user = userRepository.findByUsername(username);
//		
//		User user2 = user.get();
//		System.out.println("user"+user);
//		
//		return user.get();
//	}
	


	public User getUserByToken(String token) {
		String[] sa = token.split("\\s");
		String username = jwtUtils.getUserNameFromJwtToken(sa[1]);
		return userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
	}
	
}
