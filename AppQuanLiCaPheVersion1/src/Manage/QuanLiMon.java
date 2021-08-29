package Manage;

import java.util.*;
import Object.*;

public class QuanLiMon {
	//thuộc tính
	private List<Mon> quanLiMon;
	
	//hàm tạo
	public QuanLiMon() {
		this.setQuanLiMon(new ArrayList<Mon>());
	}

	//get set
	public List<Mon> getQuanLiMon() {
		return quanLiMon;
	}
	public void setQuanLiMon(List<Mon> quanLiMon) {
		this.quanLiMon = quanLiMon;
	}
	
	//phương thức
	//thêm món có tham chiếu là một món
	public void themMon(Mon mon) {
		this.getQuanLiMon().add(mon);
	}
	//xóa món theo id
	public void xoaMonTheoID(int ID) {
		for(Iterator<Mon> i = this.getQuanLiMon().iterator();i.hasNext();) {
			Mon mon = (Mon)i.next();
			if(mon.getIdMon() == ID) {
				i.remove();
			}
		}
	}
	//cập nhật món theo id
	public void suaThongTinMonTheoID(int ID) {
		for(Iterator<Mon> i = this.quanLiMon.iterator();i.hasNext();) {
			Mon mon = (Mon)i.next();
			if(mon.getIdMon() == ID) {
				mon.input();
				break;
			}
		}
	}
	//hiển thị danh sách
	public void xuat() {
		for(Iterator<Mon> i = this.getQuanLiMon().iterator();i.hasNext();) {
			Mon mon = (Mon)i.next();
			mon.display();
		}
	}
	//tìm món theo id có kiểu trả về là mộ iterator
	public Iterator<Mon> timMonTheoID(int ID){
		List<Mon> danhSachTim = new ArrayList<Mon>();
		for(Iterator<Mon> i = this.quanLiMon.iterator();i.hasNext();) {
			Mon mon = (Mon)i.next();
			if(mon.getIdMon() == ID)
				danhSachTim.add(mon);
			return danhSachTim.iterator();
		}
		return null;
	}
}
