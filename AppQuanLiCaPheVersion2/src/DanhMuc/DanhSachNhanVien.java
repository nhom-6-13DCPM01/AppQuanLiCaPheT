package DanhMuc;

import java.util.*;

import Object.*;

public class DanhSachNhanVien {
	private List<NhanVien> danhSachNhanVien;
	
	public DanhSachNhanVien() {
		this.setDanhSachNhanVien(new ArrayList<NhanVien>());
	}

	public List<NhanVien> getDanhSachNhanVien() {
		return danhSachNhanVien;
	}
	public void setDanhSachNhanVien(List<NhanVien> danhSachNhanVien) {
		this.danhSachNhanVien = danhSachNhanVien;
	}
	
	public void themNhanVien(NhanVien nhanVien) {
		this.getDanhSachNhanVien().add(nhanVien);
	}
	public void xoaNhanVienTheoTen(String ten) {
		
	}
	public void suaNhanVienTheoTen(String ten) {
		
	}
	public Iterator<NhanVien> timNhanTheoTen(String ten) {
		List<NhanVien> danhSachTim = new ArrayList<NhanVien>();
		for(Iterator<NhanVien> i = this.getDanhSachNhanVien().iterator();i.hasNext();) {
			NhanVien nhanVien = (NhanVien)i.next();
			if(!nhanVien.getTen().equalsIgnoreCase(ten))
				continue;
			danhSachTim.add(nhanVien);
			return danhSachTim.iterator();
		}
		return null;
	}
	public Iterator<NhanVien> layDanhSachNhanVien() {
		List<NhanVien> danhSach = new ArrayList<NhanVien>();
		for(Iterator<NhanVien> i = this.getDanhSachNhanVien().iterator();i.hasNext();) {
			NhanVien nhanVien = (NhanVien)i.next();
			danhSach.add(nhanVien);
		}
		return danhSach.iterator();
	}
	
}
