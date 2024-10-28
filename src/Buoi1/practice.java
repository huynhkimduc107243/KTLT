package Buoi1;

import java.util.Scanner;

public class Practice {
    private static final Scanner sc = new Scanner(System.in);
    private static final double PI = 3.14d;

    public static void bai3() {
        System.out.print("Nhap ban kinh r: ");
        double r = sc.nextDouble();
        System.out.printf("Dien tich hinh tron ban kinh %.2f la = %.2f", r, PI * r * r);
    }

    public static void bai4() {
        System.out.print("\n\nNhap do F: ");
        double f = sc.nextDouble();
        System.out.printf("%.2f chuyen sang do C la: %.2f", f, (f - 32) * 5 / 9);
    }

    public static void bai5() {
        System.out.print("\n\nNhap do C: ");
        int c = sc.nextInt();
        System.out.printf("%d chuyen sang do F la: %d", c, c * 9 / 5 + 32);
    }

    public static void bai6() {
        System.out.print("\n\nNhap 2 so a va b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("Tong 2 so %d va %d la: %d", a, b, a + b);
    }

    public static void bai7() {
        System.out.print("\n\nNhap 2 so a va b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Cach 1: if else
        if (a > b) {
            System.out.printf("So lon nhat trong 2 so %d va %d la: %d", a, b, a);
        } else {
            System.out.printf("\nSo lon nhat trong 2 so %d va %d la: %d", a, b, b);
        }

        // Cach 2: toán tử 3 ngôi - ternary operator (btđk ? gt1 : gt2)
        System.out.printf("\nSo lon nhat trong 2 so %d va %d la: %d", a, b, (a > b ? a : b));
    }

    public static void bai8() {
        System.out.print("\n\nNhap so i: ");
        int i = sc.nextInt();
    }

    public static void main(String[] args) {
        bai3();
        bai4();
        bai5();
        bai6();
        bai7();
        sc.close();
    }
}
