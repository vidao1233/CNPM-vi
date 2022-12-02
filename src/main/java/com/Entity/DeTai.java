package com.Entity;

public class DeTai {
	private String ma_detai;
	private String ten_detai;
    private String chuyennganh;
    private String gvhd;
    private int trangthai;
    private int nam_totnghiep;
    private int soluongsinhviendangky;
	public DeTai() {
		super();
	}
	public DeTai(String ma_detai, String ten_detai, String chuyennganh, String gvhd, int trangthai, int nam_totnghiep,
			int soluongsinhviendangky) {
		super();
		this.ma_detai = ma_detai;
		this.ten_detai = ten_detai;
		this.chuyennganh = chuyennganh;
		this.gvhd = gvhd;
		this.trangthai = trangthai;
		this.nam_totnghiep = nam_totnghiep;
		this.soluongsinhviendangky = soluongsinhviendangky;
	}
	public String getMa_detai() {
		return ma_detai;
	}
	public void setMa_detai(String ma_detai) {
		this.ma_detai = ma_detai;
	}
	public String getTen_detai() {
		return ten_detai;
	}
	public void setTen_detai(String ten_detai) {
		this.ten_detai = ten_detai;
	}
	public String getChuyennganh() {
		return chuyennganh;
	}
	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}
	public String getGvhd() {
		return gvhd;
	}
	public void setGvhd(String gvhd) {
		this.gvhd = gvhd;
	}
	public int getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}
	public int getNam_totnghiep() {
		return nam_totnghiep;
	}
	public void setNam_totnghiep(int nam_totnghiep) {
		this.nam_totnghiep = nam_totnghiep;
	}
	public int getSoluongsinhviendangky() {
		return soluongsinhviendangky;
	}
	public void setSoluongsinhviendangky(int soluongsinhviendangky) {
		this.soluongsinhviendangky = soluongsinhviendangky;
	}
    
}
