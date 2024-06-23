package com.project.service;

import java.util.Optional;

import com.project.entity.StoreToken;
import com.project.entity.User;
import com.project.serviceImpl.UserDetailsImpl;

public interface UserService {

	User getUserDetailById(Integer user_id);

	User updateUserById(User user, Integer id);

	String deleteUserById(Integer id);


	void updateToken(UserDetailsImpl userDetails, String jwt, StoreToken tokenDtl);

}
