
package NhanVien;
import java.util.ArrayList;
public class AppArr{

    public static void showList(ArrayList<nhanvien> a ){
        for ( int i = 0; i < a.size();i++){
            System.out.println(a.get(i));
        }
    }
    public static void main(String[] args){
       ArrayList<nhanvien> nv = new ArrayList<>();
       nhanvien nv1 = new nhanvien(1, "Nguyen Van A", "Hanoi");
       nhanvien nv2 = new nhanvien(2, "Nguyen Van B", "HCM"); 
       nhanvien nv3 = new nhanvien(3, "Nguyen Van C", "Danang");
       nhanvien nv4 = new nhanvien(4, "Nguyen Van D", "Ninhbinh");
       nv.add(nv1);
       nv.add(nv2);
       nv.add(nv3);
       nv.remove(nv3);
       nv.set(3, nv4);
       System.out.println("hello");
       showList(nv);
    
    }
    

}