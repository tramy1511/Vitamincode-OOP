package entity;

import java.util.Scanner;

public class sinhVienTuNhien extends sinhVien {

    public double ly;
    public double hoa;
    public double sinh;
    @Override
    public double tinhDTB(){
        return(getToan()*2+getVan()+ly*2+hoa+sinh)/7;

    }
    public double diemTangMot() {
        double diemTang = tinhDTB();
        if (diemTang <10) {
            diemTang = Math.min(diemTang + 1, 10);
        }
        return diemTang;
    }

    public sinhVienTuNhien(double ly, double hoa, double sinh) {
        this.ly = ly;
        this.hoa = hoa;
        this.sinh = sinh;
    }

    public sinhVienTuNhien(double toan,String ten , int tuoi, String quequan, String mssv, double van, double ly, double hoa, double sinh) {
        super(toan, quequan, tuoi, ten, mssv, van);
        this.ly = ly;
        this.hoa = hoa;
        this.sinh = sinh;
    }



    public sinhVienTuNhien(Double toan, String quequan, int tuoi, String ten, String mssv, Double van) {
        super(toan, quequan, tuoi, ten, mssv, van);
    }

    public sinhVienTuNhien() {
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getSinh() {
        return sinh;
    }

    public void setSinh(double sinh) {
        this.sinh = sinh;
    }

    public String thongTin(){
        return  "Điểm Lý:"+this.getLy()+" Điểm hóa:"+this.getHoa()+" Điểm sinh:"+this.getSinh()
        +" "+ super.thongTin();

    }
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm Lý:");
        this.ly= scanner.nextDouble();
        System.out.print("Nhập điểm Hóa:");
        this.hoa= scanner.nextDouble();
        System.out.print("Nhập điểm Sinh:");
        this.sinh= scanner.nextDouble();
    }
}
