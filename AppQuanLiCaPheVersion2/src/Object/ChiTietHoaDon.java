package Object;

import java.text.*;
import java.util.Date;

public class ChiTietHoaDon {
	private int idHoaDon;
	private Date ngayLapHoaDon;
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	private static int count = 0;
	
	public ChiTietHoaDon() {
		this.setIdHoaDon(++count);
		this.setNgayLapHoaDon(new Date());
	}

	public int getIdHoaDon() {
		return idHoaDon;
	}
	public void setIdHoaDon(int idHoaDon) {
		this.idHoaDon = idHoaDon;
	}
	public String getNgayLapHoaDon() {
		return this.df.format(ngayLapHoaDon);
	}
	public void setNgayLapHoaDon(Date ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		ChiTietHoaDon.count = count;
	}
	
	public void display() {
		System.out.println("ID hóa đơn: "+this.getIdHoaDon()+"\t\t"+"Ngày lập hóa đơn: "+this.getNgayLapHoaDon()+"\n");
	}
}
