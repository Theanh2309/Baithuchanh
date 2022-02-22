import java.util.Scanner;
public class App8 { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=1,max=0;
	while (x!=0){
		System.out.println("Nhap so nguyen :");
	    x=sc.nextInt();
		if(max<x) max=x;
		
	}
	System.out.println("Max= "+max);
        sc.close();
    }
}