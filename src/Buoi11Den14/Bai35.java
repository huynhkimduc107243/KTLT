package Buoi11Den14;

import java.util.Scanner;

/*
     * Bài 35. Viết chương trình nhập vào ma trận A có n dòng, m cột, các phần tử
     * là những số nguyên lớn hơn 0 và nhỏ hơn 100 được nhập từ bàn phím.
     * Thực hiện các yêu cầu sau:
     * a. Tìm phần tử lớn nhất cùng với chỉ số.
     * b. Tìm và in ra các phần tử là số đối xứng (Palindrome).
     * c. Tìm và in ra các phần tử là số nguyên tố (các phần tử không phải là 
     * số nguyên tố được thay bằng số 0)
     */

public class Bai35
{
    public static int[][] nhapMaTran() {
        Scanner sc = new Scanner(System.in);
        int dong, cot;
        while (true) {
            try {
                System.out.print("Nhap so dong: ");
                dong = Integer.parseInt(sc.nextLine());
                System.out.print("Nhap so cot: ");
                cot = Integer.parseInt(sc.nextLine());
                sc.close();
                if (dong > 0 || cot > 0)
                    break;
                else
                    System.out.println("Gia tri khong hop le!");
            } catch (Exception e) {
                System.out.println("Gia tri khong hop le!");
            }
        }
        int tam[][] = new int[dong][cot];
        for (int i = 0; i < tam.length; i++) {
            for (int j = 0; j < tam[i].length; j++) {
                while (true) {
                    try {
                        System.out.print("Nhap phan tu [" + i + "][" + j + "]: ");
                        tam[i][j] = Integer.parseInt(sc.nextLine());
                        if (tam[i][j] > 0 && tam[i][j] < 100)
                            break;
                        else
                            System.out.println("Gia tri khong hop le!");
                    } catch (Exception e) {
                        System.out.println("Gia tri khong hop le!");
                    }
                }
            }
        }
        return tam;
    }

    public static void xuatMaTran(int a[][]) {
        System.out.println("Ma tran vua nhap la: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matran[][] = nhapMaTran();
        xuatMaTran(matran);
    }
}
