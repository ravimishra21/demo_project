package com.project.serviceImpl;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.entity.StoreToken;
import com.project.entity.User;
import com.project.exception.UserNotFoundException;
import com.project.repository.StoreTokenRepository;
import com.project.repository.UserRepository;
import com.project.service.UserService;
import com.project.utiils.DateUtils;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private StoreTokenRepository storeTokenRepository;
	
	@Override
	public User getUserDetailById(Integer user_id) {
		// TODO Auto-generated method stub
		
		 return userRepository.findById(user_id).orElseThrow(() -> new UserNotFoundException("This user id is not available !!"));
		
	}
	
	
	 
//	update user detail
	public User updateUserById(User user, Integer id) {

		 User user2 = userRepository.findById(id)
//				 .get();
		            .orElseThrow(() -> new UserNotFoundException("This user is not available !!"));
		
//		User user2 = new User();

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
	public String deleteUserById( Integer id) {
		// TODO Auto-generated method stub
		
		 User user = userRepository.findById(id)
		            .orElseThrow(() -> new UserNotFoundException("This user is not available !!"));
		
		
		userRepository.deleteById(id);
		
		return "User successful deleted !! ";
	}



	@Override
	public void updateToken(UserDetailsImpl userDetails , String jwt, StoreToken tokenDtl) {
		// TODO Auto-generated method stub
		
		
		 Optional<StoreToken> findByUserId = storeTokenRepository.findByUserId(userDetails.getId());
		 StoreToken storeToken = findByUserId.get();
		 
		StoreToken tokenDetail = new StoreToken();
		if(!findByUserId.isEmpty()) {
			tokenDetail.setId(storeToken.getId());
			tokenDetail.setUserId(storeToken.getUserId());
			tokenDetail.setToken(jwt);
		}
		
		
		String currentDateTime = DateUtils.currentDate();
		String tokenExpireDateTime = DateUtils.expireDateForToken(currentDateTime);
		
		tokenDetail.setCreatedDate(currentDateTime);
		tokenDetail.setExpiryDate(tokenExpireDateTime);

		storeTokenRepository.save(tokenDetail);
		
		
	}

}
