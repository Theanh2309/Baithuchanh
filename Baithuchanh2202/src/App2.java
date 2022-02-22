import java.util.Scanner;
public class App2 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    System.out.println("nhap canh thu nhat: ");
    a=sc.nextInt();
    System.out.println("nhap canh thu hai: ");
    b=sc.nextInt();
    System.out.println("nhap canh thu ba: ");
    c=sc.nextInt();
    if( a<b+c && b<a+c && c<a+b ){
        if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
            System.out.println("Day la tam giac vuong");
        else if(a==b && b==c)
            System.out.println("Day la tam giac deu");
        else if(a==b || a==c || b==c)
            System.out.println("Day la tam giac can");
        else if(a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b && a==b || a==c || b==c )    
            System.out.println("Day la tam giac vuong can");
        else
            System.out.println("Day la tam giac thuong");
    }
    else
        System.out.println("Ba canh a, b, c khong phai la ba canh cua mot tam giac");
        sc.close();
    }
  }
