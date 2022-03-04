import java.util.Scanner;
import java.time.LocalDateTime;
public class App3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("nhap ten: ");
        name=sc.nextLine();
        int namsinh;
        System.out.println("nhap namsinh: ");
        namsinh=sc.nextInt();
        LocalDateTime localDate = LocalDateTime.now();
        int year = localDate.getYear();
        int age=year-namsinh;
        if(age<16){
            System.out.println("Ban "+name+" o do tuoi vi thanh nien");
        }else if(age>=16&&namsinh<18){
            System.out.println("Ban "+name+" o do tuoi truong thanh");
        }else{
            System.out.println("Ban "+name+" da gia");
        }
    sc.close();
    }
}
