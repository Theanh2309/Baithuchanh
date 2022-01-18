import java.util.Scanner;
public class baithuchanh1801 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double heSoA,heSoB,heSoC,x,x1,x2;
        System.out.println("Nhap he so a:");
           heSoA=sc.nextDouble();
        System.out.println("Nhap he so b:");
           heSoB=sc.nextDouble();
        System.out.println("Nhap he so c:");
           heSoC=sc.nextDouble();
        double delta= (heSoB*heSoB)-(4*heSoA*heSoC);
           if(delta < 0){
                System.out.println("Phuong trinh vo nghiem");
           }
           else if(delta == 0){
                 x= -(heSoB)/(2*heSoA);
                System.out.println("phuong trinh co nghiem kep X1=X2="+x);
            }else{
                System.out.println("phuong trinh co 2 nghiem phan biet:");
                x1=(-heSoB+Math.sqrt(delta))/(2*heSoA);
                x2=(-heSoB-Math.sqrt(delta))/(2*heSoA);
                System.out.println("nghiem X1 la: "+x1);
                System.out.println("nghiem X2 la: "+x2);
            }
        
    }
    
}
