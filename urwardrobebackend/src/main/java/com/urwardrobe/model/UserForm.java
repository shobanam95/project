package com.urwardrobe.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserDetail")

public class UserForm  {
	//@NotEmpty
	//@Pattern(regexp = "[A-Za-z]\\d[A-Za-z]\\s?\\d[A-Za-z]\\d", message = "Name validation failed.")
	@Column(name="USERNAME")
	 	 private String username;
	@Column(name="PASSWORD")
	//@NotEmpty
	    private String password;
	//@NotEmpty
	   private String confirm_password;
	  //@NotEmpty  
	   //@Email
	   private String email;
			    
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column
	    private int id;
	    private Boolean enabled;
	    private String role;
	
	    
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConfirm_password() {
			return confirm_password;
		}
		public void setConfirm_password(String confirm_password) {
			this.confirm_password = confirm_password;
		}
           public String getEmail() {
			return email;
		}
           public void setEmail(String email) {
			this.email = email;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Boolean getEnabled() {
			return enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}
		public String getRole() {
			return role;
		}
public void setRole(String role) {
			this.role = role;
		}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}



	
		
		   }



