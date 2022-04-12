package slide72;

public class HinhTron {
    private final float Pi= 3.14f;
    private float banKinh;

    public void setBanKinh(float banKinh){
            this.banKinh=banKinh;
    }

    public float getBanKinh(){
        return banKinh;
    }

    public float tinhChuVi(){
        return 2 *Pi *banKinh;
    }

    public float tinhDienTich(){
        return Pi*banKinh*banKinh;
    }
}
