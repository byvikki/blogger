package com.net.blog.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

@Entity
@Table(name= "CONTACTS")
public class Greeting {
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer Id;
	
	@Column(name="firstname")
	private String name;
		
	@Column(name="lastname")
	private String message;	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
