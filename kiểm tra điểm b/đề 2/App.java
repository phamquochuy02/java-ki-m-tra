import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so giang vien : ");
        int soGv;
        soGv = sc.nextInt();

        giangVien[] gv = new giangVien[soGv]; 
        for(int i = 0;i < soGv;i++){
            System.out.println("Nhap vao thong tin cua giang vien thu " + (i+1) + ":");
            gv[i] = new giangVien();
            gv[i].nhapThongTin();
        }
        
        int soGvDayJava = 0;
        for(int i = 0;i < soGv;i++){
            if(gv[i].mon == "LaptrinhJava"){
                soGvDayJava++;
            }
        }

        for(int i = 0;i < soGv;i++){
            gv[i].tinhLuong();
            gv[i].inThongTin();
        } 
    
        System.out.println("So giang vien day mon lap trinh java la : " + soGvDayJava);
    }
}