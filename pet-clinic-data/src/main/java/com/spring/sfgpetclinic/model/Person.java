package com.spring.sfgpetclinic.model;

public class Person extends BaseEntity {
	
	private String firstName;
	private String lastnName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastnName() {
		return lastnName;
	}

	public void setLastnName(String lastnName) {
		this.lastnName = lastnName;
	}

}
