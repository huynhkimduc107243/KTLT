package Buoi6;

import java.util.Scanner;

public class Buoi4 {
    public static void bai4_1() {
        int arr[]={3, 5, 8, 10, 14, 25};
        System.out.print("Danh sach phan tu cua mang la");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\nPhan tu arr[%d] la: %d", i, arr[i]);
        }
    }

    public static void bai4_2() {
        String nguHanh[]={"Kim", "Moc", "Thuy", "Hoa", "Tho"};
        for (int i = 0; i < nguHanh.length; i++) {
            System.out.printf("\nNgu hanh [%d] la: %s", i, nguHanh[i]);
        }
    }

    public static void bai4_2NC(int n) {
        System.out.printf("Danh sach cac phan tu tu 1 den %d: ", n);
        for (int i = 1; i <= n; i++) {
            System.out.print("\t" + i);
        }
    }

    public static void bai4_3NC(int n) {
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("\nNhap so phan tu cua mang: ");
        num = sc.nextInt();

        bai4_1();
        bai4_2();
        bai4_2NC(num);
    }
}
