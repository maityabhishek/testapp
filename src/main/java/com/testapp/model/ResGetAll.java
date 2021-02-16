package com.testapp.model;

import java.util.List;

public class ResGetAll {
	
	private List<User> data;

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}

	public ResGetAll(List<User> data) {
		super();
		this.data = data;
	}

	public ResGetAll() {
		super();
	}
	

}
