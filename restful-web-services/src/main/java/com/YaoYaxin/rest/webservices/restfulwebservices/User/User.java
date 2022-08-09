package com.YaoYaxin.rest.webservices.restfulwebservices.User;

import java.util.Date;

public class User {
	
	private Integer id;
	
	private String nameString;
	
	private Date birthDate;
	
	protected User() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return String.format("User [id=%s, nameString=%s, birthDate=%s]", id, nameString, birthDate);
	}

	public User(Integer id, String nameString, Date birthDate) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.birthDate = birthDate;
	}
	
	
}
