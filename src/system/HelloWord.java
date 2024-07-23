package system;

import entity.SinhVien;

public class HelloWord {
    public static void main(String[] args) {
        SinhVien sv1= new SinhVien();
        sv1.setName("My");
        sv1.setAge(20);
        sv1.setMajor("FullStack");
        SinhVien sv2= new SinhVien();

        sv2.setName("Giang");
        sv2.setAge(16);
        sv2.setMajor("FullStack");
        System.out.println("Sinh Viên Trường: "+sv1.schoolName);
        System.out.println("Sinh Viên Tên: "+sv1.getName());
        System.out.println("Sinh Viên Trường: "+sv2.schoolName);
        System.out.println("Sinh Viên Tên: "+sv2.getName());
        // khi khai báo static thì dc sd lop class
        System.out.println("Sinh Viên Tên: "+SinhVien.schoolName);
    }
}
