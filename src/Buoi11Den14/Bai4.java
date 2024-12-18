package Buoi11Den14;

import java.util.Scanner;

public class Bai4 {
    // Bài 4: Kiểm tra số nguyên tố (không đệ quy)
    public static void kiemTraKhongDeQuy(int num1)
    {
        if (num1 < 2)
        {
            System.out.printf("%d khong phai la so nguyen to", num1);
            return;
        }
        // Chạy từ 2 đến căn bậc 2 của num1, nếu num1 chia hết cho i thì num1 không phải là số nguyên tố, ngược lại là số nguyên tố
        for (int i = 2; i <= Math.sqrt(num1); ++i)
        {
            if (num1 % i == 0)
            {
                System.out.printf("%d khong phai la so nguyen to", num1);
                return;
            }
        }
        System.out.printf("%d la so nguyen to\n", num1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nNhap so muon kiem tra: ");
        int num1 = sc.nextInt();
        sc.close();
        kiemTraKhongDeQuy(num1);
    }
}
