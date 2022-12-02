package com.Entity;

public class GiangVien {
	private String ma_giangvien;
	private String hoten;
    private int gioitinh;
    private int ma_chuyennganh;
    private int roleid;
	public GiangVien() {
		super();
	}
	public GiangVien(String ma_giangvien, String hoten, int gioitinh, int ma_chuyennganh, int roleid) {
		super();
		this.ma_giangvien = ma_giangvien;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.ma_chuyennganh = ma_chuyennganh;
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
	public int getMa_chuyennganh() {
		return ma_chuyennganh;
	}
	public void setMa_chuyennganh(int ma_chuyennganh) {
		this.ma_chuyennganh = ma_chuyennganh;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	   
}
