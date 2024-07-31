package entity;

import java.util.Scanner;

public abstract class sinhVien {
    private double toan;
    private double van;
    private String mssv;
    private String ten;
    private int tuoi;
    private String quequan;

    public sinhVien(double toan, String quequan, int tuoi, String ten, String mssv, double van) {
        this.toan = toan;
        this.quequan = quequan;
        this.tuoi = tuoi;
        this.ten = ten;
        this.mssv = mssv;
        this.van = van;
    }

    public sinhVien() {
    }

    public Double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public Double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public abstract double tinhDTB();
    public abstract double diemTangMot();
    public String thongTin(){
       return "Điểm văn:"+this.getVan()+" Điểm toán:"+this.getToan()+" Mã số sv:"+this.getMssv() +" Tên:"+this.getTen()+" Tuổi:"+this.getTuoi()+" Quê Quán:"+this.getQuequan()+" Điểm tb:"+this.tinhDTB();
    }
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sinh viên: ");
        this.ten= scanner.nextLine();
        System.out.print("Nhập mã số sinh viên: ");
        this.mssv = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.tuoi = scanner.nextInt();
        scanner.nextLine();  // Đọc bỏ dòng trống
        System.out.print("Nhập quê quán: ");
        this.quequan = scanner.nextLine();
        System.out.print("Nhập điểm toán:");
        this.toan= scanner.nextDouble();
        System.out.print("Nhập điểm văn:");
        this.van= scanner.nextDouble();
    }

}
