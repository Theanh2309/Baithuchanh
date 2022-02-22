import java.util.Scanner;
public class App9 { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so nguyen : ");
        n = sc.nextInt();
        System.out.println("So dao nguoc cua " + n+ " la ");
        for (; n != 0; n = n / 10) {
            System.out.println(n % 10);
        }
        sc.close();
    }
}
