package model;
import util.Configs;
public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;// tong so gio lam viec cua nhan vien
    public NhanVienPartTime(String ten, int gioLamViec){
        this.ten=ten;
        this.gioLamViec=gioLamViec;
    }
   // ghi de
    public String loaiNhanVien(){
        return "nhan vien thoi vu";
    }
    public void tinhLuong(){
        luong=Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    
    }
    
}
