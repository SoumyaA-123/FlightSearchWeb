package com.nagarro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "userdetails")
public class FlightUser {
	@Id
	@Column(name = "username")
	private String userName;
	@Column(name = "fullname")
	private String fullname;
	@Column(name = "password")
	private String password;

	public FlightUser() {

	}

	public FlightUser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public FlightUser(String userName, String fullname,String password) {
		super();
		this.userName = userName;
		this.fullname=fullname;
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
