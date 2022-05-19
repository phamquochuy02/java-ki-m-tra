import java.util.Scanner;

public class giangVien {
    public String hoTen;
    public int namSinh;
    public String mon;
    public int luong;
    public float heSoLuong;
    public float luongDaTinh;

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ho ten : ");
        hoTen = sc.nextLine();
        System.out.print("Nhap vao nam sinh : ");
        namSinh = sc.nextInt();
        System.out.print("Nhap vao mon giang day : ");
        mon = sc.next();
        System.out.print("Nhap vao he so luong : ");
        heSoLuong = sc.nextFloat();
        System.out.print("Nhap vao luong : ");
        luong = sc.nextInt();
    }

    public void tinhLuong(){
        luongDaTinh = luong * heSoLuong;
    }

    public void inThongTin(){
        System.out.println("Ho va ten : " + hoTen);
        System.out.println("Nam sinh : " + namSinh);
        System.out.println("Mon giang day : " + mon);
        System.out.println("Luong : " + luongDaTinh);
    }

    // public void ketQua(){
    //     int soGvDayJava = 0;
    //     for(int i = 0;i < soGv;i++){
    //         if(gv[i].mon == "LaptrinhJava"){
    //             soGvDayJava += 1;
    //         }
    //     }
    //     System.out.println("So giang vien day mon lap trinh java la : " + soGvDayJava);
    // }

}