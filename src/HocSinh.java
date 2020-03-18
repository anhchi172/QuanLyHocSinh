public class HocSinh {
    private String hoTen;
    private int tuoi;
    private String queQuan;
public HocSinh(String h, int t, String q){
    hoTen = h;
    tuoi = t;
    queQuan = q;
}
public String getHoTen(){
    return hoTen;
}
public int getTuoi(){
    return tuoi;
}
public String getQueQuan(){
    return queQuan;
}

public String toString(){
    return ("Ho Ten: "+ hoTen + " Tuoi: "+ tuoi + " Que Quan: " + queQuan);
}

}
