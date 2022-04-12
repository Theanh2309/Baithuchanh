package slide73;

public class SinhVien {
    String ten;
    String tuoi;

    public String getTen(){
        return ten;
    }

    public void setTen(String ten){
        if(ten == null || ten.isEmpty() ){
            this.ten="khong biet";

        }else{
            this.ten=ten;
        }
    }

    public String getTuoi(){
        if(Integer.valueOf(tuoi) != -1){
            // tuoi hiop le
            return tuoi;
        }else{
            return "tuoi khong hop le";
        }
    }

    public void setTuoi(int tuoi){
        if(tuoi > 18){
            this.tuoi=String.valueOf(tuoi);
        }else{
            this.tuoi=String.valueOf(-1);
        }
    }

}
