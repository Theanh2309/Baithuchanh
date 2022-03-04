import java.util.Scanner;
public class App2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("nhap so ban muon kiem tra: ");
        a=sc.nextInt();
        System.out.println( a%2==0?"so chan":"so le");
        sc.close();
    }
}
