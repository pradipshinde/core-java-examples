package com.pradip.core.keyword.transi;

import java.io.Serializable;

/**
 * @author Pradip
 *
 */
public class Employee implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String emailId;
	private transient String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
