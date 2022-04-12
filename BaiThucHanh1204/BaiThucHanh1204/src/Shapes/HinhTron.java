package Shapes;
import java.util.Scanner;
public class HinhTron extends HinhHoc{
    public float banKinh;
    public HinhTron(){
          ten="Hinh Tron";
    }
    public void nhapBanKinh(){
        System.out.println("ban kinh = ");
        Scanner sc= new Scanner(System.in);
        banKinh= sc.nextFloat();
        sc.close();
    }

    public void tinhChuVi(){
        chuVi=2*Pi*banKinh;
    }

    public void tinhDienTich(){
        dienTich=banKinh*Pi*banKinh;
    }
}
