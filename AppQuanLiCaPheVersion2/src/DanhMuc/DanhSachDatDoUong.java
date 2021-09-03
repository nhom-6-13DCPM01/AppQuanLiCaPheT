package DanhMuc;

import java.util.*;
import Object.DatDoUong;

public class DanhSachDatDoUong {
	private List<DatDoUong> danhSachDatDoUong;
	
	public DanhSachDatDoUong() {
		this.setDanhSachDatDoUong(new ArrayList<DatDoUong>());
	}

	public List<DatDoUong> getDanhSachDatDoUong() {
		return danhSachDatDoUong;
	}
	public void setDanhSachDatDoUong(List<DatDoUong> danhSachDatDoUong) {
		this.danhSachDatDoUong = danhSachDatDoUong;
	}
	
	public void datDoUong(DatDoUong datDoUong) {
		this.getDanhSachDatDoUong().add(datDoUong);
	}
	public void xoaDatDoUong() {
		this.getDanhSachDatDoUong().clear();
	}
	public Iterator<DatDoUong> layDanhSachDatDoUong(){
		List<DatDoUong> danhSach = new ArrayList<DatDoUong>();
		for(Iterator<DatDoUong> i = this.getDanhSachDatDoUong().iterator();i.hasNext();) {
			DatDoUong datDoUong = (DatDoUong)i.next();
			danhSach.add(datDoUong);
		}
		return danhSach.iterator();
	}
}
