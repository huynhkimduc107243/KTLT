package BaitTapBuoi3.huynhkimduc;

import java.util.Scanner;

public class Duc107243
{
    public static String gioiTinh(boolean gioiTinh)
    {
        return gioiTinh ? "Nam" : "Nu";
    }

    //
    public static void Ex1(String[] args)
    {
        int maSinhVien = 107243, tuoi = 18;
        String hoVaTen = "Huynh Kim Duc", ngaySinh = "27/07/2006", lop = "IT24A", diaChi = "Da Nang", khoa = "CNTT";
        boolean gioiTinh = true; // true: Nam, false: Nu

        System.out.println("-----THONG TIN SINH VIEN-----");
        System.out.println("Ma so sinh vien: " + maSinhVien);
        System.out.println("Ho va ten: " + hoVaTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh(gioiTinh));
        System.out.println("Lop: " + lop);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Khoa: " + khoa);
        System.out.println("-------------KET-------------");
    }

    public static void Ex2(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        int maSinhVien = scanner.nextInt();
        scanner.nextLine(); // Sử dụng dòng mới

        System.out.print("Nhap tuoi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine(); // Sử dụng dòng mới

        System.out.print("Nhap gioi tinh (Nam: true / Nu: false): ");
        boolean gioiTinh = scanner.nextBoolean();
        scanner.nextLine(); // Sử dụng dòng mới

        System.out.print("Nhap ho va ten: ");
        String hoVaTen = scanner.nextLine();

        System.out.print("Nhap ngay sinh: ");
        String ngaySinh = scanner.nextLine();

        System.out.print("Nhap lop: ");
        String lop = scanner.nextLine();

        System.out.print("Nhap khoa: ");
        String khoa = scanner.nextLine();

        System.out.print("Nhap dia chi: ");
        String diaChi = scanner.nextLine();

        System.out.println();
        System.out.print("-----THONG TIN SINH VIEN-----");
        System.out.printf(
                "\nMa sinh vien: %d\nHo va ten: %s\nNgay sinh: %s\nTuoi: %d\nGioi tinh: %s\nLop: %s \nKhoa: %s\nDia chi: %s\n",
                maSinhVien, hoVaTen, ngaySinh, tuoi, gioiTinh(gioiTinh), lop, khoa, diaChi);
        System.out.println("-------------KET-------------");
        scanner.close();
    }

    public static void main(String[] args)
    {
        Ex1(args);
        Ex2(args);
    }
}