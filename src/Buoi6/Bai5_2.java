package Buoi6;

public class Bai5_2 {
    public static void viDu1()
    {
        int a = 3;

        System.out.println("Ex 1:");
        System.out.println(a++); // 3
        System.out.println(++a); // 5
        System.out.println(a++ + 1); // 6
        System.out.println(++a + 1); // 8
    }

    public static void viDu2()
    {
        int a = 0, b, c;
        a++;
        b = a; // b = 1
        c = a++; // c = 1, a = 2

        System.out.println("\nEx 2:");
        System.out.println(a); // 2
        System.out.println(b); // 1
        System.out.println(c); // 1
    }

    public static void viDu3()
    {
        int a = 0, b, c;
        ++a; // a = 1
        b = a; // b = 1
        c = ++a; // c = 2, a = 2

        System.out.println("\nEx 3:");
        System.out.println(a); // 2
        System.out.println(b); // 1
        System.out.println(c); // 2
    }

    public static void viDu4()
    {
        int a = 0, b, c;
        ++a; // a = 1
        b = ++a; // b = 2, a = 2
        c = ++a; // c = 3, a = 3

        System.out.println("\nEx 4:");
        System.out.println(a); // 3
        System.out.println(b); // 2
        System.out.println(c); // 3
    }

    public static void viDu5()
    {
        int a = 0, b, c;
        ++a; // a = 1
        b = ++a; // b = 2, a = 2
        c = b++; // c = 2, b = 3

        System.out.println("\nEx 5:");
        System.out.println(a); // 2
        System.out.println(b); // 3
        System.out.println(c); // 2
    }

    public static void viDu6()
    {
        int a = 0, b, c;
        ++a; // a = 1
        b = a++; // b = 1, a = 2
        c = b++; // c = 1, b = 2
        c += c; // c = 2

        System.out.println("\nEx 6:");
        System.out.println(a); // 2
        System.out.println(b); // 2
        System.out.println(c); // 2
    }

    public static void main(String[] args)
    {
        viDu1();
        viDu2();
        viDu3();
        viDu4();
        viDu5();
        viDu6();
    }
}