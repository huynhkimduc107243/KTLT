package Buoi11Den13;

import java.util.Scanner;

public class Bai17 {
    // Bài 17: Nhập vào 1 chuỗi và đảo ngược chuỗi đó
    public static void daoNguocChuoi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap chuoi: ");
        String str = sc.nextLine();
        sc.nextLine();
        sc.close();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reverse += str.charAt(i);
        }
        System.out.println("Chuoi sau khi dao nguoc la: " + reverse);
    }

    public static void main(String[] args) {
        daoNguocChuoi();
    }
}
