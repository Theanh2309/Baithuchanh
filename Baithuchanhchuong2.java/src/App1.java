import java.util.Scanner;
public class App1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("nhap so thu nhat: ");
        a=sc.nextInt();
        System.out.println("nhap so thu hai: ");
        b=sc.nextInt();
        float f=a/b;
        System.out.println("Tong hai so la: "+ (a+b));
        System.out.println("Hieu hai so la: "+ (a-b));
        System.out.println("Tich hai so la: "+ (a*b));
        System.out.println("Thuong hai so la: "+ f);
        System.out.println("chia lay phan du hai so la: "+ (a%b));
        System.out.println("so lon hon la: "+ (a>b?a:b)); 
        sc.close();
    }
}
