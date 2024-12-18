package Buoi11Den13;

public class Bai10 {
    // Bài 10: Sắp xếp theo chiều giảm
    public static void mangGiamDan(int h[])
    {
        System.out.println("\nMang sau khi sap xep giam dan: ");
        // Sắp xếp mảng bằng thuật toán Bubble Sort
        for (int i = 0; i < h.length - 1; i++)
        {
            for (int j = 0; j < h.length - i - 1; j++)
            {
                if (h[j] < h[j + 1])
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
        System.out.println("Mang sau khi sap xep giam dan: ");
        mangGiamDan(h);
    }
}
