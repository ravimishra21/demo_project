package com.project.serviceImpl;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.entity.User;


public class UserDetailsImpl implements UserDetails {
  private static final long serialVersionUID = 1L;

  
  private Integer id;
	private String username;
	private String fullName;
	private String mobileNumber;
	private String email;
	
	@JsonIgnore
	private String password;
	
	private String country;
	private String state;
	private String district;
	private String city;
	private String pincode;
	private String status;
	private String createdDate;
	private String updatedDate;    
//	private Set<String> roles;
  
  
  private Collection<? extends GrantedAuthority> authorities;

  public UserDetailsImpl(Integer id, String username,String fullName,String mobileNumber,
		  String email, String password, String country,String state, String district, String city, 
		  String pincode, String status, String createdDate, String updatedDate,
      Collection<? extends GrantedAuthority> authorities) {
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
    this.authorities = authorities;
  }

  public static UserDetailsImpl build(User user) {
    List<GrantedAuthority> authorities = user.getRoles().stream()
                               .map(role -> new SimpleGrantedAuthority(role.getName().name()))
                               .collect(Collectors.toList());

    return new UserDetailsImpl(user.getId(), 
    		user.getUsername(),user.getFullName(), user.getMobileNumber(), user.getEmail(),
			user.getPassword(), user.getCountry(), user.getState(), user.getDistrict(),
			user.getCity(), user.getPincode(), user.getStatus(), user.getCreatedDate(),
			user.getUpdatedDate(),
                               authorities);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  public Integer getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return username;
  }
 
  
  

public String getFullName() {
	return fullName;
}


public String getMobileNumber() {
	return mobileNumber;
}

public String getCountry() {
	return country;
}

public String getState() {
	return state;
}

public String getDistrict() {
	return district;
}



public String getCity() {
	return city;
}



public String getPincode() {
	return pincode;
}



public String getStatus() {
	return status;
}


public String getCreatedDate() {
	return createdDate;
}


public String getUpdatedDate() {
	return updatedDate;
}



@Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    UserDetailsImpl user = (UserDetailsImpl) o;
    return Objects.equals(id, user.id);
  }
}
