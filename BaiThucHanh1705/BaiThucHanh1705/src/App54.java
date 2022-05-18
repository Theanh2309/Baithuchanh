import java.util.HashSet;
import java.util.Scanner;
public class App54 {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> hashsetint = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        // them ptu vao hashset
            hashsetint.add(0);
            hashsetint.add(3);
            hashsetint.add(1);
            hashsetint.add(4);
            hashsetint.add(2);
            hashsetint.add(8);
        System.out.println(hashsetint);
        System.out.println("nhap so luong phan tu muon them: ");
        int n = sc.nextInt();
        int number ; 
        for (int i =0 ; i < n; i++){
            System.out.println("Nhap phan tu can them: ");
                number = sc.nextInt();
            if (!hashsetint.contains(number)) {
                hashsetint.add(number);
                System.out.println("Them thanh cong!");
            } else {
                System.out.println("Phan tu " + number + " da ton tai!");
            }
        }
        System.out.println("Cac phan tu trong hashSetInteger sau khi them: ");
        System.out.println(hashsetint);

        
        // xoa mot phan tu 
        hashsetint.remove(3);
        hashsetint.remove(2);
        hashsetint.remove(1);
        System.out.println("Cac phan tu trong hashSetInteger sau khi xoa la: "+ hashsetint);
        sc.close();

    }
}
