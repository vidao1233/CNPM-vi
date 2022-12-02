USE master
GO

--DROP DATABASE DKDT
--GO

CREATE DATABASE DKDT
GO

USE DKDT
GO

--Create table
--Role
CREATE TABLE Roles(
	roleid INT PRIMARY KEY,
	rolename NVARCHAR(50) NOT NULL
)
GO
--Account
CREATE TABLE Accounts(
	username VARCHAR(50) PRIMARY KEY,
	password VARCHAR(100) NOT NULL,
	roleid INT NOT NULL REFERENCES Roles(roleid)
)
GO

--Admin
CREATE TABLE Admin(
	admin_id VARCHAR(50) PRIMARY KEY REFERENCES Accounts(username),
	hoten NVARCHAR(100) NOT NULL,
	ngaysinh DATE NOT NULL,
	gioitinh BIT NOT NULL,
	roleid int NOT NULL REFERENCES Roles(roleid),
)
GO
--ChuyenNganh
CREATE TABLE ChuyenNganh(
	ma_chuyennganh INT IDENTITY(1,1) PRIMARY KEY,
	ten_chuyennganh NVARCHAR(20) NOT NULL
)
GO
--GiangVien
CREATE TABLE GiangVien(
	ma_giangvien VARCHAR(50) PRIMARY KEY,
	hoten NVARCHAR(100) NOT NULL,
	gioitinh BIT NOT NULL,
	ma_chuyennganh INT NOT NULL REFERENCES ChuyenNganh(ma_chuyennganh),
	roleid int NOT NULL REFERENCES Roles(roleid)
)
GO
--DeTai
CREATE TABLE DeTai(
	ma_detai VARCHAR(50) PRIMARY KEY,
	ten_detai NVARCHAR(100) NOT NULL,
	ma_chuyennganh INT NOT NULL REFERENCES ChuyenNganh(ma_chuyennganh),
	gvhd VARCHAR(50) NOT NULL REFERENCES GiangVien(ma_giangvien),
	trangthai BIT NOT NULL,
	nam_totnghiep INT NOT NULL,
	soluongsinhviendangky SMALLINT NOT NULL
)
GO
--SinhVien
CREATE TABLE SinhVien(
	ma_sinhvien VARCHAR(50) PRIMARY KEY,
	hoten NVARCHAR(100) NOT NULL,
	gioitinh BIT NOT NULL,
	khoa int NOT NULL,
	ma_chuyennganh INT NOT NULL REFERENCES ChuyenNganh(ma_chuyennganh),
	ma_detai VARCHAR(50) REFERENCES DeTai(ma_detai)	
)
GO

