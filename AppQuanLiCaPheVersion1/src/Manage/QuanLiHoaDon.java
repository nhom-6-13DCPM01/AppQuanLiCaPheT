package Manage;

import java.util.*;
import Object.*;

public class QuanLiHoaDon {
	private List<HoaDon> quanLiHoaDon;
	
	public QuanLiHoaDon() {
		this.setQuanLiHoaDon(new ArrayList<HoaDon>());
	}

	public List<HoaDon> getQuanLiHoaDon() {
		return quanLiHoaDon;
	}

	public void setQuanLiHoaDon(List<HoaDon> quanLiHoaDon) {
		this.quanLiHoaDon = quanLiHoaDon;
	}
	
	public void themHoaDon(HoaDon hoaDon) {
		this.getQuanLiHoaDon().add(hoaDon);
	}
	public void xoaHoaDon(HoaDon hoaDon) {
		this.getQuanLiHoaDon().remove(hoaDon);
	}
	/*public void suaThongTinHoaDon(int idHoaDon, KhachHang khachHang, NhanVien nhanVien, Mon mon, String chiTiet, double tongTien) {
		for(Iterator<HoaDon> i = this.quanLiHoaDon.iterator();i.hasNext();) {
			HoaDon hoaDon = (HoaDon)i.next();
			if(hoaDon.getIdHoaDon() == idHoaDon) {
				hoaDon.setKhachHang(khachHang);
				hoaDon.setNhanVien(nhanVien);
				hoaDon.setMon(mon);
				hoaDon.setChiTiet(chiTiet);
				hoaDon.setTongTien(tongTien);
			}
		}
	}*/
	public void xuat() {
		for (HoaDon hoaDon : quanLiHoaDon) {
			hoaDon.display();
		}
	}
	public Iterator<HoaDon> timHoaDon(HoaDon hoaDonTim){
		for(Iterator<HoaDon> i = this.quanLiHoaDon.iterator();i.hasNext();) {
			HoaDon hoaDon = (HoaDon)i.next();
			if(hoaDon.getIdHoaDon() != hoaDonTim.getIdHoaDon())
				continue;
			return i;
		}
		return null;
	}
}
