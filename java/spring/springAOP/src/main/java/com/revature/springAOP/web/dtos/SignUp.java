package com.revature.springAOP.web.dtos;

import java.util.Objects;

// TODO
public class SignUp {
	
	private String name;
	private String username;
	private String password;
	private String email;
	public SignUp(String name, String username, String password, String email) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public SignUp() {
		super();
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "SignUp [name=" + name + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, name, password, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SignUp other = (SignUp) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}
	
	

}
