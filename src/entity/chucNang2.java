package entity;


import java.util.Comparator;

public class chucNang2 implements chucNang{


    @Override
    public Comparator<sinhVien> sortMSSV() {
        return new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return o1.getMssv().compareTo(o2.getMssv());
            }

        };
    }

    @Override
    public Comparator<sinhVien> sortTen() {
        return new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }

        };
    }
}
