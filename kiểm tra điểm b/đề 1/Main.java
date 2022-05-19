import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số lượng hóa đơn: ");
		int n = scanner.nextInt();
		HoaDon gv[] = new HoaDon[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào thông tin của hóa đơn thứ " + (i + 1));
			gv[i] = new HoaDon();
			gv[i].Nhap();
		}
		System.out.println("Thông tin các hóa đơn vừa nhập là: ");
		for (HoaDon hoaDon : gv) {
			hoaDon.Xuat();
			System.out.println("Tổng tiền: " + hoaDon.tinhTien());
		}
		scanner.close();
	}

}