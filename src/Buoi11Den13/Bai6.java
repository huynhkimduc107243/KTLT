package Buoi11Den13;

import java.util.Scanner;

public class Bai6 {
    // Bài 6: Tổng các giai thừa (không đệ quy)
    public static long giaiThuaKhongDeQuy(int num2)
    {
        long giaiThua = 1;
        // Khi num2 > 1 thì tiếp tục nhân giaiThua với i và giảm num2 đi 1, ngược lại
        // trả về giaiThua
        for (int i = 1; i <= num2; i++)
        {
            giaiThua *= i;
        }
        return giaiThua;
    }

    public static long tongCacGiaiThua(int d, int e, int f, int g)
    {
        long tong = 0;
        tong = giaiThuaKhongDeQuy(d) + giaiThuaKhongDeQuy(e) + giaiThuaKhongDeQuy(f) + giaiThuaKhongDeQuy(g);
        return tong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap cac so muon tinh tong giai thua: ");
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        System.out.printf("Tong giai thua cua cac so %d, %d, %d, %d la: %d", d, e, f, g, tongCacGiaiThua(d, e, f, g));
    }
}
