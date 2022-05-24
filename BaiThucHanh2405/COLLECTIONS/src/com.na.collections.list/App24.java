import java.util.ArrayList;
import java.util.Scanner;

public class App24 {
    public static void main (String[] args) {
        ArrayList<Integer> arrayListIntegers=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number; 

        System.out.println("Nhập các phần tử của ArrayList:");
        int n = scanner.nextInt();
       
        for (int i = 0; i<n;i++) {
            System.out.print("nhập phần tử thứ "+i+":");
            number= scanner.nextInt();
            arrayListIntegers.add(number);
        }
        int max = arrayListIntegers.get(0);

        for (int i = 1; i<arrayListIntegers.size(); i++) {
            if (arrayListIntegers.get(i).compareTo(max)>0) {
                max = arrayListIntegers.get(i);
            }
        }
        System.out.println("phần tử lớn nhất trong arrListInteger=" +max);

        }
    }
