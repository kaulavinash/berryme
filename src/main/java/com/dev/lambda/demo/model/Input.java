package com.dev.lambda.demo.model;

public class Input {
	
	private String name;
	
	private boolean status;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return " "+name+" "+status;
	}
	
	

}
