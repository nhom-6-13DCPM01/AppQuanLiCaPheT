package ChucNang;

import java.util.*;
import DanhMuc.DanhSachHoaDon;
import Object.HoaDon;

public class HoaDonChucNang {
	Scanner sc = new Scanner(System.in);
	private DanhSachHoaDon danhSachHoaDon;
	
	public HoaDonChucNang() {
		this.setDanhSachHoaDon(new DanhSachHoaDon());
	}
	public DanhSachHoaDon getDanhSachHoaDon() {
		return danhSachHoaDon;
	}
	public void setDanhSachHoaDon(DanhSachHoaDon danhSachHoaDon) {
		this.danhSachHoaDon = danhSachHoaDon;
	}
	
	public void themHoaDon(HoaDon hoaDon) {
		this.getDanhSachHoaDon().themHoaDon(hoaDon);
		HoaDon.setCount(hoaDon.getIdHoaDon());
	}
	public void xoaHoaDon(int idHoaDon) {
		this.getDanhSachHoaDon().xoaHoaDonTheoID(idHoaDon);
	}
	public void timHoaDon(int idHoaDon) {
		Iterator<HoaDon> i = this.getDanhSachHoaDon().timHoaDonTheoID(idHoaDon);
		if(i.hasNext()) {
			HoaDon hoaDon = (HoaDon)i.next();
			hoaDon.display();
		}else {
			System.out.println("Không tìm thấy");
		}
	}
}
