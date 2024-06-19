package com.project.service;

import com.project.entity.User;

public interface UserService {

	User getUserDetailById(Integer user_id);

	User updateUserById(User user, Integer id);

	User deleteUserById(Integer id);

}
