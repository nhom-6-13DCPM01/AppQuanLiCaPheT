package DanhMuc;

import java.util.*;
import Object.HoaDon;

public class DanhSachHoaDon {
	private List<HoaDon> danhSachHoaDon;
	
	public DanhSachHoaDon() {
		this.setDanhSachHoaDon(new ArrayList<HoaDon>());
	}

	public List<HoaDon> getDanhSachHoaDon() {
		return danhSachHoaDon;
	}
	public void setDanhSachHoaDon(List<HoaDon> danhSachHoaDon) {
		this.danhSachHoaDon = danhSachHoaDon;
	}
	
	public void themHoaDon(HoaDon hoaDon) {
		this.getDanhSachHoaDon().add(hoaDon);
	}
	public void xoaHoaDonTheoID(int ID) {
		String str = "";
		for(Iterator<HoaDon> i = this.getDanhSachHoaDon().iterator();i.hasNext();) {
			HoaDon hoaDon = (HoaDon)i.next();
			if(hoaDon.getIdHoaDon() == ID) {
				i.remove();
				str = "";break;
			}else {
				str = "Không tìm thấy";
			}
		}
		System.out.println(str);
	}
	public Iterator<HoaDon> timHoaDonTheoID(int ID) {
		List<HoaDon> danhSachTim = new ArrayList<HoaDon>();
		for(Iterator<HoaDon> i = this.getDanhSachHoaDon().iterator();i.hasNext();) {
			HoaDon hoaDon = (HoaDon)i.next();
			if(hoaDon.getIdHoaDon() != ID)
				continue;
			danhSachTim.add(hoaDon);
			return danhSachTim.iterator();
		}
		return null;
	}
	public Iterator<HoaDon> layDanhSachHoaDon(){
		List<HoaDon> danhSachHoaDon = new ArrayList<HoaDon>();
		for(Iterator<HoaDon> i = this.getDanhSachHoaDon().iterator();i.hasNext();) {
			HoaDon hoaDon = (HoaDon)i.next();
			danhSachHoaDon.add(hoaDon);
		}
		return danhSachHoaDon.iterator();
	}
}
