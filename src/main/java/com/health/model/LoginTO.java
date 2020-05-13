package com.health.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginTO {
	private String userId;
	private String password;
	private String email;
	
	public LoginTO(@JsonProperty("userId") String userId, 
				   @JsonProperty("password") String password,
				   @JsonProperty("email") String email) {
		this.userId = userId;
		this.password = password;
		this.email = email;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}