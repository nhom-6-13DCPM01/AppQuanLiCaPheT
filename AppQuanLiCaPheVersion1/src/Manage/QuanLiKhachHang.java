package Manage;

import java.util.*;
import Object.*;

public class QuanLiKhachHang {
	//thuộc tính
	private List<KhachHang> quanLiKhachHang;
	
	//hàm tạo
	public QuanLiKhachHang() {
		this.setQuanLiKhachHang(new ArrayList<KhachHang>());
	}

	//get set
	public List<KhachHang> getQuanLiKhachHang() {
		return quanLiKhachHang;
	}
	public void setQuanLiKhachHang(List<KhachHang> quanLiKhachHang) {
		this.quanLiKhachHang = quanLiKhachHang;
	}
	
	//phương thức
	//thêm khách hàng có tham chiếu là một khách hàng
	public void themKhachHang(KhachHang khachHang) {
		this.getQuanLiKhachHang().add(khachHang);
	}
	//xóa khách hàng theo id
	public void xoaKhachHangTheoID(int ID) {
		for(Iterator<KhachHang> i = this.getQuanLiKhachHang().iterator();i.hasNext();) {
			KhachHang khachHang = (KhachHang)i.next();
			if(khachHang.getIdKhachHang() == ID) {
				i.remove();
			}
		}
	}
	//cập nhật khách hàng theo id
	public void suaThongTinKhachHangTheoID(int ID) {
		for(Iterator<KhachHang> i = this.quanLiKhachHang.iterator();i.hasNext();) {
			KhachHang khachHang = (KhachHang)i.next();
			if(khachHang.getIdKhachHang() == ID) {
				khachHang.input();
				break;
			}
		}
	}
	//hiển thị danh sách
	public void xuat() {
		for(Iterator<KhachHang> i = this.getQuanLiKhachHang().iterator();i.hasNext();) {
			KhachHang khachHang = (KhachHang)i.next();
			khachHang.display();
		}
	}
	//tìm khách hàng theo id có kiểu trả về là một iterator
	public Iterator<KhachHang> timKhachHangTheoID(int ID){
		List<KhachHang> danhSachTim = new ArrayList<KhachHang>();
		for(Iterator<KhachHang> i = this.quanLiKhachHang.iterator();i.hasNext();) {
			KhachHang khachHang = (KhachHang)i.next();
			if(khachHang.getIdKhachHang() == ID)
				danhSachTim.add(khachHang);
			return danhSachTim.iterator();
		}
		return null;
	}
}
