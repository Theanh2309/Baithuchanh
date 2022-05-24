import java.util.ArrayList;
public class App21 {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> a = new ArrayList<>();
        a.add("JAVA");
        a.add("PHP");
        a.add("C#");
        a.add("C++");
        a.remove("JAVA");
        a.add("HTML");
        a.add("CSS");

        System.out.println(a.get(2));
        System.out.println(a.contains("HTML"));
        System.out.println(a.contains("NOTEJS"));
        System.out.println(a.size());
        System.out.println(a);
        System.out.println(a.set(0, "RUBY"));
        System.out.println(a);
        
    }
}