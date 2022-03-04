import java.util.Scanner;
public class App6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so muon tinh giai thua: ");
        int n=sc.nextInt();
        int giaithua=1;
        int i=1;
        do{
            giaithua=giaithua*i;;
            i++;
        }while(i<=n);
        System.out.print("giai thua cua so do la: "+ giaithua);
        sc.close();
    }
}
