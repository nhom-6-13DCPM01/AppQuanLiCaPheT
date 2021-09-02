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
	public void suaDanhSachDatDoUong() {
		
	}
}
