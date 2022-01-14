package com.microservices.webservices.restFul.user;

import java.util.Date;

public class User {
 
	public Integer id;
	public String name;
	public Date dateOfbirth;
	
	public User() {
		super();
	}
	public User(Integer id, String name, Date dateOfbirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfbirth = dateOfbirth;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(Date dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	
	
	
}
