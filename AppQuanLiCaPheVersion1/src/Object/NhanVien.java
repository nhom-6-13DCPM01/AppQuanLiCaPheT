package Object;

import java.util.Scanner;

public class NhanVien extends Nguoi{
	//thuộc tính
	private static int count = 0;
	Scanner sc = new Scanner(System.in);
	private int idNhanVien;
	private String chucVu;
	private TaiKhoan taiKhoan;
	
	//hàm tạo
	public NhanVien() {
		this.idNhanVien = ++count;
	}
	public NhanVien(String ten, String diaChi, String email, String ngaySinh, int soDienThoai, String chucVu, TaiKhoan taiKhoan) {
		super(ten, diaChi, email, ngaySinh, soDienThoai);
		this.idNhanVien = ++count;
		this.chucVu = chucVu;
		this.taiKhoan = taiKhoan;
	}
	
	//get set
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		NhanVien.count = count;
	}
	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public int getIdNhanVien() {
		return idNhanVien;
	}
	public void setIdNhanVien(int idNhanVien) {
		this.idNhanVien = idNhanVien;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
	//phương thức
	@Override
	public String toString() {
		return super.toString()+"NhanVien [idNhanVien=" + idNhanVien + ", chucVu=" + chucVu + "]";
	}
	//hiern thị
	public void display() {
		System.out.println(this.toString());
	}
	//nhập thông tin
	public void input() {
		System.out.print("Nhập tên nhân viên: ");
		this.setTen(sc.nextLine());
		System.out.print("Nhập địa chỉ: ");
		this.setDiaChi(sc.nextLine());
		System.out.print("Nhập email: ");
		this.setEmail(sc.nextLine());
		System.out.print("Nhập ngày sinh: ");
		this.setNgaySinh(sc.nextLine());
		System.out.print("Nhập số điện thoại: ");
		this.setSoDienThoai(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhập chức vụ: ");
		this.setChucVu(sc.nextLine());
	}
}
