package Buoi7;

import java.util.Scanner;

public class Buoi7
{
    public static float nhapDiem()
    {
        Scanner sc = new Scanner(System.in);
        float diem = 0;

        while (true)
        {
            try
            {
                System.out.print("Nhap diem: ");
                diem = sc.nextFloat();
                if (diem >= 0 && diem <= 10) break;
                else
                {
                    System.out.println("So diem khong hop le, diem nam trong khoang 0-10, hay nhap lai!");
                }
            }
            catch (Exception ex)
            {
                System.out.println("So diem khong hop le, diem nam trong khoang 0-10, hay nhap lai!");
            }
        }
        return diem;
    }
    public static void main(String[] args)
    {
        System.out.println("Diem vua nhap la: " + nhapDiem());
    }
}