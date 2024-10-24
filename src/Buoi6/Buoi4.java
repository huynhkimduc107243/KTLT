package Buoi6;

import java.util.Scanner;

public class Buoi4 {
    public static void bai4_1() {
        int arr[] = { 3, 5, 8, 10, 14, 25 };
        System.out.print("\nBai 4.1/ Danh sach phan tu cua mang la:");
        // khi i < độ dài của mảng thì in ra phần tử tương ứng sau đó tăng i thêm 1 đến khi i > độ dài của mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\nPhan tu arr[%d] = %d", i, arr[i]);
        }
    }

    public static void bai4_2() {
        String nguHanh[] = { "Kim", "Moc", "Thuy", "Hoa", "Tho" };
        System.out.print("\n\nBai 4.2/ Danh sach cac ngu hanh la:");
        // khi i < độ dài của mảng thì in ra phần tử tương ứng sau đó tăng i thêm 1 đến khi i > độ dài của mảng
        for (int i = 0; i < nguHanh.length; i++) {
            System.out.printf("\nPhan tu thu [%d] la: %s", i, nguHanh[i]);
        }
    }

    public static void bai4_3() {
        int arr1[][] = new int[2][3];
        int count = 1; // đếm số thứ tự phần tử
        System.out.print("\n\nBai 4.3/ Danh sach cac phan tu cua mang arr1 la:");
        // khi i < số hàng của mảng thì in ra số hàng tại i sau đó tăng i thêm 1 đến khi i > số hàng của mảng
        for (int i = 0; i < arr1.length; i++) {
            // khi j < số cột của mảng thì in ra số cột tại j sau đó tăng j thêm 1 đến khi j> số cột của mảng
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("\nPhan tu thu %d: arr1[%d][%d]", count++, i, j);
            }
        }
    }

    public static void bai4_4() {
        int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        int count = 1; // đếm số thứ tự phần tử
        System.out.print("\n\nBai 4.4/ Danh sach cac phan tu cua mang arr2 la:");
        // khi i < số hàng của mảng thì in ra số hàng tại i sau đó tăng i thêm 1 đến khi i > số hàng của mảng
        for (int i = 0; i < arr2.length; i++) {
            // khi j < số cột của mảng thì in ra số cột tại j sau đó tăng j thêm 1 đến khi j> số cột của mảng
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("\nPhan tu thu %d la arr2[%d][%d] = %d", count++, i, j, arr2[i][j]);
            }
        }
    }

    public static void bai4_2NC(int n) {
        System.out.printf("\n\nBai 4.2NC/ Danh sach cac phan tu tu 1 den %d: ", n);
        // khi i <= n thì in ra phần tử tương ứng sau đó tăng i thêm 1 đến khi i > n
        for (int i = 1; i <= n; i++) {
            System.out.print("\t" + i);
        }
    }

    public static void bai4_3NC(int n) {
        System.out.printf("\n\nBai 4.3NC/ Danh sach cac so le nho hon hoac bang %d la: ", n);
        // khi i <= n thì kiểm tra i có phải số lẻ không, nếu có thì in ra sau đó i tăng thêm 1 đến khi i > n
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print("\t" + i);
            }
        }
    }

    public static void bai4_4NC(int n) {
        System.out.printf("\n\nBai 4.4NC/ Danh sach cac so chan nho hon hoac bang %d la: ", n);
        // khi i <= n thì kiểm tra i có phải số chẵn không, nếu có thì in ra sau đó i tăng thêm 1 đến khi i > n
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("\t" + i);
            }
        }
    }

    public static void bai4_5NC(int n) {
        System.out.printf("\n\nBai 4.5NC/ Danh sach cac so le nho hon %d la: ", n);
        // khi i <= n thì kiểm tra i có phải số lẻ không, nếu có thì in ra sau đó i tăng thêm 1 đến khi i = n
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print("\t" + i);
            }
        }
    }

    public static void bai4_6NC(int n) {
        System.out.printf("\n\nBai 4.6NC/ Danh sach cac so chan nho hon %d la: ", n);
        // khi i <= n thì kiểm tra i có phải số chẵn không, nếu có thì in ra sau đó i tăng thêm 1 đến khi i = n
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("\t" + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so n: ");
        n = sc.nextInt();

        bai4_1();
        bai4_2();
        bai4_3();
        bai4_4();
        bai4_2NC(n);
        bai4_3NC(n);
        bai4_4NC(n);
        bai4_5NC(n);
        bai4_6NC(n);
    }
}