package Buoi1;

import java.util.Scanner;

public class practice
{
    private static final Scanner sc = new Scanner(System.in);
    private static final double PI = 3.14d;

    // Tinh dien tich hinh tron
    public static void bai3()
    {
        System.out.print("Nhap ban kinh r: ");
        double r = sc.nextDouble();
        System.out.printf("Dien tich hinh tron ban kinh %.2f la = %.2f", r, PI * r * r);
    }

    // Chuyen do F sang do C
    public static void bai4()
    {
        System.out.print("\n\nNhap do F: ");
        double f = sc.nextDouble();
        System.out.printf("%.2f do F chuyen sang do C la: %.2f do C", f, (f - 32) * 5 / 9);
    }

    // Chuyen do C sang do F
    public static void bai5()
     {
        System.out.print("\n\nNhap do C: ");
        double c = sc.nextDouble();
        System.out.printf("%.2f do C chuyen sang do F la: %.2f do F", c, c * 9 / 5 + 32);
    }

    // Tinh tong 2 so
    public static void bai6()
    {
        System.out.print("\n\nNhap 2 so a va b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("Tong 2 so %d va %d la: %d", a, b, a + b);
    }

    // Tim so lon nhat trong 2 so
    public static void bai7()
    {
        System.out.print("\n\nNhap 2 so a va b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Cach 1: if else
        if (a > b)
        {
            System.out.printf("Cach 1: So lon nhat trong 2 so %d va %d la: %d", a, b, a);
        }
        else
        {
            System.out.printf("Cach 1: So lon nhat trong 2 so %d va %d la: %d", a, b, b);
        }

        // Cach 2: toan tu 3 ngoi - ternary operator (btđk ? gt1 : gt2)
        System.out.printf("\nCach 2: So lon nhat trong 2 so %d va %d la: %d", a, b, (a > b ? a : b));
    }

    // In ra cac so chan i ( 9 < i < 100)
    public static void bai8()
    {
        System.out.print("\n\nCac so chan i ( 9 < i < 100) la: ");
        for (int i = 10; i < 100; i++)
        {
            if (i % 2 == 0) System.out.print(i + " ");
        }
    }

    // In ra cac so le nho hon 1 so cho truoc, tinh tong va dem cac so do
    public static void bai9()
    {
        System.out.print("\n\nNhap so bat ki: ");
        int num = sc.nextInt();
        int tong = 0, dem = 0;
        System.out.printf("Cac so le nho hon %d la: ", num);
        for (int i = 1; i < num; i += 2) // i = i + 2 vi so le luon la so chan + 1
        {
                System.out.print(i + " ");
                tong += i;
                dem++;
        }
        System.out.printf("\nTong cac so le la: %d", tong);
        System.out.printf("\nCo %d so le nho hon %d", dem, num);
    }

    // Tinh trung binh diem cua n bai thi
    public static void bai10()
    {
        System.out.print("\n\nNhap so bai thi: ");
        int soBaiThi = sc.nextInt();
        double diem, tong = 0;
        for (int i = 1; i <= soBaiThi; i++)
        {
            System.out.printf("Nhap diem cua bai thi thu %d: ", i);
            diem = sc.nextDouble();
            tong += diem; // tong = tong + diem
        }
        System.out.printf("Trung binh diem cua %d bai thi la: %.2f ", soBaiThi, tong / soBaiThi);
    }

    public static void main(String[] args)
    {
        bai3();
        bai4();
        bai5();
        bai6();
        bai7();
        bai8(); 
        bai9();
        bai10();
        sc.close();
    }
}
