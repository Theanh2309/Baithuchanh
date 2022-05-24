import java.util.LinkedList;
import java.util.Scanner;
public class App111 {
    public static void main(String[] args) throws Exception {
        int n,number,sum = 0,count =0;
        double tbc;
  
    Scanner scanner = new Scanner(System.in);
    LinkedList<Integer> linkedList = new LinkedList<>();
         
    System.out.println("Nhap vao so phan tu cua danh sach: ");
    n = scanner.nextInt();
    
    for (int i = 0; i < n; i++) {
        System.out.println("Nhap vao phan tu thu " + i + ": ");
        number = scanner.nextInt();
        linkedList.add(number);
    }
         
    for (int i = 0; i < n; i++) {
        if (linkedList.get(i) % 2 == 0) {
            sum += linkedList.get(i);
            count++; 
        }
    }
         
        tbc = (double)sum / count;
        System.out.println("Trung binh cong cua cac so chan trong danh sach = " + tbc);
        scanner.close();
    }

}
