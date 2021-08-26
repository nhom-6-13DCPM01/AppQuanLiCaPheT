package Menu;

import java.util.*;
import Manage.QuanLiNhanVien;
import Object.NhanVien;

public class MenuQuanLiNhanVien {
	private QuanLiNhanVien quanLiNhanVien = new QuanLiNhanVien();
	boolean nhapTiep = false;
	Scanner sc = new Scanner(System.in);
	public MenuQuanLiNhanVien() {
		this.xuLy();
	}
	
	public QuanLiNhanVien getQuanLiNhanVien() {
		return quanLiNhanVien;
	}
	public void setQuanLiNhanVien(QuanLiNhanVien quanLiNhanVien) {
		this.quanLiNhanVien = quanLiNhanVien;
	}

	public void menuQuanLiNhanVien() {
		System.out.println("1. Thêm nhân viên");
		System.out.println("2. Xóa nhân viên");
		System.out.println("3. Cập nhật nhân viên");
		System.out.println("4. Tìm nhân viên");
		System.out.println("5. Xem thông tin nhân viên");
		System.out.println("6. thoát");
		System.out.print("Nhập lựa chọn: ");
	}
	public void xuLy() {
		int luaChon = 0;
		do {
			this.menuQuanLiNhanVien();
			luaChon = Integer.parseInt(sc.nextLine());
			switch(luaChon) {
			case 1: this.themNhanVien();nhapTiep = true; break;
			case 2: this.xoaNhanVien();nhapTiep = true; break;
			case 3: this.capNhatNhanVien();nhapTiep = true;break;
			case 4: this.timNhanVien();nhapTiep = true;break;
			case 5: xuat();nhapTiep = true;break;
			default: nhapTiep = false;break;
			}
		}while(nhapTiep);
	}
	public void themNhanVien() {
		NhanVien nhanVien = new NhanVien();
		nhap(nhanVien);
		this.getQuanLiNhanVien().themNhanVien(nhanVien);
		NhanVien.setCount(nhanVien.getIdNhanVien());
	}
	public void xoaNhanVien() {
		xuat();
		System.out.print("Nhập ID nhân viên cần xóa: ");
		int ID = Integer.parseInt(sc.nextLine());
		this.getQuanLiNhanVien().xoaNhanVienTheoID(ID);
	}
	public void capNhatNhanVien() {
		xuat();
		System.out.print("Nhập ID nhân viên cần sửa: ");
		int ID = Integer.parseInt(sc.nextLine());
		this.getQuanLiNhanVien().suaThongTinNhanVienTheoID(ID);
	}
	public void timNhanVien() {
		xuat();
		System.out.print("Nhập ID nhân viên cần tìm: ");
		int ID = Integer.parseInt(sc.nextLine());
		Iterator<NhanVien> i = this.getQuanLiNhanVien().timNhanVienTheoID(ID-1);
		if(i.hasNext()) {
			NhanVien nhanVien = (NhanVien)i.next();
			display(nhanVien);
		}
	}
	public void xuat() {
		for(Iterator<NhanVien> i = this.getQuanLiNhanVien().getQuanLiNhanVien().iterator();i.hasNext();) {
			NhanVien nhanVien = (NhanVien)i.next();
			display(nhanVien);
		}
	}
	public void nhap(NhanVien nv) {
		System.out.print("Nhập tên nhân viên: ");
		nv.setTen(sc.nextLine());
		System.out.print("Nhập địa chỉ: ");
		nv.setDiaChi(sc.nextLine());
		System.out.print("Nhập email: ");
		nv.setEmail(sc.nextLine());
		System.out.print("Nhập ngày sinh: ");
		nv.setNgaySinh(sc.nextLine());
		System.out.print("Nhập số điện thoại: ");
		nv.setSoDienThoai(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhập chức vụ: ");
		nv.setChucVu(sc.nextLine());
	}
	public void display(NhanVien nv) {
		System.out.println(nv.toString());
	}
}
