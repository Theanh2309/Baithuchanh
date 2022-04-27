
import Shapes.Point;
import Shapes.Triangle;
import Shapes.Quadrilateral;
public class App2604 {
    public static void main(String[] args) throws Exception {
        System.out.println("BAI 1");
        Point A = new Point();
        Point B = new Point();
        A.setX(2.0);
        System.out.println(A.getX());
        A.setY(3.0);
        System.out.println(A.getY()) ;
        A.setPointXY("A", 2.0, 3.0);
        A.getPointXY();

        System.out.println("BAI 2");
        Triangle tg = new Triangle();
        Point P1 = new Triangle();
         P1.setPointXY("A", 1, 4);
         P1.getPointXY();

        Point P2 = new Triangle();
        P2.setPointXY("B", 2, 3);
        P2.getPointXY();

        Point P3 = new Triangle();
        P3.setPointXY("C", 2, 2);
        P3.getPointXY();
        
        
        System.out.println("Test 3 diem bat ki");
        Triangle tinh = new Triangle();
        tinh.check();

        System.out.println("BAI 3");
        Quadrilateral tugiac = new Quadrilateral();
        tugiac.check();
    }
}

