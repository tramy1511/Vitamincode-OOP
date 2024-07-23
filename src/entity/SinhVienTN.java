package entity;

public class SinhVienTN extends SinhVien{
    private double toan;
    private double li;
    private double hoa;

    public SinhVienTN(String name, int age, String major) {
        super(name, age, major);
    }

    public SinhVienTN() {
    }

    public SinhVienTN(String name, int age, String major, double toan, double li, double hoa) {
        super();
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
    }

    public SinhVienTN(double toan, double li, double hoa) {
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
    }

    public double getLi() {
        return li;
    }

    public void setLi(double li) {
        this.li = li;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
}
