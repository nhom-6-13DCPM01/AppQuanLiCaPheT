package DanhMuc;

import java.util.*;
import Object.TaiKhoan;

public class DanhSachTaiKhoan {
	private List<TaiKhoan> danhSachTaiKhoan = new ArrayList<TaiKhoan>();
	
	public DanhSachTaiKhoan() {
		this.setDanhSachTaiKhoan(new ArrayList<TaiKhoan>());
		this.khoiTaoTaiKhoan();
	}

	public List<TaiKhoan> getDanhSachTaiKhoan() {
		return danhSachTaiKhoan;
	}
	public void setDanhSachTaiKhoan(List<TaiKhoan> danhSachTaiKhoan) {
		this.danhSachTaiKhoan = danhSachTaiKhoan;
	}
	
	public void themTaiKhoan(TaiKhoan taiKhoan) {
		this.getDanhSachTaiKhoan().add(taiKhoan);
	}
	public void xoaTaiKhoanTheoTenDangNhap(String tenDangNhap) {
		String str = "";
		for(Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().iterator();i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(taiKhoan.getTenDangNhap().equals(tenDangNhap)) {
				i.remove();
				str = "";break;
			}else {
				str = "Không tìm thấy";
			}
		}
		System.out.println(str);
	}
	public Iterator<TaiKhoan> layDanhSachTaiKhoan() {
		List<TaiKhoan> danhSach = new ArrayList<TaiKhoan>();
		for(Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().iterator();i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			danhSach.add(taiKhoan);
		}
		return danhSach.iterator();
	}
	public Iterator<TaiKhoan> timTaiKhoanTheoTenDangNhap(String tenDangNhap) {
		List<TaiKhoan> danhSachTim = new ArrayList<TaiKhoan>();
		for(Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().iterator();i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(!taiKhoan.getTenDangNhap().equals(tenDangNhap))
				continue;
			danhSachTim.add(taiKhoan);
			return danhSachTim.iterator();
		}
		return null;
	}
	public void khoiTaoTaiKhoan() {
		TaiKhoan taiKhoanThinh = new TaiKhoan("TruongVanTienThinh", "TVTT", "Trương Văn Tiến Thịnh");
		this.themTaiKhoan(taiKhoanThinh);
		TaiKhoan taiKhoanTruong = new TaiKhoan("PhanNhutTruong", "PNT", "Phan Nhựt Trường");
		this.themTaiKhoan(taiKhoanTruong);
		TaiKhoan taiKhoanGiang = new TaiKhoan("NguyenThiQuynhGiang", "NTQG", "Nguyễn Thị Quỳnh Giang");
		this.themTaiKhoan(taiKhoanGiang);
		TaiKhoan taiKhoanViet = new TaiKhoan("NguyenLeViet", "NLV", "Nguyễn Lê Việt");
		this.themTaiKhoan(taiKhoanViet);
		TaiKhoan taiKhoanThu = new TaiKhoan("PhamTanThu", "PTT", "Phạm Tân Thư");
		this.themTaiKhoan(taiKhoanThu);
	}
}
