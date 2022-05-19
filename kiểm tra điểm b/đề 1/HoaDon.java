import java.util.Scanner;

public class HoaDon {
	private String soHoaDon;
	private String ngayBan;
	private String tenHang;
	private int soLuong;
	private double giaBan;
	Scanner scanner = new Scanner(System.in);

	public void Nhap() {
		System.out.println("Nhập vào số hóa đơn: ");
		soHoaDon = scanner.nextLine();
		System.out.println("Nhập vào ngày bán: ");
		ngayBan = scanner.nextLine();
		System.out.println("Nhập vào tên hàng: ");
		tenHang = scanner.nextLine();
		System.out.println("Nhập vào số lượng: ");
		soLuong = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập vào giá bán: ");
		giaBan = Double.parseDouble(scanner.nextLine());
	}

	public void Xuat() {
		System.out.println("Số hóa đơn: " + soHoaDon);
		System.out.println("Ngày bán: " + ngayBan);
		System.out.println("Tên hàng: " + tenHang);
		System.out.println("Số lượng: " + soLuong);
		System.out.println("Giá bán: " + giaBan);
		System.out.println();
	}

	public double tinhTien() {
		return this.soLuong * this.giaBan;
	}
}