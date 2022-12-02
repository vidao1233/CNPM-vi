package com.Entity;

public class SinhVien {
	private String ma_sinhvien;
	private String hoten;
    private int gioitinh;
    private String chuyennganh;
    private int khoa;
	public SinhVien() {
		super();
	}
	public SinhVien(String ma_sinhvien, String hoten, int gioitinh, String chuyennganh, int khoa) {
		super();
		this.ma_sinhvien = ma_sinhvien;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.chuyennganh = chuyennganh;
		this.khoa = khoa;
	}
	public String getMa_sinhvien() {
		return ma_sinhvien;
	}
	public void setMa_sinhvien(String ma_sinhvien) {
		this.ma_sinhvien = ma_sinhvien;
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
	public int getKhoa() {
		return khoa;
	}
	public void setKhoa(int khoa) {
		this.khoa = khoa;
	}    
}
