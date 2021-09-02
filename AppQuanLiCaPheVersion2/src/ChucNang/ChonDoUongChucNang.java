package ChucNang;

import DanhMuc.*;
import Object.*;
import java.util.*;

public class ChonDoUongChucNang {
	private DanhSachDoUong danhSachDoUong;
	private DanhSachChonDoUong danhSachChonDoUong;
	
	public ChonDoUongChucNang() {
		this.setDanhSachChonDoUong(new DanhSachChonDoUong());
		this.setDanhSachDoUong(new DanhSachDoUong());
	}
	
	public DanhSachDoUong getDanhSachDoUong() {
		return danhSachDoUong;
	}
	public void setDanhSachDoUong(DanhSachDoUong danhSachDoUong) {
		this.danhSachDoUong = danhSachDoUong;
	}
	public DanhSachChonDoUong getDanhSachChonDoUong() {
		return danhSachChonDoUong;
	}
	public void setDanhSachChonDoUong(DanhSachChonDoUong danhSachChonDoUong) {
		this.danhSachChonDoUong = danhSachChonDoUong;
	}
	
	public void chonDoUong(ChonDoUong chonDoUong) {
		chonDoUong.input();
		this.getDanhSachChonDoUong().chonDoUong(chonDoUong);
		ChonDoUong.setCount(chonDoUong.getID());
	}
	public void tongSoTienChonDoUong(ChonDoUong chonDoUong) {
		Iterator<ChonDoUong> i = this.getDanhSachChonDoUong().layDanhSachChonDoUong();
		double soTien = 0;
		for(;i.hasNext();) {
			chonDoUong = (ChonDoUong)i.next();
			Iterator<DoUong> j = this.getDanhSachDoUong().timDoUongTheoTen(chonDoUong.getDoUong().getTenDoUong());
			if(j.hasNext()) {
				DoUong doUong = (DoUong)j.next();
				soTien = doUong.getGiaTien() * chonDoUong.getSoLuong();	
			}
		}
		chonDoUong.setSoTien(soTien);
	}
	public void xoaDanhSachDoUong() {
		this.getDanhSachChonDoUong().xoaDanhSachChonDoUong();
	}
	public void xemDanhSachChonDoUong() {
		Iterator<ChonDoUong> i = this.getDanhSachChonDoUong().layDanhSachChonDoUong();
		if(i.hasNext()) {
			System.out.printf("\n%-3s %-35s %-15s %s\n","ID","Đồ uống","Số lượng","Số tiền");
			for(;i.hasNext();) {
				ChonDoUong chonDoUong = (ChonDoUong)i.next();
				chonDoUong.display();
			}
		}else {
			System.out.println("Chưa chọn món");
		}
	}
}
