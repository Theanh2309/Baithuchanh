import java.util.Scanner;
public class App10 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap chuoi: ");
    String s =sc.next();
    System.out.println("nhap ki tu : ");;
    char c=sc.next().charAt(0);
    int dem=0;
    for(int i=0;i<s.length();i++){
        if(c==s.charAt(i)){
            dem++;
        }
    }
    System.out.print("so lan xuat hien ki tu do la: "+dem);
    sc.close();
    }
    
}
