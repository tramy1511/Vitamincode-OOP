package entity;

public class SinhVienXH extends SinhVien {
    private double van;
    private double su;
    private double dia;

    public SinhVienXH(String name, int age, String major) {
        super(name, age, major);
    }

    public SinhVienXH() {
    }

    public SinhVienXH(String name, int age, String major, double van, double su, double dia) {
        super(name, age, major);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public SinhVienXH(double van, double su, double dia) {
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
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
}
