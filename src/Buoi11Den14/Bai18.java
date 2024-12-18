package Buoi11Den14;

import java.util.Scanner;

public class Bai18 {
    // Bài 18: Phân tích số thành thừa số nguyên tố
    public static void phanTichThuaSoNguyenTo(int num3)
    {
        System.out.printf("%d phan tich thanh thua so nguyen to la: ", num3);
        int i = 2;
        // Khi num3 > 1 thì tiếp tục phân tích, nếu num3 chia hết cho i thì in ra i và
        // num3 = num3 / i, ngược lại tăng i lên 1 để kiểm tra tiếp
        while (num3 > 1)
        {
            if (num3 % i == 0)
            {
                System.out.print(" " + i);
                num3 = num3 / i;
            } else i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nSo muon phan tich: ");
        int num3 = sc.nextInt();
        sc.close();
        phanTichThuaSoNguyenTo(num3);
    }
}
