import java.util.ArrayList;
import java.util.Scanner;
public class App110 {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Integer> a = new ArrayList<>();
        int n, number;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang: ");
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu thu " + i +": ");
            number = sc.nextInt();
            a.add(number);
        }

        int max = a.get(0);    
         
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i).compareTo(max) > 0) {
                max = a.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arrListInteger = " + max);
    
// yeu cau 2
        System.out.print("Nhap phan tu can xoa: ");
        int k = sc.nextInt();
        boolean isRemoved = a.removeIf(x -> x.equals(Integer.valueOf(k)) );
        if (isRemoved) {
            System.out.println("Xoa thanh cong");
        }
        System.out.print("Cac phan tu con lai: ");
        for (Integer o : a) {
            System.out.print(o + " ");
        }


// yeu cau 3
        for (int i = 0; i < a.size()-1; i++){
            for (int j = i+1; i < a.size(); j++){
                 if (a.get(i) > a.get(j)){
                    int temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
        System.out.print("List sau khi sap xep: ");
        for (int i = 0; i < a.size(); i ++){
            System.out.print(a.get(i) + " ");
        }

    
    }
}

    //    a.sort((o1, o2) -> o1 - o2);
    //    System.out.println("mang sau khi sap xep la: "+a);
    //    sc.close();
