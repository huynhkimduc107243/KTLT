package Buoi11Den14;

import java.util.Scanner;

public class Bai2
{
    private static final Scanner sc = new Scanner(System.in);

    // Bài 2: Nhập vào 3 số a, b, c. Kiểm tra và phân loại tam giác, dùng try-catch và while để nhập đến khi đúng
    public static void kiemTraTamGiac()
    {
        double a = 0, b = 0, c = 0;
        while (true)
        {
            try
            {
                System.out.print("Nhap 3 canh cua tam giac: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();

                if (a + b > c && a + c > b && b + c > a) // Điều kiện tạo thành 1 tam giác
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
                    break;
                }
                else
                {
                    System.out.println("Ba gia tri vua nhap khong tao thanh 3 canh tam giac");
                }
            }
            catch (Exception e)
            {
                System.out.println("Vui long nhap so thuc");
                sc.next();
                continue;
            }
        } 
    }

     public static void main(String[] args)
    {
        kiemTraTamGiac();
    }
}
