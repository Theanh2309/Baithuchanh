package model;
import java.util.Scanner;

import util.Configs;
public class NhanVienFullTime extends NhanVien {
    private int ngaylamthem;
    private int loaichucvu;
    private int songaylamthem;
    Scanner sc=new Scanner(System.in);

    public NhanVienFullTime(String ten){
        this.ten=ten;
    }

    public NhanVienFullTime(String ten,int ngaylamthem){
        this.ten=ten;
        this.ngaylamthem=ngaylamthem;
    }

    public void setLoaiChucVu(int loaichucvu){
        this.loaichucvu=loaichucvu;
    }

    public String loaiNhanVien(){
        return "nhan vien toan thoi gian";
    }

    public void tinhLuong(){
        luong=Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH+(800000*ngaylamthem);
        System.out.println("luong full time cua linh "+ten+" la: "+luong);
    }

    public void tinhLuong(){
        luong=Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP+(800000*ngaylamthem);
        System.out.println("luong full time cua xep"+ten+ "la: "+luong);
    }

}
