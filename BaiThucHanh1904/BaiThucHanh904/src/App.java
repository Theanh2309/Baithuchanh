 import javax.tools.Diagnostic;

import Animal.*;
 import baithuchanh.*;
    
    public class App {
        public static void main(String[] args) throws Exception {
        //    Tiger tiger = new Tiger();
        //    tiger.run();
        Person ps = new Person();
        ps.nhapTen();
        ps.nhapDiaChi();
        ps.nhapSoDienThoai();
        ps.inTen();
        ps.inDiaChi();
        ps.inSoDienThoai();
        
        Student std =new Student();
        std.nhapMaHocSinh();
        std.nhapTen();
        std.inMaHocSinh();
        std.inTen();

        Employee emp = new Employee();
        emp.nhapTen();
        emp.nhapDiaChi();;
        emp.nhapSoDienThoai();
        emp.inThongTin();

        FullTimeEmployee nv1 = new FullTimeEmployee(12);
        PartTimeEmployee nv2 = new PartTimeEmployee(3);



        }
        
    }