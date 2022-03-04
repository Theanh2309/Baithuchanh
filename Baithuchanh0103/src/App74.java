package src;

import java.util.Scanner;
public class App74 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so phan tu: ");
        int n =sc.nextInt();
        int a[]= new int[n];
        int i=0;
        int sum=0;
        while(i<n){
            System.out.println("nhap phan tu thu"+i+":");
            a[i]=sc.nextInt();
            i++;
        }
        for(int x:a){
            if(x%2==0) {sum+=x;}
        }
        System.out.println("tong cac phan tu chan la: "+sum);
      
    sc.close();

    }
}