package Object;

import java.util.Scanner;

public class DatDoUong {
	//thuộc tính
	private NhanVien nhanvien;
	private KhachHang khachHang;
	Scanner sc = new Scanner(System.in);
	
	//Hàm tạo
	public DatDoUong() {
		
	}
	public DatDoUong(KhachHang khachHang, NhanVien nhanVien,int ID) {
		this.setKhachHang(khachHang);
		this.setNhanvien(nhanVien);
	}
	
	//get set
	public NhanVien getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	
	//phương thức
	public void input() {
		System.out.println("Nhập họ và tên khách hàng: ");
		this.getKhachHang().setTen(sc.nextLine());
		System.out.println("Nhập họ và tên nhân viên: ");
		this.getNhanvien().setTen(sc.nextLine());
	}
	public void display() {
		System.out.println("\n"+"Họ và tên khách hàng: "+this.getKhachHang().getTen());
		System.out.println("Họ và tên nhân viên phụ trách: "+this.getNhanvien().getTen()+"\n");
	}
}
