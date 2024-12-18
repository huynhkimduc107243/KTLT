package Buoi11Den13;

import java.util.Scanner;

public class Bai3 {
    // Bài 3: Tổng các số chẵn từ 2 đến N
    public static void tongCacSoChan()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so N: ");
        int N = 0;
        try
        {
            N = sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Vui long nhap mot so nguyen.");
            sc.next(); // clear the invalid input
            return;
        }
        int tong = 0;
        for (int i = 2; i <= N; i += 2)
        {
            tong += i;
        }
        System.out.printf("Tong cac so chan tu 2 den %d la: %d ", N, tong);
    }

    public static void main(String[] args) {
        tongCacSoChan();
    }
}
