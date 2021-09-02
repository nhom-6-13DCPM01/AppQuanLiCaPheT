package Object;

import java.util.Scanner;

public class KhachHang extends Nguoi {
	//thuộc tính
	private static int count = 0;
	Scanner sc = new Scanner(System.in);
	private int idKhachHang, soLanOrder;

	//hàm tạo
	public KhachHang(){
		this.setIdKhachHang(++count);
	}
	public KhachHang(int soLanOrder) {
		this.setSoLanOrder(soLanOrder);
	}
	public KhachHang(String ten, String diaChi, String email, String ngaySinh, String soDienThoai, int soLanOrder) {
		super(ten, diaChi, email, ngaySinh, soDienThoai);
		this.setIdKhachHang(++count);
		this.setSoLanOrder(soLanOrder);
	}
	
	//get set
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		KhachHang.count = count;
	}
	public int getIdKhachHang() {
		return this.idKhachHang;
	}

	public void setIdKhachHang(int idKhachHang) {
		this.idKhachHang = idKhachHang;
	}

	public int getSoLanOrder() {
		return this.soLanOrder;
	}

	public void setSoLanOrder(int soLanOrder) {
		this.soLanOrder = soLanOrder;
	}

	//phương thức
	//hiển thị
	public void display() {
		System.out.printf("\n%-3s %-25s %-50s %-30s %-15s %-15s %s","ID","HỌ VÀ TÊN","ĐỊA CHỈ","EMAIL","NGÀY SINH","SỐ LẦN ORDER");
		System.out.printf("\n%-3d %-25s %-50s %-30s %-15s %-15s %d\n",this.getIdKhachHang(),this.getTen(),this.getDiaChi(),this.getEmail(),this.getNgaySinh(),this.getSoLanOrder());
	}
	//nhập thông tin
	public void input() {
		System.out.print("Nhập họ và tên: ");
		this.setTen(sc.nextLine());
		System.out.print("Nhập địa chỉ: ");
		this.setDiaChi(sc.nextLine());
		System.out.print("Nhập email: ");
		this.setEmail(sc.nextLine());
		System.out.print("Nhập số điện thoại: ");
		this.setSoDienThoai(sc.nextLine());
		System.out.print("Nhập ngày sinh: ");
		this.setNgaySinh(sc.nextLine());
	}
}