package com.Entity;

public class Users {
	private String userid, username, password;
    private int roleid;
	public Users() {
		super();
	}
	public Users(String userid, String username, String password, int roleid) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.roleid = roleid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
}
