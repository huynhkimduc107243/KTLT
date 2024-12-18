package Buoi11Den13;

import java.util.Scanner;

public class Buoi11Den13
{
    private static final Scanner sc = new Scanner(System.in);

    // Bài 2: Nhập vào 3 số a, b, c. Kiểm tra và phân loại tam giác, dùng try-catch và while để nhập đến khi đúng
    public static void kiemTraTamGiac()
    {
        double a = 0, b = 0, c = 0;
        while (true)
        {
            try
            {
                System.out.print("Nhap 3 canh cua tam giac: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();

                if (a + b > c && a + c > b && b + c > a) // Điều kiện tạo thành 1 tam giác
                {
                    if (a == b && b == c)
                    {
                        System.out.println("Tam giac deu");
                    }
                    else if (a == b || b == c || a == c)
                    {
                        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
                        {
                            System.out.println("Tam giac vuong can");
                        }
                        else System.out.println("Tam giac can");
                    }
                    else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
                    {
                        System.out.println("Tam giac vuong");
                    }
                    else System.out.println("Tam giac thuong");
                    break;
                }
                else
                {
                    System.out.println("Ba gia tri vua nhap khong tao thanh 3 canh tam giac");
                }
            }
            catch (Exception e)
            {
                System.out.println("Vui long nhap so thuc");
                sc.next();
                continue;
            }
        } 
    }

    // Bài 3: Tổng các số chẵn từ 2 đến N
    public static void tongCacSoChan()
    {
        System.out.print("\nNhap so N: ");
        int N = 0;
        try
        {
            N = sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Vui long nhap mot so nguyen.");
            sc.next(); // clear the invalid input
            return;
        }
        int tong = 0;
        for (int i = 2; i <= N; i += 2)
        {
            tong += i;
        }
        System.out.printf("Tong cac so chan tu 2 den %d la: %d ", N, tong);
    }

    // Bài 4: Kiểm tra số nguyên tố (không đệ quy)
    public static void kiemTraKhongDeQuy(int num1)
    {
        if (num1 < 2)
        {
            System.out.printf("%d khong phai la so nguyen to", num1);
            return;
        }
        // Chạy từ 2 đến căn bậc 2 của num1, nếu num1 chia hết cho i thì num1 không phải là số nguyên tố, ngược lại là số nguyên tố
        for (int i = 2; i <= Math.sqrt(num1); ++i)
        {
            if (num1 % i == 0)
            {
                System.out.printf("%d khong phai la so nguyen to", num1);
                return;
            }
        }
        System.out.printf("%d la so nguyen to\n", num1);
    }

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

    // Bài 6: Tổng các giai thừa (không đệ quy)
    public static long giaiThuaKhongDeQuy(int num2)
    {
        long giaiThua = 1;
        // Khi num2 > 1 thì tiếp tục nhân giaiThua với i và giảm num2 đi 1, ngược lại
        // trả về giaiThua
        for (int i = 1; i <= num2; i++)
        {
            giaiThua *= i;
        }
        return giaiThua;
    }

    public static long tongCacGiaiThua(int d, int e, int f, int g)
    {
        long tong = 0;
        tong = giaiThuaKhongDeQuy(d) + giaiThuaKhongDeQuy(e) + giaiThuaKhongDeQuy(f) + giaiThuaKhongDeQuy(g);
        return tong;
    }

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
    
    // Bài 14: Số lớn nhất trong 3 số
    public static void soLonNhat()
    {
        int a = 0, b = 0, c = 0;
        while (true)
        {
            try
            {
                System.out.print("\nNhap 3 so a, b, c: ");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                break;
            }
            catch (Exception e)
            {
                System.out.println("Vui long nhap so nguyen.");
                sc.next();
            }
        }
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        System.out.printf("So lon nhat trong 3 so %d, %d, %d la: %d", a, b, c, max);
    }

    // Bài 14.1
    public static void soNhoNhat()
    {
        int a = 0, b = 0, c = 0;
        while (true)
        {
            try
            {
                System.out.print("\n\nNhap 3 so a, b, c: ");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                break;
            }
            catch (Exception e)
            {
                System.out.println("Vui long nhap so nguyen.");
                sc.next();
            }
        }
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        System.out.printf("So nho nhat trong 3 so %d, %d, %d la: %d", a, b, c, min);
    }

    // Bài 17: Nhập vào 1 chuỗi và đảo ngược chuỗi đó
    public static void daoNguocChuoi()
    {
        System.out.print("\nNhap chuoi: ");
        String str = sc.nextLine();
        sc.nextLine();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reverse += str.charAt(i);
        }
        System.out.println("Chuoi sau khi dao nguoc la: " + reverse);
    }

    // Bài 18: Phân tích số thành thừa số nguyên tố
    public static void phanTichThuaSoNguyenTo(int num3)
    {
        System.out.printf("%d phan tich thanh thua so nguyen to la: ", num3);
        int i = 2;
        // Khi num3 > 1 thì tiếp tục phân tích, nếu num3 chia hết cho i thì in ra i và
        // num3 = num3 / i, ngược lại tăng i lên 1 để kiểm tra tiếp
        while (num3 > 1)
        {
            if (num3 % i == 0)
            {
                System.out.print(" " + i);
                num3 = num3 / i;
            } else i++;
        }
    }

    /* Bài 27: Kiểm tra số hoàn hảo với try-catch và while
    * Số hoàn hảo là số mà tổng các ước của nó (không kể chính nó) bằng chính nó
    * Ví dụ: 6 có các ước là 1, 2, 3, 6 => 1 + 2 + 3 = 6
    */
    public static void soHoanHao()
    {
        int num4 = 0;
        while (true)
        {
            try
            {
                System.out.print("\nNhap so can kiem tra: ");
                num4 = sc.nextInt();
                break;
            }
            catch (Exception e)
            {
                System.out.println("Vui long nhap so nguyen.");
                sc.next();
            }
        }

        /*
         * i chạy từ 1 đến num4 - 1, nếu num4 chia hết cho i thì cộng i vào sum
         * Khi i = num4, nếu sum = num4 thì num4 là số hoàn hảo 
         */
        int sum = 0;
        for (int i = 1; i < num4/2; i++)
        {
            if (num4 % i == 0) sum += i;
        }
        if (sum == num4)
        {
            System.out.printf("%d la so hoan hao", num4);
            System.out.print("Cac uoc cua so hoan hao la:");
            for (int i = 1; i < num4/2; i++)
            {
                if (num4 % i == 0) System.out.print(" " + i);
            }
            System.out.println();
        }
        else System.out.printf("%d khong phai la so hoan hao", num4);
    }

    /*
     * Bài 30: Kiểm tra số đối xứng palindrome
     * Số đối xứng là số có nghịch đảo vẫn bằng chính nó và k nhỏ hơn 0
     */

     // Hàm kiểm tra số đối xứng
    public static boolean isPalindrome(int num5)
    {
        int goc = num5;
        int nguoc = 0;
        while (num5 != 0)
        {
            int digit = num5 % 10;
            nguoc = nguoc * 10 + digit;
            num5 /= 10;
        }
        return goc == nguoc;
    }

    public static void ketQuaDoiXung()
    {
        System.out.println("Nhap so muon kiem tra:");
        int num5 = sc.nextInt();
        if (isPalindrome(num5)) System.out.printf("%d la so Palindrome", num5);
        else System.out.printf("%d khong phai la so Palindrome", num5);
    }

    public static void hienThiSoDoiXung(int num5)
    {
        System.out.println("Dao nguoc cua so " + num5 + " la: ");
        while (num5 != 0)
        {
            System.out.println(num5 % 10);
            num5 /= 10;
            
        }
    }

    public static int[] nhapMang()
    {
        int num6 = 0;
        while (true)
        {
            try
            {
                System.out.print("Nhap so phan tu cua mang: ");
                num6 = Integer.parseInt(sc.nextLine());
                break;
            }
            catch (Exception e)
            {
                System.out.println("Gia tri khum hop le, hay nhap lai");
                sc.next();
            }
        }
        int[] arr = new int[num6];
        for (int i = 0; i < num6; i++)
        {
            try
            {
                System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
                arr[i] = Integer.parseInt(sc.nextLine());
                if (arr[i] > 0 && arr[i] < 100) continue;
                else System.out.println("Gia tri khong hop le, hay nhap lai");
            }
            catch (Exception e)
            {
                System.out.println("Gia tri khong hop le, hay nhap lai");
                sc.next();
            }
        }
        return arr;
    }

    public static void hienThiMang()
    {
        int[] arr = nhapMang();
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    // Hàm xuất mảng cho bài 5 và bài 10
    public static void xuatMang(int h[])
    {
        for (int i = 0; i < h.length; i++)
        {
            System.out.println(" " + h[i]);
        }
    }

    public static int[][] nhapMang2Chieu()
    {
        int num7 = 0, num8 = 0;
        while (true)
        {
            try
            {
                System.out.print("Nhap so hang cua mang: ");
                num7 = Integer.parseInt(sc.nextLine());
                System.out.print("Nhap so cot cua mang: ");
                num8 = Integer.parseInt(sc.nextLine());
                break;
            }
            catch (Exception e)
            {
                System.out.println("Gia tri khong hop le, hay nhap lai");
                sc.next();
            }
        }
        int[][] arr2 = new int[num7][num8];
        for (int i = 0; i < num7; i++)
        {
            for (int j = 0; j < num8; j++)
            {
                try
                {
                    System.out.println("Nhap phan tu thu " + (i + 1) + ", " + (j + 1) + ": ");
                    arr2[i][j] = Integer.parseInt(sc.nextLine());
                    if (arr2[i][j] > 0 && arr2[i][j] < 100) continue;
                    else System.out.println("Gia tri khong hop le, hay nhap lai");
                }
                catch (Exception e)
                {
                    System.out.println("Gia tri khong hop le, hay nhap lai");
                    sc.next();
                }
            }
        }
            return arr2;
        }

    public static void main(String[] args)
    {
        /* int[] h = {5, 3, 8, 6, 2}; // Mảng cho bài 5 và 10

        kiemTraTamGiac(); // Bài 2
        tongCacSoChan(); // Bài 3
        
        // Bài 4
        System.out.print("\n\nNhap so muon kiem tra: ");
        int num1 = sc.nextInt();
        kiemTraKhongDeQuy(num1);

        mangTangDan(h); // Bài 5

        // Bài 6
        System.out.print("\nNhap cac so muon tinh tong giai thua: ");
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        System.out.printf("Tong giai thua cua cac so %d, %d, %d, %d la: %d", d, e, f, g, tongCacGiaiThua(d, e, f, g));

        mangGiamDan(h); // Bài 10
        soLonNhat(); // Bài 14
        soNhoNhat(); // Bài 14.1
        daoNguocChuoi(); // Bài 17

        // Bài 18
        System.out.print("\nSo muon phan tich: ");
        int num3 = sc.nextInt();
        phanTichThuaSoNguyenTo(num3);

        soHoanHao(); // Bài 27
        ketQuaDoiXung(); // Bài 30 */
        nhapMang();
    }
}
