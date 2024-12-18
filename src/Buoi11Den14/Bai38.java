package Buoi11Den14;

import java.util.Scanner;

/*
     * Bài 38. Viết chương trình nhập vào mảng A gồm n phần tử, các phần tử là những
     * số nguyên lớn hơn 0 và nhỏ hơn 100 được nhập từ bàn phím. Thực hiện các yêu cầu sau:
     * a. Tìm phần tử lớn thứ 2 cùng với chỉ số.
     * b. Sắp xếp mảng theo thứ tự giảm dần.
     * c. Nhập số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo thứ tự sắp xếp
     * giảm dần của mảng A.
     */

public class Bai38 {
    public static final Scanner sc = new Scanner(System.in);

    public static int[] nhapMang() {
        int n; // Kích thước mảng
        while (true) {
            try
            {
                System.out.print("Nhap kich thuoc cua mang: ");
                n = Integer.parseInt(sc.nextLine());

                if (n > 0 && n < 100)
                    break;
                else
                    System.out.println("Gia tri khong hop le!");
            }
            catch (Exception e)
            {
                System.out.println("Vui long nhap 1 so nguyen trong khoang (0, 100)");
                sc.next();
            }
        }
        int tam[] = new int[n]; // Mảng tạm có kích thước n
        for (int i = 0; i < tam.length; i++) {
            while (true) {
                try {
                    System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
                    tam[i] = Integer.parseInt(sc.nextLine());

                    if (tam[i] > 0 && tam[i] < 100)
                        break;
                    else
                        System.out.println("Gia tri khong hop le!");
                } catch (Exception e) {
                    System.out.println("Gia tri khong hop le!");
                    sc.next();
                }
            }
        }
        return tam;
    }

    public static void xuatMang(int a[]) {
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    // a. Tìm phần tử lớn thứ 2 cùng với chỉ số.
    public static void timPhanTuLonThu2(int a[])
    {
        if (a.length < 2)
        {
            System.out.println("Kich thuoc mang khong du!");
            return;
        }

        int max1 = a[0], max2 = a[0];
        int chiSo = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max1)
            {
                max2 = max1;
                max1 = a[i];
                chiSo = i;
            }
            else if (a[i] > max2 && a[i] < max1)
            {
                max2 = a[i];
                chiSo = i;
            }
        }

        if (max2 == 0)
        {
            System.out.println("Khong co phan tu lon thu 2!");
        }
        else System.out.println("Phan tu lon thu 2 la: " + max2 + " tai vi tri: " + chiSo);
    }

    // b. Sắp xếp mảng theo thứ tự giảm dần.
    public static void mangGiamDan(int a[])
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int j = 0; i < a.length - i - 1; j++)
            {
                if (a[j] < a[j + 1])
                {
                    int tam = a[i];
                    a[j] = a[j+1];
                    a[j+1] = tam;
                }
            }
        }
        xuatMang(a);
    }

    public static void xuatMangGiamDan(int a[])
    {
        System.out.println("Mang sau khi sap xep giam dan la: ");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + "\t");
        }
    }

    // c. Nhập số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo thứ tự sắp xếp giảm dần của mảng A.
    public static int [] chenPhanTu(int a[], int x)
    {
        int tam[] = new int[a.length + 1];
        System.arraycopy(a, 0, tam, 0, a.length);
        // Tìm vị trí chèn x
        int viTri = 0;
        for (int i = 0; i < tam.length; i++)
        {
            if (x > tam[i]) viTri = i + 1;
            else break;
        }
        // Dời các phần tử phía sau vị trí chèn
        for (int i = tam.length - 1; i > viTri; i--)
        {
            tam[i] = tam[i - 1];
        }
        tam[viTri] = x;
        return tam;
    }

    public static void nhapSoNguyen()
    {
        int x;
        while (true)
        {
            try
            {
                System.out.print("Nhap so nguyen x: ");
                x = Integer.parseInt(sc.nextLine());
                break;
            }
            catch (Exception e)
            {
                System.out.println("Gia tri khong hop le!");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = nhapMang();
        // Xuất mảng vừa nhập
        xuatMang(arr);
        // Phần tử lớn thứ 2 trong mảng
        timPhanTuLonThu2(arr);
        // Sắp xếp mảng giảm dần
        xuatMangGiamDan(arr);
        // Chèn phần tử x vào mảng sao cho vẫn giữ nguyên thứ tự giảm dần
        int tam[] = chenPhanTu(arr, 0);
        System.out.println("Mang sau khi chen phan tu x la: ");
        xuatMang(tam);
    }
}
