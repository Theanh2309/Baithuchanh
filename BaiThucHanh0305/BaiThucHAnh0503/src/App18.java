import java.util.ArrayList;
import java.util.Iterator;
public class App18 {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> a = new ArrayList<>();
        a.add("JAVA");
        a.add("PHP");
        a.add("C#");
        a.add("C++");

        // duyet mang bang Interator
        Iterator<String> it = a.iterator(); 
        System.out.println("cac phan tu co trong mang la: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        

    }
}
