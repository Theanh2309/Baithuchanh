

import slide73.SinhVien;
public class App73 {
    public static void main(String[] args){
        SinhVien sv1=new SinhVien();
        SinhVien sv2=new SinhVien();
        sv1.setTen("");
        sv1.setTuoi(23);

        sv2.setTen("peter");
        sv2.setTuoi(17);

        System.out.println("SInh vien 1 co ten: "+sv1.getTen()+"; tuoi la: "+sv1.getTuoi());
        System.out.println("SInh vien 2 co ten: "+sv2.getTen()+"; tuoi la: "+sv2.getTuoi());
    }
}
