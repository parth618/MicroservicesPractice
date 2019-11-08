package com.springboot.trng.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "User_Tbl")
public class User {
	
	//JSON payload verification
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message = "userId should not be blank")
	private int userId;
	@NotNull(message = "firstName should not be blank")
	@Size(max=10, min=3)
	private String firstName;
	@NotNull(message = "lastName should not be blank")
	private String lastName;
	@NotNull(message = "email should not be blank")
	@Email
	private String email;
	
	public User() {
		
	}

	public User(int userId, String firstName, String lastName, String email) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
	

}
