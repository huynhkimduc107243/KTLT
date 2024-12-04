package Buoi11_12;

import java.util.Scanner;

public class Buoi11
{
    private static final Scanner sc = new Scanner(System.in);

    // Bài 2: Nhập vào 3 số a, b, c. Kiểm tra và phân loại tam giác, dùng try-catch và while để nhập đến khi đúng
    public static void kiemTraTamGiac()
    {
        double a = 0, b = 0, c = 0;
        while (true)
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
            }
            System.out.println("Ba gia tri vua nhap khong tao thanh 3 canh tam giac");
        }
        
    }

    // Bài 3: Tổng các số chẵn từ 2 đến N
    public static void tongCacSoChan() {
        System.out.print("\nNhap so N: ");
        int N = 0;
        try {
            N = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Vui long nhap mot so nguyen.");
            sc.next(); // clear the invalid input
            return;
        }
        int tong = 0;

        // Tính tổng các số chẵn từ 2 đến N
        for (int i = 2; i <= N; i += 2) // i += 2 = i + 2 = i
        {
            tong += i;
        }
        System.out.printf("Tong cac so chan tu 2 den %d la: %d ", N, tong);
    }

    public static void kiemTraKhongDeQuy(int num1) {
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
        System.out.printf("%d la so nguyen to", num1);
    }

    public static long giaiThuaKhongDeQuy(int num2) {
        long giaiThua = 1;
        // Khi num2 > 1 thì tiếp tục nhân giaiThua với i và giảm num2 đi 1, ngược lại
        // trả về giaiThua
        for (int i = 1; i <= num2; i++) {
            giaiThua *= i;
        }
        return giaiThua;
    }

    public static long tongCacGiaiThua(int d, int e, int f, int g) {
        long tong = 0;
        tong = giaiThuaKhongDeQuy(d) + giaiThuaKhongDeQuy(e) + giaiThuaKhongDeQuy(f) + giaiThuaKhongDeQuy(g);
        return tong;
    }

    public static void phanTichThuaSoNguyenTo(int num3) {
        System.out.printf("%d phan tich thanh thua so nguyen to la: ", num3);
        int i = 2;
        // Khi num3 > 1 thì tiếp tục phân tích, nếu num3 chia hết cho i thì in ra i và
        // num3 = num3 / i, ngược lại tăng i lên 1 để kiểm tra tiếp
        while (num3 > 1) {
            if (num3 % i == 0) {
                System.out.print(" " + i);
                num3 = num3 / i;
            } else
                i++;
        }
    }

    public static void sapXepMang(int h[]) {
        System.out.println("Mang sau khi sap xep tang dan: ");
        // Sắp xếp mảng bằng thuật toán Bubble Sort
        for (int i = 0; i < h.length - 1; i++) {
            for (int j = 0; j < h.length - i - 1; j++) {
                if (h[j] > h[j + 1]) {
                    int temp = h[j];
                    h[j] = h[j + 1];
                    h[j + 1] = temp;
                }
            }
        }
        xuatMang(h);
    }

    public static void xuatMang(int h[]) {
        for (int i = 0; i < h.length; i++) {
            System.out.println(" " + h[i]);
        }
    }
    
    // Bài 14: Số lớn nhất trong 3 số được nhập vào bằng try-catch và dùng while để nhập đến khi đúng
    public static void soLonNhat()
    {
        int a = 0, b = 0, c = 0;
        while (true)
        {
            try
            {
                System.out.print("Nhap 3 so a, b, c: ");
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
                System.out.print("Nhap 3 so a, b, c: ");
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

    public static void main(String[] args) {
        kiemTraTamGiac();
        tongCacSoChan();
        soLonNhat();
        soNhoNhat();

        System.out.print("\n\nNhap so muon kiem tra: ");
        int num1 = sc.nextInt();
        kiemTraKhongDeQuy(num1);

        System.out.print("\n\nNhap cac so muon tinh tong giai thua: ");
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        System.out.printf("Tong giai thua cua cac so %d, %d, %d, %d la: %d", d, e, f, g, tongCacGiaiThua(d, e, f, g));

        System.out.print("\nSo muon phan tich: ");
        int num3 = sc.nextInt();
        phanTichThuaSoNguyenTo(num3);

        // Bài 5:
        // sapXepMang(h);
    }
}
