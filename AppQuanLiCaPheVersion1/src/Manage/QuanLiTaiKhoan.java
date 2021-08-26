package Manage;

import java.util.*;
import Object.TaiKhoan;

public class QuanLiTaiKhoan {
	private List<TaiKhoan> quanLiTaiKhoan;
	
	public QuanLiTaiKhoan() {
		this.setQuanLiTaiKhoan(new ArrayList<TaiKhoan>());
	}

	public List<TaiKhoan> getQuanLiTaiKhoan() {
		return quanLiTaiKhoan;
	}

	public void setQuanLiTaiKhoan(List<TaiKhoan> quanLiTaiKhoan) {
		this.quanLiTaiKhoan = quanLiTaiKhoan;
	}
	
	public void themTaiKhoan(TaiKhoan taiKhoan) {
		this.getQuanLiTaiKhoan().add(taiKhoan);
	}
	public void xoaTaiKhoanTheoID(int ID) {
		for(Iterator<TaiKhoan> i = this.quanLiTaiKhoan.iterator();i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(taiKhoan.getIdTaiKhoan() == ID) {
				i.remove();
			}
		}
	}
	public void suaThongTinTaiKhoanTheoID(int idTaiKhoan) {
		for(Iterator<TaiKhoan> i = this.quanLiTaiKhoan.iterator();i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(taiKhoan.getIdTaiKhoan() == idTaiKhoan) {
				taiKhoan.input();
				break;
			}
		}
	}
	public void xuat() {
		for(Iterator<TaiKhoan> i = this.quanLiTaiKhoan.iterator();i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			taiKhoan.display();
		}
	}
	public Iterator<TaiKhoan> timTaiKhoanTheoID(int ID) {
		List<TaiKhoan> danhSachTim = new ArrayList<TaiKhoan>();
		for(Iterator<TaiKhoan> i = this.quanLiTaiKhoan.iterator();i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(taiKhoan.getIdTaiKhoan() == ID)
				danhSachTim.add(taiKhoan);
			return danhSachTim.iterator();
		}
		return null;
	}
}
