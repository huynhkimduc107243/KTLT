package Buoi11Den14;

public class Bai5 {
    // Bài 5: Sắp xếp mảng theo chiều tăng
    public static void mangTangDan(int h[])
    {
        System.out.println("\nMang sau khi sap xep tang dan: ");
        // Sắp xếp mảng bằng thuật toán Bubble Sort
        for (int i = 0; i < h.length - 1; i++)
        {
            for (int j = 0; j < h.length - i - 1; j++)
            {
                if (h[j] > h[j + 1])
                {
                    int temp = h[j];
                    h[j] = h[j + 1];
                    h[j + 1] = temp;
                }
            }
        }
        xuatMang(h);
    }

    public static void xuatMang(int h[])
    {
        for (int i = 0; i < h.length; i++)
        {
            System.out.println(" " + h[i]);
        }
    }

    public static void main(String[] args) {
        int[] h = {5, 3, 8, 6, 2};
        System.out.println("Mang sau khi sap xep tang dan: ");
        mangTangDan(h);
    }
}
