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
	public void xoaHoaDonTheoID(int ID) {
		for(Iterator<HoaDon> i = this.getQuanLiHoaDon().iterator();i.hasNext();) {
			HoaDon hoaDon = (HoaDon)i.next();
			if(hoaDon.getIdHoaDon() == ID)
				i.remove();
		}
	}
	public void xuat() {
		for (HoaDon hoaDon : quanLiHoaDon) {
			hoaDon.display();
		}
	}
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
