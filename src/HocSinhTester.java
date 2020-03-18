import java.util.Scanner;

public class HocSinhTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        LopHocSinh l = new LopHocSinh();
        int count = 0;
        int act;
        do {
            System.out.println("Chon: \n1.Them moi" +
                    "\n2.Hien thi hoc sinh 20 tuoi" +
                    "\n3.So luong hoc sinh 23 tuoi que o DN "+
                    "\n4.Thoat");
            act = checkInput(1, 4);
            if (act == 1) {
                System.out.print("Nhap ho ten: ");
                if(count>0)
                    scan.nextLine();
                String hoTen = scan.nextLine();
                System.out.print("Nhap tuoi: ");
                int tuoi = checkInput(1, Integer.MAX_VALUE);
                System.out.print("Nhap que quan (HN, DN, HCM): ");
                String queQuan = scan.next();
                HocSinh h = new HocSinh(hoTen, tuoi, queQuan);
                l.add(h);
            } else if (act == 2) {
                l.hienThi20Tuoi();

            } else if (act == 3) {
                int res = l.soHocSinh(23, "DN");
                System.out.println("So hoc sinh co tuoi la 23 va que o DN la: " + res);
            }
            else{
                l.exit();
            }
            count++;
        } while (act !=4);

    }






    private static int checkInput(int a, int b){
        Scanner scan = new Scanner (System.in);
        int choice = scan.nextInt();

        while (choice<a || choice>b){
            System.out.println("Du lieu nhap khong phu hop voi yeu cau. Vui long nhap lai:");
            choice = scan.nextInt();
        }

        return choice;
    }
}
