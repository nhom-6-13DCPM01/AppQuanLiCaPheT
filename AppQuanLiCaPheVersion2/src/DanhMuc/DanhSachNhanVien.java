package DanhMuc;

import java.util.*;

import Object.*;

public class DanhSachNhanVien {
	private List<NhanVien> danhSachNhanVien;
	
	public DanhSachNhanVien() {
		this.setDanhSachNhanVien(new ArrayList<NhanVien>());
		this.khoiTaoNhanVien();
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
	public void xoaNhanVien(String ten, String ngaySinh) {
		String str ="";
		for(Iterator<NhanVien> i = this.getDanhSachNhanVien().iterator();i.hasNext();) {
			NhanVien nhanVien = (NhanVien)i.next();
			if(nhanVien.getTen().equalsIgnoreCase(ten)) {
				if(nhanVien.getNgaySinh().equalsIgnoreCase(ngaySinh)) {
					i.remove();
					str = "";break;
				}else {
					str = "Không tìm thấy";
				}
			}
		}
		System.out.println(str);
	}
	public Iterator<NhanVien> timNhanTheoTenVaNgaySinh(String ten, String ngaySinh) {
		List<NhanVien> danhSachTim = new ArrayList<NhanVien>();
		for(Iterator<NhanVien> i = this.getDanhSachNhanVien().iterator();i.hasNext();) {
			NhanVien nhanVien = (NhanVien)i.next();
			if(!nhanVien.getTen().equalsIgnoreCase(ten))
				continue;
			if(!nhanVien.getNgaySinh().equals(ngaySinh))
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
	public void khoiTaoNhanVien() {
		NhanVien thinh = new NhanVien("Trương Văn Tiến Thịnh", "122 Âm Binh, Phường Cô hồn, Quận Các Đảng", "thinh@gmail.com", "23/05/2001", "123456789", "Nhân viên");
		this.themNhanVien(thinh);
		NhanVien truong = new NhanVien("Phan Nhựt Trường", "16 Bông Mai, Phường Bông Đào, Quận Chợ Bông", "truong@gmail.com", "11/02/2001", "244466666", "Nhân viên");
		this.themNhanVien(truong);
		NhanVien viet = new NhanVien("Nguyễn Lê Việt", "24 Cây cỏ, Phường Gió Mây, Quận Đồi Núi", "viet@gmail.com", "21/09/2001", "222211119", "Nhân viên");
		this.themNhanVien(viet);
		NhanVien thu = new NhanVien("Phạm Tân Thư", "35 Lười, Phường Đi Làm, Quận Lắm Chuyện", "thu@gmail.com", "10/01/2001", "74040740", "Nhân viên");
		this.themNhanVien(thu);
		NhanVien giang = new NhanVien("Nguyễn Thị Quỳnh Giang", "15 Đa Nhiệm, Phường GPU, Quận Card Màn Hình", "giang@gmail.com", "28/02/2001", "370370370", "Quản lí");
		this.themNhanVien(giang);
	}
}
