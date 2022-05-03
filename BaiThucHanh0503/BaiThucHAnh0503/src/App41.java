import java.util.LinkedList;
import java.util.Scanner;
public class App41 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> a = new LinkedList<>();
            a.add("thang 1");
            a.add("thang 2");
            a.add("thang 3");
            a.add("thang 4");
            a.add("thang 5");
            a.add("thang 6");
            a.add("thang 7");
            a.add("thang 8");
            a.add("thang 9");
            a.add("thang 10");
            a.add("thang 11");
            a.add("thang 12");
        System.out.println("nhap vao chi so cua phan tu can lay: ");
        int index = sc.nextInt();
        if((index <0)|| (index>(a.size()-1))){
            System.out.println("chi so can lay phai lon hon 0 va nho hon "+ (a.size()-1));
        }else{
            String node = a.get(index);
            System.out.println("phan tu co chi so = "+ index + " trong linkedlist la "+node);
        }
        String firstNode =a.getFirst();
        String lastNode = a.getLast();
        System.out.println("phan tu dau tien trong danh sach la: "+ firstNode+" phan tu cuoi cung trong danh sach la "+ lastNode);
    }
}
