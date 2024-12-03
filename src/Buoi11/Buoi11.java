package Buoi11;

import java.util.Scanner;

public class Buoi11
{
    private static final Scanner sc = new Scanner(System.in);

    public static void bai2()
    {
        System.out.print("Nhap 3 canh cua tam giac: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c || a + c > b || b + c > a)
        {
            if (a == b && b == c)
            {
                System.out.println("Tam giac deu");
            }
            else if (a == b || b == c || a == c)
            {
                if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
                {
                    System.out.println("Tam giac vuong can");
                }
                else System.out.println("Tam giac can");
            }
            else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) 
            {
                System.out.println("Tam giac vuong");    
            }
            else System.out.println("Tam giac thuong");
        }
        else System.out.println("Ba gia tri vua nhap khong tao thanh 3 canh tam giac");
    }

    public static void bai3()
    {
        System.out.print("\nNhap so N: ");
        int N = sc.nextInt();
        int tong = 0;

        for (int i = 2; i <= N; i+= 2) // chẵn + chẵn = chẵn, i + 2 = 
        {
            tong += i;
        }
        System.out.printf("Tong cac so chan tu 2 den %d la: %d ", N, tong);
    }

    /* Kiểm tra số nguyên tố:
    - Cách 1: Kiểm tra trực tiếp:
        Số tự nhiên n >= 2 là số nguyên tố khi và chỉ khi n k chia hết cho 2, 3, 4, ..., n - 1
    - Cách 2:
    */
    public static void kiemTraKhongDeQuy(int num1)
    {
        if (num1 < 2)
        {
            System.out.printf("%d khong phai la so nguyen to", num1);
            return;
        }
        for (int i = 2; i <= Math.sqrt(num1); ++i)
        {
            if (num1 % i == 0)
            {
                System.out.printf("%d khong phai la so nguyen to", num1);
                return;
            }
        }
        System.out.printf("%d la so nguyen to", num1);
    }

    /*
    Tính giai thừa:
        Ví dụ: 5! = 1 * 2 * 3 * 4 * 5 = 120
    */ 
    public static long giaiThuaKhongDeQuy(int num2)
    {
        long giaiThua = 1;
        for (int i = 1; i <= num2; i++)
        {
            giaiThua *= i;
        }
        return giaiThua;
    }
    
    // Bài 6
    public static long tongCacGiaiThua(int d, int e, int f, int g)
    {
        long tong = 0;
        tong = giaiThuaKhongDeQuy(d) + giaiThuaKhongDeQuy(e) + giaiThuaKhongDeQuy(f) + giaiThuaKhongDeQuy(g);
        return tong;
    }

    public static void phanTichThuaSoNguyenTo(int num3)
    {
        System.out.printf("%d phan tich thanh thua so nguyen to la: ", num3);
        int i = 2;
        while (num3 > 1)
        {
            if (num3 % i == 0)
            {
                System.out.print(" " + i);
                num3 = num3 / i;
            }
            else i++;
        }
    }

    // Bubble sort bài 5
    public static void sapXepMang(int h[])
    {
        System.out.println("Mang sau khi sap xep tang dan: ");
        for (int i = 0; i < h.length - 1; i++)
        {
            for (int j = 0; j < h.length - i - 1; j++)
            {
                // tăng
                if (h[j] > h[j + 1])
                {
                    int temp = h[j];
                    h[j] = h[j + 1];
                    h[j + 1] = temp;
                }
            }
        }
        xuatMang(h);
    }

    public static void xuatMang(int h[])
    {
        for(int i = 0; i < h.length; i++)
        {
            System.out.println(" " + h[i]);
        }
    }

    public static void main(String[] args) {
        bai2();
        bai3();

        // Bài 4
        System.out.print("\n\nNhap so muon kiem tra: ");
        int num1 = sc.nextInt();
        kiemTraKhongDeQuy(num1);

        // Bài 6
        System.out.print("\n\nNhap cac so muon tinh tong giai thua: ");
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        System.out.printf("Tong giai thua cua cac so %d, %d, %d, %d la: %d", d, e, f, g, tongCacGiaiThua(d, e, f, g));

        // Bài 18:
        System.out.print("\nSo muon phan tich: ");
        int num3 = sc.nextInt();

        // Bài 5:
        // sapXepMang(h);
    }
}