package src;
import java.util.Scanner;

public class App90 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String s = sc.next();
        char kytu;
        System.out.println("Cac ky tu co trong chuoi la: ");
        for (int i = 0; i < s.length(); i++) {
            kytu = s.charAt(i);    
            System.out.println(kytu);
            sc.close();
        }
    }
}

