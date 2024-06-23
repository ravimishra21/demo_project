package com.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StoreToken {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "token")
	private String token;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "created_date")
	private String createdDate;

	@Column(name = "expiry_date")
	private String expiryDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public StoreToken() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StoreToken(String token, Integer userId, String createdDate, String expiryDate) {
		this.token = token;
		this.userId = userId;
		this.createdDate = createdDate;
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "StoreToken [id=" + id + ", token=" + token + ", userId=" + userId + ", createdDate=" + createdDate
				+ ", expiryDate=" + expiryDate + "]";
	}
	
	
	
	
	
	
	
	

}