import java.util.Scanner;
public class App5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(sum<100){
            System.out.println("nhap so: ");
            int a=sc.nextInt();
            sum+=a;
        }
        System.out.print("Sum: "+sum);

        sc.close();
    }
    
}
