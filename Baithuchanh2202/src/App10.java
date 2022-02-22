import java.util.Scanner;
public class App10 { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so nguyen : ");
        n = sc.nextInt();
        int count=0;
        while(n>=10){
            n/=10; 
            count++;
        }
        System.out.println("so luong so trong so vua nhap la:" + count+1);
        sc.close();
    }
}