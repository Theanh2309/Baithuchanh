import java.util.Scanner;
public class App6 { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can tim cac so hoan thien nho hon no: ");
        int n =sc.nextInt();
    //    System.out.println("Tat ca cac so hoan thien nho hon la: \n"+ n);
        for(int i=6;i<n;i++){
            if (kiemtrasht(i)) {
                System.out.println(" " + i);
            }
        }
        sc.close();
    }

    public static boolean kiemtrasht(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0) 
              sum+=i;
        }
        if(sum==n){
            return true;
        }
  
        else {
           return false;
        }

    }
}
