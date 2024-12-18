package Buoi11Den14;

import java.util.Scanner;

public class Bai14 {
    public static final Scanner sc = new Scanner(System.in);
    // Bài 14: Số lớn nhất trong 3 số
    public static void soLonNhat()
    {
        int a = 0, b = 0, c = 0;
        while (true)
        {
            try
            {
                System.out.print("Nhap 3 so a, b, c: ");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                break;
            }
            catch (Exception e)
            {
                System.out.println("Vui long nhap so nguyen.");
                sc.next();
            }
        }
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        System.out.printf("So lon nhat trong 3 so %d, %d, %d la: %d", a, b, c, max);
    }

    // Bài 14.1
    public static void soNhoNhat()
    {
        int a = 0, b = 0, c = 0;
        while (true)
        {
            try
            {
                System.out.print("\n\nNhap 3 so a, b, c: ");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                break;
            }
            catch (Exception e)
            {
                System.out.println("Vui long nhap so nguyen.");
                sc.next();
            }
        }
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        System.out.printf("So nho nhat trong 3 so %d, %d, %d la: %d", a, b, c, min);
    }

    public static void main(String[] args) {
        soLonNhat(); // Bài 14
        soNhoNhat(); // Bài 14.1
    }
}
