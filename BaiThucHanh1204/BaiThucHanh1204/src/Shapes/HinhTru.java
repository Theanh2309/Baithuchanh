package Shapes;
import java.util.Scanner;
public class HinhTru extends HinhTron{
    public float chieuCao;

    public HinhTru(){
        ten="Hinh Tru";
    }

    public void nhapChieuCao(){
        nhapBanKinh();
        System.out.println("chai cao hinh tru =");
        Scanner sc=new Scanner(System.in);
        chieuCao= sc.nextFloat();
        sc.close();
    }

    public void tinhTheTich(){
        tinhDienTich();
        theTich=dienTich*chieuCao;
    }
    
}
