import java.util.Scanner;

public class App9 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String s =sc.nextLine();
        int demktt=0;
        int demkth=0;
        int demso=0;
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)<='z' && s.charAt(i)>='a'){
                    demktt++;
                }
                else if(s.charAt(i)<='Z' && s.charAt(i)>='A'){
                    demkth++;
                }
                else{
                    demso++;
                }
 
                
            }
        System.out.println("so ki tu chu thuong la: "+demktt);
        System.out.println("so ki tu chu hoa la: "+demkth);
        System.out.println("so ki tu chu so la: "+demso);
        sc.close();
    }
}
