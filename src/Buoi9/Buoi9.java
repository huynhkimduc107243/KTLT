package Buoi9;

import java.util.Scanner;

public class Buoi9
{
    /* Vẽ tam giác vuông với kí tự *
        Ví dụ: tam giác chiều cao 3
    i = 0   *
        1   **
        2   ***
    Số dấu sao trên mỗi hàng(i) = i + 1
     */
    public static void tamGiacSao(int chieuCao)
    {
        // Duyệt qua từng hàng
        for (int hang = 0; hang < chieuCao; hang++)
        {
            /*
            Số lần in dấu sao cho mỗi hàng là hang + 1 vì hàng 0 cần 1 dấu sao, hàng 1 cần 2 dấu sao, v.v.
             Cụ thể: Hàng đầu tiên: hang = 0, chỉ có 1 cột cot = 0 được in dấu sao.
                     Hàng thứ 2: hang = 1, sẽ có 2 cột cot = 0 và 1 được in dấu sao, v.v.
            */
            for (int cot = 0; cot < hang + 1; cot++)
            {
                System.out.print("* ");
            }
            System.out.print("\n"); 
        }
        System.out.println();
    }

    // Lật ngược tam giác bài 1, được bài 2...
    public static void tamGiacSaoNguoc(int chieuCao)
    {
        /*
        Duyệt qua từng hàng, bắt đầu từ hàng cuối cùng (chieuCao - 1) và giảm dần
         Ví dụ: nếu chieuCao là 3, thì cot sẽ được gán giá trị 3 - 1 = 2, tức là bắt đầu từ hang 2 (hàng cuối cùng trong tam giác vuông gốc)
        */
        for (int hang = chieuCao - 1; hang >= 0; hang--)
        {
            // Duyệt qua mỗi cột cho từng hàng, mỗi cột đại diện cho 1 dấu sao
            // Ở hàng thứ row, số dấu sao là height - row
            for (int cot = 0; cot < hang + 1; cot++)
            {
                System.out.print("* ");
            }
            System.out.print("\n"); 
        }
        System.out.println();
    }

    /*
    Ví dụ: 1 tam giác vuông chieuCao = 3
    i = 0   1
        1   1 2
        2   1 2 3
    Số lượng số trong mỗi hàng(i) = i + 1
    Cơ bản là giống bài 1, thêm biến num kiểu nguyên, num = cot + 1 để cột đầu tiên là số 1 thay vì 0, mỗi cột đại diện cho 1 số
    */
    public static void tamGiacSo(int chieuCao)
    {
        for (int hang = 0; hang < chieuCao; hang++)
        {
            for (int cot = 0; cot < hang + 1; cot++)
            {
                int num = cot + 1;
                System.out.print(num + " ");
            }
            System.out.print("\n"); 
        }
        System.out.println();
    }

    // Cơ bản là giống bài 2, thêm biến num kiểu nguyên, num = cot + 1 để cột đầu tiên là số 1 thay vì 0, mỗi cột đại diện cho 1 số 
    public static void tamGiacSoNguoc(int chieuCao)
    {
        for (int hang = chieuCao - 1; hang >= 0; hang--)
        {
            for (int cot = 0; cot < hang + 1; cot++)
            {
                int num = cot + 1;
                System.out.print(num + " ");
            }
            System.out.print("\n"); 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu cao cua tam giac vuong: ");
        int chieuCao = sc.nextInt();
        tamGiacSao(chieuCao);
        tamGiacSaoNguoc(chieuCao);
        tamGiacSo(chieuCao);
        tamGiacSoNguoc(chieuCao);
    }
}