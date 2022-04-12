import slide72.toaDo;
import slide72.HinhTron;
public class App72 {
    
    public static void main(String[] args) throws Exception {
        HinhTron ht =new HinhTron();
        ht.setBanKinh(10);
        float cv = ht.tinhChuVi();
        float dt=ht.tinhDienTich();
        System.out.println("chu vi hinh tron: "+cv+"; va dien tich hinh tron la: "+dt);
    }
    
}
