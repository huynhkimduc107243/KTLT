package Buoi5;

import java.util.Scanner;

public class Bai5_1
{
    // SỬ dụng toán tử 3 ngôi - ternary operator
    public static int timGiaTriLonNhat(int num1, int num2)
    {
        return (num1 > num2 ? num1 : num2);
    }

    public static int timGiaTriNhoNhat(int num1, int num2)
    {
        return (num1 < num2 ? num1 : num2);
    }

    // Sử dụng phương pháp so sánh với if
    public static int soLonNhat(int num1, int num2)
    {
        int max = num1;
        if (max < num2)
            max = num2;
            return max;
    }
    public static int soNhoNhat(int num1, int num2)
    {
        int min = num1;
        if (min > num2)
            min = num2;
            return min;
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Nhap so thu nhat: ");
        num1 = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        num2 = sc.nextInt();
        sc.close();
        System.out.printf("\nGia tri lon nhat trong 2 so %d va %d la: %d", num1, num2, timGiaTriLonNhat(num1, num2));
        System.out.printf("\nGia tri nho nhat trong 2 so %d va %d la: %d", num1, num2, timGiaTriNhoNhat(num1, num2));
        System.out.printf("\nGia tri lon nhat trong 2 so %d va %d la: %d", num1, num2, soLonNhat(num1, num2));
        System.out.printf("\nGia tri nho nhat trong 2 so %d va %d la: %d", num1, num2, soNhoNhat(num1, num2));
    }
}