package com.crunchify.model;

import java.util.Date;

public class LoginBean {
	private String name;
	private String pass;
	private Date birthdate;
	
	LoginBean(){
	    System.out.println("LoginBean constructor...");
	}
	
	public String getName() {
		return name;
	}
	public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
