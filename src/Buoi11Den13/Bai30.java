package Buoi11Den13;

import java.util.Scanner;

public class Bai30 {
    /*
     * Bài 30: Kiểm tra số đối xứng palindrome
     * Số đối xứng là số có nghịch đảo vẫn bằng chính nó và k nhỏ hơn 0
     */

    // Hàm kiểm tra số đối xứng
    public static boolean isPalindrome(int num5)
    {
        int goc = num5;
        int nguoc = 0;
        while (num5 != 0)
        {
            int digit = num5 % 10;
            nguoc = nguoc * 10 + digit;
            num5 /= 10;
        }
        return goc == nguoc;
    }
 
    public static void ketQuaDoiXung()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so muon kiem tra:");
        int num5 = sc.nextInt();
        sc.close();
        if (isPalindrome(num5)) System.out.printf("%d la so Palindrome", num5);
        else System.out.printf("%d khong phai la so Palindrome", num5);
    }
 
    public static void hienThiSoDoiXung(int num5)
    {
        System.out.println("Dao nguoc cua so " + num5 + " la: ");
        while (num5 != 0)
        {
            System.out.println(num5 % 10);
            num5 /= 10;
             
        }
    }

    public static void main(String[] args)
    {
        ketQuaDoiXung();
    }
}
