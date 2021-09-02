package ChucNang;

import java.util.*;
import DanhMuc.DanhSachTaiKhoan;
import Object.TaiKhoan;

public class TaiKhoanChucNang {
	Scanner sc = new Scanner(System.in);
	private DanhSachTaiKhoan danhSachTaiKhoan;

	public TaiKhoanChucNang() {
		this.setDanhSachTaiKhoan(new DanhSachTaiKhoan());
	}
	
	public DanhSachTaiKhoan getDanhSachTaiKhoan() {
		return danhSachTaiKhoan;
	}
	public void setDanhSachTaiKhoan(DanhSachTaiKhoan danhSachTaiKhoan) {
		this.danhSachTaiKhoan = danhSachTaiKhoan;
	}
	
	public void themTaiKhoan() {
		TaiKhoan taiKhoan = new TaiKhoan();
		do {
		taiKhoan.input();
		}while(this.kiemTraTrung(taiKhoan.getTenDangNhap(), taiKhoan.getMatKhau()));
		this.getDanhSachTaiKhoan().themTaiKhoan(taiKhoan);
		TaiKhoan.setCount(taiKhoan.getIdTaiKhoan());
	}
	public void xoaTaiKhoan() {
		System.out.print("Nhập tên đăng nhập: ");
		String tenDangNhap = sc.nextLine();
		this.getDanhSachTaiKhoan().xoaTaiKhoanTheoTenDangNhap(tenDangNhap);
	}
	public void capNhatTaiKhoan() {
		System.out.print("Nhập tên đăng nhập: ");
		String tenDangNhap = sc.nextLine();
		this.getDanhSachTaiKhoan().suaTaiKhoanTheoTenDangNhap(tenDangNhap);
	}
	public void timTaiKhoan() {
		System.out.println("Nhập tên đăng nhập");
		String tenDangNhap = sc.nextLine();
		Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().timTaiKhoanTheoTenDangNhap(tenDangNhap);
		if(i.hasNext()) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			taiKhoan.display();
		}
	}
	public void xemDanhSachTaiKhoan() {
		Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().layDanhSachTaiKhoan();
		if(i.hasNext()) {
			System.out.printf("\n%-3s %-30s %-30s %s\n","ID","TÊN ĐĂNG NHẬP","MẬT KHẨU","HỌ VÀ TÊN");
			for(;i.hasNext();) {
				TaiKhoan taiKhoan = (TaiKhoan)i.next();
				taiKhoan.display();
			}
		}
	}
	public boolean kiemTraTrung(String tenDangNhap, String matKhau) {
		Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().layDanhSachTaiKhoan();
		for(;i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(!taiKhoan.getTenDangNhap().equals(tenDangNhap))
				continue;
			if(!taiKhoan.getMatKhau().equals(matKhau))
				continue;
			return true;
		}
		return false;
	}
	public boolean kiemTraDangNhap(String tenDangNhap, String matKhau) {
		Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().layDanhSachTaiKhoan();
		for(;i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(taiKhoan.getTenDangNhap().equals(tenDangNhap))
				continue;
			if(taiKhoan.getMatKhau().equals(matKhau))
				continue;
			return true;
		}
		return false;
	}
}
