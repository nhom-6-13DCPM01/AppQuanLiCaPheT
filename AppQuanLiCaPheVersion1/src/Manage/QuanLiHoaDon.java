package Manage;

import java.util.*;
import Object.*;

public class QuanLiHoaDon {
	//thuộc tính
	private List<HoaDon> quanLiHoaDon;
	
	//hàm tạo
	public QuanLiHoaDon() {
		this.setQuanLiHoaDon(new ArrayList<HoaDon>());
	}

	//get set
	public List<HoaDon> getQuanLiHoaDon() {
		return quanLiHoaDon;
	}
	public void setQuanLiHoaDon(List<HoaDon> quanLiHoaDon) {
		this.quanLiHoaDon = quanLiHoaDon;
	}
	
	//phương thức
	//thêm hóa đơn có tham chiếu là một hóa đơn
	public void themHoaDon(HoaDon hoaDon) {
		this.getQuanLiHoaDon().add(hoaDon);
	}
	//xóa hóa đơn theo id
	public void xoaHoaDonTheoID(int ID) {
		for(Iterator<HoaDon> i = this.getQuanLiHoaDon().iterator();i.hasNext();) {
			HoaDon hoaDon = (HoaDon)i.next();
			if(hoaDon.getIdHoaDon() == ID)
				i.remove();
		}
	}
	//hiển thị danh sách
	public void xuat() {
		for (HoaDon hoaDon : quanLiHoaDon) {
			hoaDon.display();
		}
	}
	//tìm hóa đơn theo id có kiểu trả về là iterator
	public Iterator<HoaDon> timHoaDonTheoID(int ID){
		List<HoaDon> danhSachTim = new ArrayList<HoaDon>();
		for(Iterator<HoaDon> i = this.quanLiHoaDon.iterator();i.hasNext();) {
			HoaDon hoaDon = (HoaDon)i.next();
			if(hoaDon.getIdHoaDon() == ID)
				danhSachTim.add(hoaDon);
			return danhSachTim.iterator();
		}
		return null;
	}
}
