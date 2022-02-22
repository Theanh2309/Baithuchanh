import java.util.Scanner;
public class App3 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("nhap so: ");
        n=sc.nextInt();
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0){
                System.out.println("khong phai la so nguyen to");
            }
            else{
                System.out.println("la so nguyen to");
            }
        sc.close();
    }
}