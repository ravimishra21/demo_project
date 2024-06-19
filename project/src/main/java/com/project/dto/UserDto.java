package com.project.dto;

import java.util.Set;

public class UserDto {

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

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(String username, String fullName, String mobileNumber, String email, String password, String country,
			String state, String district, String city, String pincode, String status, String createdDate,
			String updatedDate, Set<String> roles) {
		super();
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

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", password=" + password + ", country=" + country + ", state=" + state + ", district=" + district
				+ ", city=" + city + ", pincode=" + pincode + ", status=" + status + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", roles=" + roles + "]";
	}

}
