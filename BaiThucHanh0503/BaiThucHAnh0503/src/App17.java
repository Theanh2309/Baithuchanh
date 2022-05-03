import java.util.ArrayList;
public class App17 {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> a = new ArrayList<>();
        a.add("JAVA");
        a.add("PHP");
        a.add("C#");
        a.add("C++");

        // for cai tien
        System.out.println("cac phan tu co trong mang la: ");
        for(String number: a){
            System.out.println(number+"\t");
        }

    }
}
