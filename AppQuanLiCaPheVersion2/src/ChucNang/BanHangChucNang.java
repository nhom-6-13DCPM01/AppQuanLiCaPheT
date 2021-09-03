package ChucNang;

import java.util.*;
import Object.*;

public class BanHangChucNang {
	Scanner sc = new Scanner(System.in);
	private DatDoUongChucNang datDoUongChucNang;
	private ChonDoUongChucNang chonDoUongChucNang;
	private HoaDonChucNang hoaDonChucNang;
	
	public BanHangChucNang() {
		this.setChonDoUongChucNang(new ChonDoUongChucNang());
		this.setDatDoUongChucNang(new DatDoUongChucNang());
		this.setHoaDonChucNang(new HoaDonChucNang());
	}

	public DatDoUongChucNang getDatDoUongChucNang() {
		return datDoUongChucNang;
	}
	public void setDatDoUongChucNang(DatDoUongChucNang datDoUongChucNang) {
		this.datDoUongChucNang = datDoUongChucNang;
	}
	public ChonDoUongChucNang getChonDoUongChucNang() {
		return chonDoUongChucNang;
	}
	public void setChonDoUongChucNang(ChonDoUongChucNang chonDoUongChucNang) {
		this.chonDoUongChucNang = chonDoUongChucNang;
	}
	public HoaDonChucNang getHoaDonChucNang() {
		return hoaDonChucNang;
	}
	public void setHoaDonChucNang(HoaDonChucNang hoaDonChucNang) {
		this.hoaDonChucNang = hoaDonChucNang;
	}
	
	public void chonDoUong() {
		boolean nhapTiep = false;
		do {
			ChonDoUong chonDoUong = new ChonDoUong();
			nhapTiep = false;
			this.getChonDoUongChucNang().chonDoUong(chonDoUong);
			this.getChonDoUongChucNang().tongSoTienChonDoUong(chonDoUong);
			System.out.println("Chọn đồ uống tiếp không? (Y/N)");
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("Y"))
				nhapTiep = true;
		}while(nhapTiep);
		ChonDoUong.setCount(0);
		this.hienThiHoaDonChonDoUong();
	}
	public void datDoUong() {
		this.getDatDoUongChucNang().datDoUong();
		System.out.println("\nChọn đồ uống\n");
		this.chonDoUong();
		this.hienThiHoaDonDatDoUong();
	}
	public void hienThiHoaDonChonDoUong() {
		this.getChonDoUongChucNang().xemDanhSachChonDoUong();
		this.getChonDoUongChucNang().xoaChonDoUong();
	}
	public void hienThiHoaDonDatDoUong() {
		this.getDatDoUongChucNang().hienThiDatDoUong();
		this.getChonDoUongChucNang().xemDanhSachChonDoUong();
		this.getChonDoUongChucNang().xoaChonDoUong();
		this.getDatDoUongChucNang().xoaDatDoUong();
	}
}
