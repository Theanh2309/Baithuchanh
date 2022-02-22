import java.util.Scanner;
public class App11 { 
    public static void main(String[] args){
        int count=0;
        for(int i=0;i<=20;++i){
            for(int j=0;j<=10;++j){
                for(int k=0;k<=4;++k){
                    if(10000*i+20000*j+50000*k==200000){
                        System.out.println("can phai co "+i+"to tien menh gia 10000, "+j+"to tien menh gia 20000 va"+k"to tien menh gia 50000");
                        count++;
                    }
                }
            }
        }
        System.out.println("co tat ca "+count+"cach chia"); 
    }
}