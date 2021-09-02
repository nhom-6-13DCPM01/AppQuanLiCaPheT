package HienThi;

import java.util.Scanner;
import ChucNang.TaiKhoanChucNang;

public class TaiKhoanHienThi {
	Scanner sc = new Scanner(System.in);
	private TaiKhoanChucNang taiKhoanChucNang;
	
	public TaiKhoanHienThi() {
		this.setTaiKhoanChucNang(new TaiKhoanChucNang());
	}

	public TaiKhoanChucNang getTaiKhoanChucNang() {
		return taiKhoanChucNang;
	}
	public void setTaiKhoanChucNang(TaiKhoanChucNang taiKhoanChucNang) {
		this.taiKhoanChucNang = taiKhoanChucNang;
	}
	
	public void menu() {
		this.getTaiKhoanChucNang().xemDanhSachTaiKhoan();
		System.out.println("1. Thêm tài khoản");
		System.out.println("2. Xóa tài khoản");
		System.out.println("3. Cập nhật tài khoản");
		System.out.println("4. Tìm tài khoản");
		System.out.print("Nhập lựa chọn: ");
	}
	public void xuLy() {
		this.menu();
		int luaChon = Integer.parseInt(sc.nextLine());
		switch(luaChon) {
		case 1: this.getTaiKhoanChucNang().themTaiKhoan();break;
		case 2: this.getTaiKhoanChucNang().xoaTaiKhoan();break;
		case 3: this.getTaiKhoanChucNang().capNhatTaiKhoan();break;
		case 4: this.getTaiKhoanChucNang().timTaiKhoan();break;
		}
	}
}
