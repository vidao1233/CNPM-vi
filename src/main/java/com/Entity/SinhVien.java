package com.Entity;

public class SinhVien {
	private String ma_sinhvien;
	private String hoten;
    private int gioitinh;
    private int khoa;
    private int ma_chuyennganh;
    private int ma_detai;
	public SinhVien() {
		super();
	}
	public SinhVien(String ma_sinhvien, String hoten, int gioitinh, int khoa, int ma_chuyennganh, int ma_detai) {
		super();
		this.ma_sinhvien = ma_sinhvien;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.khoa = khoa;
		this.ma_chuyennganh = ma_chuyennganh;
		this.ma_detai = ma_detai;
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
	public int getKhoa() {
		return khoa;
	}
	public void setKhoa(int khoa) {
		this.khoa = khoa;
	}
	public int getMa_chuyennganh() {
		return ma_chuyennganh;
	}
	public void setMa_chuyennganh(int ma_chuyennganh) {
		this.ma_chuyennganh = ma_chuyennganh;
	}
	public int getMa_detai() {
		return ma_detai;
	}
	public void setMa_detai(int ma_detai) {
		this.ma_detai = ma_detai;
	}  
}
