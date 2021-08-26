package Object;

public class HoaDon {
	private int idHoaDon;
	private KhachHang khachHang;
	private NhanVien nhanVien;
	private Mon mon;
	private String chiTiet;
	private double tongTien;
	
	public HoaDon() {
		
	}
	public HoaDon(int idHoaDon, KhachHang khachHang, NhanVien nhanVien, Mon mon, String chiTiet, double tongTien) {
		this.idHoaDon = idHoaDon;
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.mon = mon;
		this.chiTiet = chiTiet;
		this.tongTien = tongTien;
	}
	
	public int getIdHoaDon() {
		return idHoaDon;
	}
	public void setIdHoaDon(int idHoaDon) {
		this.idHoaDon = idHoaDon;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public Mon getMon() {
		return mon;
	}
	public void setMon(Mon mon) {
		this.mon = mon;
	}
	public String getChiTiet() {
		return chiTiet;
	}
	public void setChiTiet(String chiTiet) {
		this.chiTiet = chiTiet;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	@Override
	public String toString() {
		return "HoaDon [idHoaDon=" + idHoaDon + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", mon=" + mon
				+ ", chiTiet=" + chiTiet + ", tongTien=" + tongTien + "]";
	}
	public void display() {
		System.out.println(this.toString());
	}
}
