package com.ssafy.ssafit.model.dto;

public class User {
	private int user_id;
	private String id;
	private String pwd;
	private String name;
	private String email;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String id, String pwd, String name, String email) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}

	public User(int user_id, String id, String pwd, String name, String email) {
		super();
		this.user_id = user_id;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + "]";
	}
}
