import java.util.Scanner;
public class App1 {
       public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so thu nhat: ");
        a= sc.nextInt();
        System.out.println("nhap so thu hai: ");
        b= sc.nextInt();
        System.out.println("UCLN cua 2 so la: "+USCLN(a, b));
        sc.close();
    }
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
     


}
