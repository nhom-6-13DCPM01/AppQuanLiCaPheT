package ChucNang;

import java.util.*;
import DanhMuc.*;
import Object.*;

public class DangNhapChucNang {
	private DanhSachTaiKhoan danhSachTaiKhoan;
	private DanhSachNhanVien danhSachNhanVien;
	
	public DangNhapChucNang() {
		this.setDanhSachTaiKhoan(new DanhSachTaiKhoan());
		this.setDanhSachNhanVien(new DanhSachNhanVien());
		TaiKhoan.setCount(0);
		NhanVien.setCount(0);
	}

	public DanhSachTaiKhoan getDanhSachTaiKhoan() {
		return danhSachTaiKhoan;
	}
	public void setDanhSachTaiKhoan(DanhSachTaiKhoan danhSachTaiKhoan) {
		this.danhSachTaiKhoan = danhSachTaiKhoan;
	}
	public DanhSachNhanVien getDanhSachNhanVien() {
		return danhSachNhanVien;
	}
	public void setDanhSachNhanVien(DanhSachNhanVien danhSachNhanVien) {
		this.danhSachNhanVien = danhSachNhanVien;
	}
	
	public TaiKhoan kiemTraDangNhap(String tenDangNhap, String matKhau) {
		Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().layDanhSachTaiKhoan();
		for(;i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(!taiKhoan.getTenDangNhap().equals(tenDangNhap))
				continue;
			if(!taiKhoan.getMatKhau().equals(matKhau))
				continue;
			return taiKhoan;
		}
		return null;
	}
	public String phanQuyen(TaiKhoan taiKhoan) {
		Iterator<NhanVien> i = this.getDanhSachNhanVien().layDanhSachNhanVien();
		for(;i.hasNext();) {
			NhanVien nhanVien = (NhanVien)i.next();
			if(!taiKhoan.getTen().equalsIgnoreCase(nhanVien.getTen()))
				continue;
			return nhanVien.getChucVu();
		}
		return null;
	}
}
