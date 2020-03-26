import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class LopHocSinh implements Serializable {
    private ArrayList<HocSinh> al;
    private HocSinhDAO hocSinhDAO;

    public LopHocSinh(){
        hocSinhDAO = new HocSinhDAO();
        al = (ArrayList<HocSinh>) hocSinhDAO.read();
    }

    public void add(HocSinh h){
        al.add(h);
        hocSinhDAO.write(al);
        System.out.println("Da add hoc sinh "+ h.getHoTen() + " vao danh sach");
    }

    public void hienThi20Tuoi() {
        //boolean found = false;
        ArrayList<HocSinh> res = al.stream().filter(HocSinh -> HocSinh.getTuoi() == 20).collect(Collectors.toCollection(ArrayList::new));
        /*for (HocSinh h : al) {
            if (h.getTuoi() == 20) {
                System.out.println(h.toString());
                found = true;
            }

            }*/
        if (res.size() <= 0) {
            System.out.println("Ko tim thay hoc sinh 20 tuoi");
        } else {
            res.forEach(HocSinh -> System.out.println(HocSinh.toString()));
        }
    }

    public int soHocSinh(int tuoi, String queQuan) {
        int count = 0;

       /* for (HocSinh h: al){
            if (h.getTuoi() == tuoi && h.getQueQuan().equalsIgnoreCase(queQuan))
                count++;
    }*/
        return (int) al.stream().filter(HocSinh -> HocSinh.getTuoi() == tuoi && HocSinh.getQueQuan().equalsIgnoreCase(queQuan.replace(" ", ""))).count();
    }

    public void exit(){
        System.out.println("Exit");
        return;
    }
}
