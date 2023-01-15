package com.SpringBootCRUDApp.SpringBootReact.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.SpringBootCRUDApp.SpringBootReact.dto.UserDto;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String Name;
	private String userName;
	private String email;
	private long phone;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", userName=" + userName + ", email=" + email + ", phone=" + phone
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Name, email, id, phone, userName);
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public User(int id, String name, String userName, String email, long phone) {
		super();
		this.id = id;
		Name = name;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
	}

	public User(UserDto userDto) {
		// TODO Auto-generated constructor stub
//	}
	
	}
	
     
}
