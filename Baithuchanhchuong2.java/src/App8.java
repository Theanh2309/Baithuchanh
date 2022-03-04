import java.util.Scanner;
public class App8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so luong so muon tinh tbc: ");
        int n=sc.nextInt();
        float tbc;
        int s;
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print("nhap so thu"+i+":");
            s=sc.nextInt();
            sum =sum +s;
        }  
        tbc=(float)(sum)/n; 
        System.out.print("TBC cua cac so do la: "+tbc);
        sc.close();
    }
}
