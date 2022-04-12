
import model.NhanVienFullTime;

import model.NhanVienPartTime;

import util.Configs;

public class App77 {
    public static void main(String[] args) throws Exception  {

        // Công ty có 3 nhân viên toàn thời gian, trong đó có 1 sếp, sếp không làm thêm ngày nào​

       NhanVienFullTime sep = new NhanVienFullTime("Trần Văn Sếp");

        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        sep.loaiNhanVien();
        sep.tinhLuong();

        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyễn Văn Lính"); // Không làm thêm ngày nào​
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        linh1.loaiNhanVien();

        NhanVienFullTime linh2 = new NhanVienFullTime("Lê Thị Lính", 3); // Làm thêm 3 ngày​
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        linh2.loaiNhanVien();
        linh2.tinhLuong();

       NhanVienPartTime pt = new NhanVienPartTime("Hoa", 1);
       pt.tinhLuong();
    }
}
