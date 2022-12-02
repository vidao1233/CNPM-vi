package com.Entity;

import java.sql.Date;

public class Admin {
	private String admin_id;
	private String hoten;
    private Date ngaysinh;
    private int gioitinh;
    private int roleid;
	public Admin() {
		super();
	}
	public Admin(String admin_id, String hoten, Date ngaysinh, int gioitinh, int roleid) {
		super();
		this.admin_id = admin_id;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.roleid = roleid;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public int getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(int gioitinh) {
		this.gioitinh = gioitinh;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
    
}
