package Buoi11Den14;

import java.util.Scanner;

public class Bai27 {
    /* Bài 27: Kiểm tra số hoàn hảo với try-catch và while
    * Số hoàn hảo là số mà tổng các ước của nó (không kể chính nó) bằng chính nó
    * Ví dụ: 6 có các ước là 1, 2, 3, 6 => 1 + 2 + 3 = 6
    */
    public static void soHoanHao()
    {
        Scanner sc = new Scanner(System.in);
        int num4 = 0;
        while (true)
        {
            try
            {
                System.out.print("\nNhap so can kiem tra: ");
                num4 = sc.nextInt();
                break;
            }
            catch (Exception e)
            {
                System.out.println("Vui long nhap so nguyen.");
                sc.next();
            }
        }
        sc.close();

        /*
         * i chạy từ 1 đến num4 - 1, nếu num4 chia hết cho i thì cộng i vào sum
         * Khi i = num4, nếu sum = num4 thì num4 là số hoàn hảo 
         */
        int sum = 0;
        for (int i = 1; i < num4/2; i++)
        {
            if (num4 % i == 0) sum += i;
        }
        if (sum == num4)
        {
            System.out.printf("%d la so hoan hao", num4);
            System.out.print("Cac uoc cua so hoan hao la:");
            for (int i = 1; i < num4/2; i++)
            {
                if (num4 % i == 0) System.out.print(" " + i);
            }
            System.out.println();
        }
        else System.out.printf("%d khong phai la so hoan hao", num4);
    }

    public static void main(String[] args) {
        soHoanHao();
    }
}
