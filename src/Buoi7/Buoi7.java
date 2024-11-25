package Buoi7;

import java.util.Scanner;

public class Buoi7
{
    public static void hienThiGiaTri(int n)
    {
        System.out.print("Danh sach cac phan tu la: ");
        int i = 1;
        while (i <= n)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public static int nhapSoNguyen()
    {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            try
            {
                System.out.print("Nhap gia tri: ");
                n = Integer.parseInt(sc.nextLine());
                break;

            }
            catch (Exception ex)
            {
                System.out.println("Du lieu khong hop le, hay nhap lai!!!");
            }
        }
        return n;
    }

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

    public static float nhapTuoi()
    {
        Scanner sc = new Scanner(System.in);
        float tuoi = 0;

        while (true)
        {
            try
            {
                System.out.print("Nhap tuoi: ");
                tuoi = sc.nextFloat();
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
        hienThiGiaTri(nhapSoNguyen());
        System.out.println("So diem vua nhap la: " + nhapDiem());
        System.out.println("So tuoi vua nhap la: " + nhapTuoi());
    }
}