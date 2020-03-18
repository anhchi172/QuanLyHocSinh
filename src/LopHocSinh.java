import java.util.ArrayList;

public class LopHocSinh {
    private ArrayList<HocSinh> al;
    public LopHocSinh(){
        al = new ArrayList<>();
    }
    public void add(HocSinh h){
        al.add(h);
        System.out.println("Da add hoc sinh "+ h.getHoTen() + " vao danh sach");
    }
    public void hienThi20Tuoi() {
        boolean found = false;
        for (HocSinh h : al) {
            if (h.getTuoi() == 20) {
                System.out.println(h.toString());
                found = true;
            }

            }
        if (!found) {
            System.out.println("Ko tim thay hoc sinh 20 tuoi");
        }
    }

    public int soHocSinh(int tuoi, String queQuan) {
        int count = 0;
        for (HocSinh h: al){
            if (h.getTuoi() == tuoi && h.getQueQuan().equalsIgnoreCase(queQuan))
                count++;
    }
        return count;
    }

    public void exit(){
        System.out.println("Exit");
        return;
    }
}
