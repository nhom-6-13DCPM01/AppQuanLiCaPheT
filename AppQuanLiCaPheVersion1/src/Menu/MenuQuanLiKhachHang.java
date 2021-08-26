package Menu;

import java.util.*;
import Manage.QuanLiKhachHang;
import Object.KhachHang;

public class MenuQuanLiKhachHang {
	private QuanLiKhachHang quanLiKhachHang = new QuanLiKhachHang();
	Scanner sc = new Scanner(System.in);
	boolean nhapTiep = false;
	
	public MenuQuanLiKhachHang() {
		this.xuLy();
	}

	public QuanLiKhachHang getQuanLiKhachHang() {
		return quanLiKhachHang;
	}
	public void setQuanLiKhachHang(QuanLiKhachHang quanLiKhachHang) {
		this.quanLiKhachHang = quanLiKhachHang;
	}
	
	public void menuQuanLiKhachHang() {
		System.out.println("1. Thêm khách hàng");
		System.out.println("2. Xóa khách hàng");
		System.out.println("3. Cập nhật khách hàng");
		System.out.println("4. Tìm khách hàng");
		System.out.println("5. Xem thông tin khách hàng");
		System.out.println("6. thoát");
		System.out.print("Nhập lựa chọn: ");
	}
	public void xuLy() {
		int luaChon = 0;
		do {
			this.menuQuanLiKhachHang();
			luaChon = Integer.parseInt(sc.nextLine());
			switch(luaChon) {
			case 1: this.themKhachHang();nhapTiep = true;break;
			case 2: this.xoaKhachHang();nhapTiep = true;break;
			case 3: this.capNhatKhachHang();nhapTiep = true;break;
			case 4: this.timKhachHang();nhapTiep = true;break;
			case 5: this.getQuanLiKhachHang().xuat();nhapTiep = true;break;
			default: nhapTiep = false;break;
			}
		}while(nhapTiep);
	}
	public void themKhachHang() {
		KhachHang khachHang = new KhachHang();
		khachHang.input();
		this.getQuanLiKhachHang().themKhachHang(khachHang);
		KhachHang.setCount(khachHang.getIdKhachHang());
	}
	public void xoaKhachHang() {
		this.getQuanLiKhachHang().xuat();
		System.out.print("Nhập ID khách hàng cần xóa: ");
		int ID = Integer.parseInt(sc.nextLine());
		this.getQuanLiKhachHang().xoaKhachHangTheoID(ID);
	}
	public void capNhatKhachHang() {
		this.getQuanLiKhachHang().xuat();
		System.out.print("Nhập ID khách hàng cần sửa: ");
		int ID = Integer.parseInt(sc.nextLine());
		this.getQuanLiKhachHang().suaThongTinKhachHangTheoID(ID);
	}
	public void timKhachHang() {
		this.getQuanLiKhachHang().xuat();
		System.out.println("Nhập ID khách hàng cần tìm: ");
		int ID = Integer.parseInt(sc.nextLine());
		Iterator<KhachHang> i = this.getQuanLiKhachHang().timKhachHangTheoID(ID-1);
		if(i.hasNext()) {
			KhachHang khachHang = (KhachHang)i.next();
			khachHang.display();
		}
	}
}
