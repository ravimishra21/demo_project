package com.project.dto;

import java.util.List;
import java.util.Set;

public class JwtResponse {
  private String token;
  private String type = "Bearer";
  
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
  
  
  private List<String> roles;

  public JwtResponse(String accessToken, Integer id,
		  String username,String fullName, String mobileNumber, String email, String password,
			String country, String state,	String district, String city, String pincode,
			String status, String createdDate, String updatedDate,
		  
		  List<String> roles) {
    this.token = accessToken;
    this.id = id;
    
    this.username = username;
	this.fullName = fullName;
	this.mobileNumber = mobileNumber;
	this.email = email;
	this.password = password;
	this.country = country;
	this.state = state;
	this.district = district;
	this.city = city;
	this.pincode = pincode;
	this.status = status;
	this.createdDate = createdDate;
	this.updatedDate = updatedDate;
    
    this.roles = roles;
  }

  public String getAccessToken() {
    return token;
  }

  public void setAccessToken(String accessToken) {
    this.token = accessToken;
  }

  public String getTokenType() {
    return type;
  }

  public void setTokenType(String tokenType) {
    this.type = tokenType;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }



  public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getDistrict() {
	return district;
}

public void setDistrict(String district) {
	this.district = district;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(String createdDate) {
	this.createdDate = createdDate;
}

public String getUpdatedDate() {
	return updatedDate;
}

public void setUpdatedDate(String updatedDate) {
	this.updatedDate = updatedDate;
}

public void setRoles(List<String> roles) {
	this.roles = roles;
}

public List<String> getRoles() {
    return roles;
  }
}
