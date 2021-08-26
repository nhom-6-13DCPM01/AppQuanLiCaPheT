package Manage;

import java.util.*;
import Object.*;

public class QuanLiNhanVien {
	private List<NhanVien> quanLiNhanVien;
	
	public QuanLiNhanVien() {
		this.setQuanLiNhanVien(new ArrayList<NhanVien>());
	}

	public List<NhanVien> getQuanLiNhanVien() {
		return quanLiNhanVien;
	}

	public void setQuanLiNhanVien(List<NhanVien> quanLiNhanVien) {
		this.quanLiNhanVien = quanLiNhanVien;
	}
	
	public void themNhanVien(NhanVien nhanVien) {
		this.getQuanLiNhanVien().add(nhanVien);
	}
	public void xoaNhanVienTheoID(int ID) {
		for(Iterator<NhanVien> i = this.quanLiNhanVien.iterator();i.hasNext();) {
			NhanVien nhanVien = (NhanVien)i.next();
			if(nhanVien.getIdNhanVien() == ID) {
				i.remove();
			}
		}
	}
	public NhanVien suaThongTinNhanVienTheoID(int ID) {
		for(Iterator<NhanVien> i = this.quanLiNhanVien.iterator();i.hasNext();) {
			NhanVien nhanVien = (NhanVien)i.next();
			if(nhanVien.getIdNhanVien() == ID) {
				return nhanVien;
			}
		}
		return null;
	}
	public Iterator<NhanVien> timNhanVienTheoID(int ID){
		for(Iterator<NhanVien> i = this.quanLiNhanVien.iterator();i.hasNext();) {
			NhanVien nhanVien = (NhanVien)i.next();
			if(nhanVien.getIdNhanVien() != ID)
				continue;
			return i;
		}
		return null;
	}
}
