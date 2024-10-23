package Buoi6;

public class Bai5_2 {
    public static void viDu1() {
        int a = 3;

        System.out.println("Ex 1:");
        // a++/a-- tăng/giảm sau, ++/--a tăng/giảm trước,
        System.out.println(a++); // In ra a ban đầu rồi +1 = 3
        System.out.println(++a); // 3 + 1 rồi +1 = 5
        System.out.println(a++ + 1); // 5 + 1 = 6 rồi +1 = 7
        System.out.println(++a + 1); // 7 + 1 = 8
    }

    public static void viDu2() {
        int a = 0, b, c;
        a++;
        b = a;
        c = a++;

        System.out.println("\nEx 2:");
        System.out.println(a); // a = 1
        System.out.println(b); // gán b = a
        System.out.println(c); // gán c = a rồi +1
    }

    public static void viDu3() {
        int a = 0, b, c;
        ++a;
        b = a;
        c = ++a;

        System.out.println("\nEx 3:");
        System.out.println(a); // a = 0 -> 1
        System.out.println(b); // gán b = a
        System.out.println(c); // gán c = a + 1
    }

    public static void viDu4() {
        int a = 0, b, c;
        ++a;
        b = ++a;
        c = ++a;

        System.out.println("\nEx4:");
        System.out.println(a); // a = 0 -> 1
        System.out.println(b); // gán b = a + 1 = 2
        System.out.println(c); // gán c = 3 + 1 = 3
    }

    public static void viDu5() {
        int a = 0, b, c;
        ++a;
        b = ++a;
        c = b++;
        System.out.println("\nEx");
        System.out.println(a); //
        System.out.println(b);
        System.out.println(c);
    }

    public static void viDu6() {
        int a = 0, b, c;
        ++a;
        b = ++a;
        c = b++;
        System.out.println("\nEx 6:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
