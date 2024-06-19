package com.project.dto;

public class MessageResponse {
	private String message;
	private String token;

	public MessageResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageResponse(String message, String token) {
		super();
		this.message = message;
		this.token = token;
	}

	public MessageResponse(String message) {
		this.message = message;

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
