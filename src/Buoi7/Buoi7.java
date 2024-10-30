package Buoi7;

import java.util.Scanner;

public class Buoi7
{
    public static int nhapDiem()
    {
        Scanner sc = new Scanner(System.in);
        int diem = 0;

        while (true)
        {
            try
            {
                System.out.print("Nhap tuoi: ");
                diem = sc.nextInt();
                if (diem >= 0 && diem <= 10) break;
                else
                {
                    System.out.println("So diem khong hop le, diem nam trong khoang 0-10. Vui long nhap lai!");
                }
            }
            catch (Exception ex)
            {
                System.out.println("So diem khong hop le, diem nam trong khoang 0-10. Vui long nhap lai!");
            }
        }
        return diem;
    }

    public static int nhapTuoi()
    {
        Scanner sc = new Scanner(System.in);
        int tuoi = 0;

        while (true)
        {
            try
            {
                System.out.print("Nhap tuoi: ");
                tuoi = sc.nextInt();
                if (tuoi >= 0 && tuoi <= 150) break;
                else
                {
                    System.out.println("So tuoi khong hop le, tuoi nguoi nam trong khoang 0-150. Vui long nhap lai!");
                }
            }
            catch (Exception ex)
            {
                System.out.println("So diem khong hop le, tuoi nguoi nam trong khoang 0-150. Vui long nhap lai!");
            }
        }
        return tuoi;
    }
    public static void main(String[] args)
    {
        System.out.println("So diem vua nhap la: " + nhapDiem());
        System.out.println("So tuoi vua nhap la: " + nhapTuoi());
    }
}