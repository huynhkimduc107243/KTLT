package Buoi6;

public class Buoi4 {
    public static void bai4_1() {
        int arr[]={3, 5, 8, 10, 14, 25};
        System.out.print("Danh sach phan tu cua mang la");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\nPhan tu arr[%d] la: %d", i, arr[i]);
        }
    }

    public static void bai4_2() {
        String nguHanh[]={3, 5, 8, 10, 14, 25};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("Tong cac phan tu cua mang la: %d", sum);
    }

    public static void main(String[] args) {
        bai4_1();
    }
}
