package ChucNang;

import java.util.*;
import DanhMuc.DanhSachDoUong;
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
	
	public void hienThiLoaiDoUong() {
		System.out.println("1. Cà phê");
		System.out.println("2. Sinh tố");
		System.out.println("3. Đá xay");
		System.out.println("4. Hồng trà");
		System.out.println("5. Trà sữa");
		System.out.println("6. Topping");
		System.out.println("7. Khác");
		System.out.print("Nhập lựa chọn: ");
	}
	public void themDoUong() {
		DoUong doUong = new DoUong();
		this.hienThiLoaiDoUong();
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
		System.out.println("Nhập tên món: ");
		String tenDoUong = sc.nextLine();
		this.getDanhSachDoUong().xoaDoUongTheoTen(tenDoUong);
	}
	public void capNhatDoUong() {
		System.out.println("Nhập tên món: ");
		String tenDoUong = sc.nextLine();
		this.getDanhSachDoUong().suaThongTinDoUongTheoTen(tenDoUong);
	}
	public void timDoUong() {
		System.out.println("Nhập tên món: ");
		String tenDoUong = sc.nextLine();
		Iterator<DoUong> i = this.getDanhSachDoUong().timDoUongTheoTen(tenDoUong);
		if(i.hasNext()) {
			DoUong doUong = (DoUong)i.next();
			doUong.display();
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
