package com.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.project.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {



	Optional<User> findByUsername(String username);

	Optional<User> findByEmail(String email);

	Optional<User> findByMobileNumber(String phone);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

	Boolean existsByMobileNumber(String phone);
	
	

	
	
	

}
