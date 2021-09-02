package Test;

import java.util.Scanner;
import ChucNang.*;
import DanhMuc.*;
import HienThi.TaiKhoanHienThi;
import Object.*;

public class Test {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		TaiKhoanHienThi taiKhoanHienThi = new TaiKhoanHienThi();
		do {
			taiKhoanHienThi.xuLy();
		}while(true);
	}
}
