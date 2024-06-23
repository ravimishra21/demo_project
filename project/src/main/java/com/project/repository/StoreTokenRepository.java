package com.project.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.entity.StoreToken;




@Repository
public interface StoreTokenRepository extends JpaRepository<StoreToken, Integer> {

	
	 @Query("SELECT u FROM StoreToken u WHERE u.userId = :user_id")
	Optional<StoreToken> findByUserId(@Param("user_id") Integer user_id);
  

  
  
}