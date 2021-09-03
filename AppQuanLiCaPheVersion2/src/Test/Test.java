package Test;

import java.util.Scanner;
import ChucNang.*;
import DanhMuc.*;
import HienThi.BanHangHienThi;
import HienThi.DoUongHienThi;
import HienThi.NhanVienHienThi;
import HienThi.TaiKhoanHienThi;
import Object.*;

public class Test {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		BanHangHienThi banHangHienThi = new BanHangHienThi();
		banHangHienThi.xuLy();
	}
}
