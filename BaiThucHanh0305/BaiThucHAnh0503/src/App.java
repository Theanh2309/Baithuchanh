import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        //add 5 ptu
        ArrayList<String> a = new ArrayList<>();
        a.add("Cao");
        a.add("The");
        a.add("Anh");
        a.add("play");
        a.add("videogame");
        System.out.println(a);

        //Sử dụng vòng lặp for để duyệt qua ArrayList và hiển thị giá trị các phần tử trong ArrayList
        for ( int i = 0; i< a.size();i++){
            System.out.println(a.get(i));
        }

        //Sử dụng phướng thức Set để thay đổi giá trị tại phần tử thứ 5 trong ArrayList, sau đó hiển thị lại toàn bộ giá trị của các phần tử.
        a.set(4, "football");
        System.out.println(a);

        

    }
}
