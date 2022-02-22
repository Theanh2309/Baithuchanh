import java.util.Scanner;
public class App4 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("nhap so: ");
        n=sc.nextInt();
        System.out.println("Tat ca cac so nguyen to nho hon la: \n"+ n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (kiemtra(i)) {
                System.out.println(" " + i);
            }
        }
        sc.close();
    }
    
     
    // check snt
        public static boolean kiemtra(int n){
            if(n <2) return false;
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
    
        }
    }
