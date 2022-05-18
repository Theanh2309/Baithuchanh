import java.util.HashSet;
import java.util.Scanner;
public class App56 {
    public static void main(String[] args) throws Exception {
        HashSet<String> hashsetstring = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n ;
        String thuonghieu; 
        hashsetstring.add("adidas");
        hashsetstring.add("nike");
        hashsetstring.add("dior");
        System.out.println(hashsetstring);

        System.out.println("nhap so luong phan tu muon them: ");
            n=sc.nextInt();
        for (int i = 0 ; i < n; i++){
            System.out.println("Nhap phan tu can them: ");
                thuonghieu = sc.nextLine();
            if (!hashsetstring.contains(thuonghieu)) {
                hashsetstring.add(thuonghieu);
                System.out.println("Them thanh cong!");
                
            } else {
                System.out.println("Phan tu " + thuonghieu + " da ton tai!");
            }
        }
        System.out.println("Cac phan tu trong hashSetString sau khi them: ");
                System.out.println(hashsetstring);
        System.out.println("nhap phan tu can xoa: ");
        thuonghieu = sc.nextLine();
        if(hashsetstring.contains(thuonghieu)){
            hashsetstring.remove(thuonghieu);
            System.out.println("xoa thanh cong");
            System.out.println("cac phan tu con lai trong hashsetstring: "+ hashsetstring);
        }else{
            System.out.println("Xoa khong thanh cong");
        }

    sc.close();
    }
}
