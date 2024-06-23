package com.project.entity;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "username")
	private String username;
	
	@Column(name = "full_name")
	private String fullName;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;
	
	@Column(name = "country")
	private String country;

	@Column(name = "state")
	private String state;

	@Column(name = "district")
	private String district;

	@Column(name = "city")
	private String city;
	
	@Column(name = "pincode")
	private String pincode;

	@Column(name = "status")
	private String status;

	@Column(name = "created_date")
	private String createdDate;

	@Column(name = "updated_date")
	private String updatedDate;               

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

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

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username ,String fullName, String mobileNumber, String email, String password, String country, String state,
			String district, String city, String pincode, String status, String createdDate, String updatedDate,
			Set<Role> roles) {
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
	
	
	public User(String username ,String fullName, String mobileNumber, String email, String password, String country, String state,
			String district, String city, String pincode, String status, String createdDate, String updatedDate) {
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
	
	}

	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", password=" + password + ", country=" + country + ", state=" + state
				+ ", district=" + district + ", city=" + city + ", pincode=" + pincode + ", status=" + status
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", roles=" + roles + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
