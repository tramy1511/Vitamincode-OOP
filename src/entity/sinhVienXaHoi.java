package entity;

import java.util.Scanner;

public class sinhVienXaHoi extends sinhVien {

    public double su;
    public double dia;
    public double gdcd;
    @Override
    public double tinhDTB() {
        return (super.getToan() + super.getVan() + su * 2 + dia * 2 + gdcd * 2) / 8;
    }

    @Override
    public double diemTangMot() {
        double diemTang = tinhDTB();
        if (diemTang <10) {
            diemTang = Math.min(diemTang + 1, 10);
        }
        return diemTang;
    }

    public sinhVienXaHoi(Double toan, String ten, int tuoi, String quequan , String mssv, Double van, double su, double dia, double gdcd) {
        super(toan, quequan, tuoi, ten, mssv, van);
        this.su = su;
        this.dia = dia;
        this.gdcd = gdcd;
    }

    public sinhVienXaHoi(double su, double dia, double gdcd) {
        this.su = su;
        this.dia = dia;
        this.gdcd = gdcd;
    }

    public sinhVienXaHoi() {
    }

    public sinhVienXaHoi(Double toan, String quequan, int tuoi, String ten, String mssv, Double van) {
        super(toan, quequan, tuoi, ten, mssv, van);
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    public double getGdcd() {
        return gdcd;
    }

    public void setGdcd(double gdcd) {
        this.gdcd = gdcd;
    }
    public String thongTin(){
        return
                "Điểm địa:"+this.getDia()+" Điểm GDCD:"+this.getGdcd()+" Điểm sử:"+this.getSu()
                +" "+
                super.thongTin();



    }
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm Địa:");
        this.dia= scanner.nextDouble();
        System.out.print("Nhập điểm Gdcd:");
        this.gdcd= scanner.nextDouble();
        System.out.print("Nhập điểm Sử:");
        this.su= scanner.nextDouble();
    }
}
