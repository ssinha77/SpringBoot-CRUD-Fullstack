package com.SpringBootCRUDApp.SpringBootReact.dto;

import java.util.Objects;

public class UserDto {
	
       private int id;
       private String name;
       private String username;
       private String email;
       private long phone;
       
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", phone="
				+ phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, phone, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDto other = (UserDto) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& phone == other.phone && Objects.equals(username, other.username);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public UserDto(int id, String name, String username, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.phone = phone;
	}
}
