import java.util.ArrayList;
public class App16 {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> a = new ArrayList<>();
        a.add("JAVA");
        a.add("PHP");
        a.add("C#");
        a.add("C++");
        
        // for thong thuong
        for(int i=0; i<a.size();i++){
            System.out.println(a.get(i));
        }

    }
}
