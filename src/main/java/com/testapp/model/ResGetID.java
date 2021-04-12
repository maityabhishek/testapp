package com.testapp.model;

public class ResGetID {
	
	private User data;

	public User getUser() {
		return data;
	}

	public void setUser(User user) {
		this.data = user;
	}

	public ResGetID(User user) {
		super();
		this.data = user;
	}
	public ResGetID() {
		super();
		
	}

}
