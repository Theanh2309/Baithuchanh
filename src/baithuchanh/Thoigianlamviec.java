package baithuchanh;

public class Thoigianlamviec extends Employee{
    short time;
    short songaylamviec;
    long luong;
    public Thoigianlamviec(short time, short songaylamviec){
        this.time=time;
        this.songaylamviec=songaylamviec;
    }

    
    public void PartTimeEmployee(){  
        if(time<=8){
           luong=songaylamviec*time*20000;
           System.out.println("so tien lam part time la: "+luong);
        }
    }

    public void FullTimeEmployee(){  
        if(time>=8){
           luong=6000000;
           System.out.println("so tien lam full time la: "+luong);
        }
    }
}
