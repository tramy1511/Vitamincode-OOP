
import entity.chucNang2;
import entity.sinhVien;
import entity.sinhVienTuNhien;
import entity.sinhVienXaHoi;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class quanLySinhVien {
    private ArrayList<sinhVien> quanlysinhvien = new ArrayList<>();
    chucNang2 cn2 = new chucNang2();

    public void themsv(sinhVien sv){
        quanlysinhvien.add(sv);
    }

    public static void main(String[] args) {

        quanLySinhVien ql = new quanLySinhVien();
        ql.themsv(new sinhVienTuNhien(8.0,"Nguyễn Trà My", 20, "Dak Lak", "ps3219", 7.0, 9, 7.5, 9));
        ql.themsv(new sinhVienTuNhien(9.0,"Nguyễn Trà Giang", 16, "Dak Lak", "PS3284", 9.0, 8, 7.5, 9));
        ql.themsv(new sinhVienXaHoi(7.0,"Nguyễn Quốc Nam", 20, "Dak Lak", "PS3288", 4.5, 3, 3.5, 2));
        ql.themsv(new sinhVienXaHoi(10.0,"Nguyễn Thị Mỹ Hạnh", 19, "Dak Lak", "PS4456", 9.0, 9.5, 9.5, 9));

        Scanner scanner = new Scanner(System.in);
        boolean chon = true;git branch  my

        while (chon){
            menu();
            int choice = scanner.nextInt();
            switch (choice){
                    case 1:
                        ql.bai1();
                        break;
                    case 2:
                        ql.bai2();
                        break;
                    case 3:
                        ql.bai3();
                        break;
                    case 4:
                        ql.nhapSV();
                        break;
                    case 5:
                        ql.xuatSV();
                         break;

            }
        }
    }

    public static void menu(){
        System.out.println("1.Danh sách sinh viên có dtb>5");
        System.out.println("2.Danh sách sinh viên có dtb<5");
        System.out.println("3.Danh sách sinh viên có dtb>5 và tăng điểm lên 1");
        System.out.println("4.Nhập thông tin sinh viên");
        System.out.println("5.Xuất thông tin sv:");
        System.out.println("6.Kết Thúc");
        System.out.println("Mời nhập: ");
    }
    public void nhapSV(){
        ArrayList<sinhVien> list = new ArrayList<sinhVien>();
        sinhVien sv;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn sinh viên ? 1.Tự nhiên 2.Xã hội");
        int chon = scanner.nextInt();
        if(chon==1){
            sv= new sinhVienTuNhien();
        }else{
            sv=new sinhVienXaHoi();
        }
        sv.nhapThongTin();
        themsv(sv);

    }
    public void xuatSV(ArrayList<sinhVien> list) {
        System.out.println("Danh sách sinh viên:");
        for (sinhVien sv : list) {
            System.out.println(sv.thongTin());
        }

    }
    public void xuatSV() {
        xuatSV(quanlysinhvien); // Gọi phương thức xuatSV() với danh sách hiện tại
    }



    public void bai1(){
        ArrayList<sinhVien> list = new ArrayList<sinhVien>();
        for(sinhVien sv:quanlysinhvien){
            if(sv.tinhDTB()>5){
                list.add(sv);
            }
        }
        list.sort(cn2.sortTen());
        System.out.println("Danh sách sinh viên có dtb>5 là : ");
        for(sinhVien sv:list){
            System.out.println(sv.thongTin());


        }

    }
    public void bai2(){
        ArrayList<sinhVien> list= new ArrayList<>();
        for(sinhVien sv:quanlysinhvien) {
            if (sv.tinhDTB() < 5) {
                list.add(sv);
            }
        }
            list.sort(cn2.sortMSSV());
            System.out.println("Danh sách sinh viên có dtb<5 là: ");
            for(sinhVien svien:list){
                System.out.println(svien.thongTin());
            }
        }

    public void bai3(){
        ArrayList<sinhVien> list = new ArrayList<sinhVien>();
        for(sinhVien sv:quanlysinhvien){
            if(sv instanceof sinhVienTuNhien){
                sinhVienTuNhien svtn =(sinhVienTuNhien)sv;
                svtn.diemTangMot();
            }else if(sv instanceof sinhVienXaHoi){
                sinhVienXaHoi svxh=(sinhVienXaHoi)sv;
               svxh.diemTangMot();
            }

        }
        Collections.sort(quanlysinhvien, Comparator.comparing(sinhVien::tinhDTB));

        for (sinhVien sv : quanlysinhvien) {
            double tinhdiem=sv.tinhDTB();
            if(tinhdiem<5){
                double diemcong=sv.diemTangMot();
                System.out.printf("Danh sách sinh viên sau khi tăng điểm" +
                        ": \n%s,điểm cộng: %.2f%n", sv.thongTin(), diemcong);
;
            }

        }
    }

    }
