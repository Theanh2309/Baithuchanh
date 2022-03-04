import java.util.Scanner;

public class App11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so phan tu: ");
        int n =sc.nextInt();
        int a[]= new int[n];
        
        System.out.print("Nhap cac phan tu cua mang: \n");
    
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        sortASC(a);
        System.out.println("Day so đuoc sap xep tang dan: ");
        show(a);
    }
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
     
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    }
