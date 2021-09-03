package ChucNang;

import java.util.*;
import DanhMuc.DanhSachDoUong;
import HienThi.DoUongHienThi;
import Object.*;

public class DoUongChucNang {
	Scanner sc = new Scanner(System.in);
	private DanhSachDoUong danhSachDoUong;
	
	public DoUongChucNang() {
		this.setDanhSachDoUong(new DanhSachDoUong());
	}

	public DanhSachDoUong getDanhSachDoUong() {
		return danhSachDoUong;
	}
	public void setDanhSachDoUong(DanhSachDoUong danhSachDoUong) {
		this.danhSachDoUong = danhSachDoUong;
	}
	
	public void themDoUong() {
		DoUong doUong = new DoUong();
		int luaChon = Integer.parseInt(sc.nextLine());
		switch(luaChon) {
		case 1:
			doUong.input();
			doUong.setLoaiMon(LoaiDoUong.CÀPHÊ);break;
		case 2:
			doUong.input();
			doUong.setLoaiMon(LoaiDoUong.SINHTỐ);break;
		case 3:
			doUong.input();
			doUong.setLoaiMon(LoaiDoUong.ĐÁXAY);break;
		case 4:
			doUong.input();
			doUong.setLoaiMon(LoaiDoUong.HỒNGTRÀ);break;
		case 5:
			doUong.input();
			doUong.setLoaiMon(LoaiDoUong.TRÀSỮA);break;
		case 6:
			doUong.input();
			doUong.setLoaiMon(LoaiDoUong.TOPPING);break;
		}
	}
	public void xoaDoUong() {
		System.out.print("Nhập tên món cần xóa: ");
		String tenDoUong = sc.nextLine();
		this.getDanhSachDoUong().xoaDoUongTheoTen(tenDoUong);
	}
	public void capNhatDoUong() {
		DoUongHienThi doUongHienThi = new DoUongHienThi();
		System.out.println("Nhập tên món cần cập nhật: ");
		String tenDoUong = sc.nextLine();
		Iterator<DoUong> j = this.getDanhSachDoUong().layDanhSachDoUong();
		Iterator<DoUong> i = this.getDanhSachDoUong().timDoUongTheoTen(tenDoUong);
		if(i.hasNext()) {
			DoUong doUongSoSanh = (DoUong)i.next();
			for(;j.hasNext();) {
				DoUong doUong = (DoUong)j.next();
				if(doUong == doUongSoSanh) {
					doUongHienThi.hienThiLoaiDoUong();
					int luaChon = Integer.parseInt(sc.nextLine());
					switch(luaChon) {
					case 1:
						doUong.input();
						doUong.setLoaiMon(LoaiDoUong.CÀPHÊ);break;
					case 2:
						doUong.input();
						doUong.setLoaiMon(LoaiDoUong.SINHTỐ);break;
					case 3:
						doUong.input();
						doUong.setLoaiMon(LoaiDoUong.ĐÁXAY);break;
					case 4:
						doUong.input();
						doUong.setLoaiMon(LoaiDoUong.HỒNGTRÀ);break;
					case 5:
						doUong.input();
						doUong.setLoaiMon(LoaiDoUong.TRÀSỮA);break;
					case 6:
						doUong.input();
						doUong.setLoaiMon(LoaiDoUong.TOPPING);break;
					}
				}
			}
		}else {
			System.out.println("Không tìm thấy");
		}
	}
	public void timDoUong() {
		System.out.println("Nhập tên món: ");
		String tenDoUong = sc.nextLine();
		Iterator<DoUong> i = this.getDanhSachDoUong().timDoUongTheoTen(tenDoUong);
		if(i.hasNext()) {
			DoUong doUong = (DoUong)i.next();
			System.out.printf("\n%-3s %-30s %-15s %s","ID","TÊN","LOẠI","GIÁ");
			doUong.display();
		}else {
			System.out.println("Không tìm thấy");
		}
	}
	public void xemDanhSachDoUong() {
		Iterator<DoUong> i = this.getDanhSachDoUong().layDanhSachDoUong();
		if(i.hasNext()) {
			System.out.printf("\n%-3s %-30s %-15s %s","ID","TÊN","LOẠI","GIÁ");
			for(;i.hasNext();) {
				DoUong doUong = (DoUong)i.next();
				doUong.display();
			}
		}
	}
}
