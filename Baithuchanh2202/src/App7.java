import java.util.Scanner;
public class App7 { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("nhap so thuc bat ki: ");
            float n=sc.nextFloat();
            if(n>0 || n<0){
            System.out.println("so ban vua nhap la: "+n);
              continue;
            }
            if(n==0){
                break;
            }
        }
        sc.close();
        
    }
}
