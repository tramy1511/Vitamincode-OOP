package system;

import entity.SinhVienTN;


public class HelloWord2Inheritance {
    public static void main(String[] args) {
//        SinhVien sv= new SinhVien("My",20,"FullStack");
//        System.out.println("Sinh Viên"+sv.getName());
        SinhVienTN svtn = new SinhVienTN("My",20,"FullStack",10,10,10);
        System.out.println("fullname: "+svtn.getName());

    }


}
