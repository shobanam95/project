package com.prjt2.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User2 {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_2;
	
	private String username_2;
	
	private String role_2;
	
	private String phno_2;
	
	private String email_2;
	
	private String password_2;
	
	private String confirmpassword_2;
	
	
	public String getPassword_2() {
		return password_2;
	}
	public void setPassword_2(String password_2) {
		this.password_2 = password_2;
	}
	public String getConfirmpassword_2() {
		return confirmpassword_2;
	}
	public void setConfirmpassword_2(String confirmpassword_2) {
		this.confirmpassword_2 = confirmpassword_2;
	}
	public String getEmail_2() {
		return email_2;
	}
	public void setEmail_2(String email_2) {
		this.email_2 = email_2;
	}
	public int getId_2() {
		return id_2;
	}
	public void setId_2(int id_2) {
		this.id_2 = id_2;
	}
	public String getUsername_2() {
		return username_2;
	}
	public void setUsername_2(String username_2) {
		this.username_2 = username_2;
	}
	public String getRole_2() {
		return role_2;
	}
	public void setRole_2(String role_2) {
		this.role_2 = role_2;
	}
	public String getPhno_2() {
		return phno_2;
	}
	public void setPhno_2(String phno_2) {
		this.phno_2 = phno_2;
	}

}
