package Buoi6;

public class Buoi6 {
    public static void truongHop1(String[] args) {
        String hoTen = "Nguyen Van An";
        String ngaySinh = "20/10/2006";
        String diemTongKet = "5.5";
        String tuoi = "18";

        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Diem tong ket: " + Float.parseFloat(diemTongKet));
        System.out.println("Tuoi: " + Integer.parseInt(tuoi));
    }

    public static void truongHop2(String[] args) {
        String hoTen = "Nguyễn Văn An";
        String ngaySinh = "20/10/2006";
        Float diemTongKet = 5.5f;
        int tuoi = 18;
    }

    public static void main(String[] args) {
        truongHop1(args);
    }
}
