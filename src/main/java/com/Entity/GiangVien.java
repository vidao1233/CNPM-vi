package com.Entity;

public class GiangVien {
	private String ma_giangvien;
	private String hoten;
    private int gioitinh;
    private String chuyennganh;
    private int roleid;
	public GiangVien() {
		super();
	}
	public GiangVien(String ma_giangvien, String hoten, int gioitinh, String chuyennganh, int roleid) {
		super();
		this.ma_giangvien = ma_giangvien;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.chuyennganh = chuyennganh;
		this.roleid = roleid;
	}
	public String getMa_giangvien() {
		return ma_giangvien;
	}
	public void setMa_giangvien(String ma_giangvien) {
		this.ma_giangvien = ma_giangvien;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(int gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getChuyennganh() {
		return chuyennganh;
	}
	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
    
}
