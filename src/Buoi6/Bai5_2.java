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
        a++; // a = 1 sau đó a = 0 + 1
        b = a; // gán b = a
        c = a++; // gán c = a sau đó a + 1 = 2

        System.out.println("\nEx 2:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void viDu3() {
        int a = 0, b, c;
        ++a; // a = 0 sau đó a = 0 + 1
        b = a; // gán b = a = 1
        c = ++a; // gán c = a + 1 = 2, gán lại a = 2

        System.out.println("\nEx 3:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void viDu4() {
        int a = 0, b, c;
        ++a; // a = 0 -> 1
        b = ++a; // gán b = a + 1 = 2
        c = ++a; // gán c = a + 1 = 3

        System.out.println("\nEx4:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void viDu5() {
        int a = 0, b, c;
        ++a; // a = 0, sau đó a + 1
        b = ++a; // gán b = a + 1 = 2
        c = b++; // c = b = 2, sau đó b + 1 = 3
        System.out.println("\nEx5:");
        System.out.println(a); // a = 0 -> 1
        System.out.println(b); // gán b = 1 + 1 = 2, a = 2
        System.out.println(c); // gán c = b = 2 rồi +1
    }

    public static void viDu6() {
        int a = 0, b, c;
        ++a; // a = 0 -> 1
        b = a++; // gán b = a = 1, a = 1 + 1 = 2
        c = b++; // c = 1, b + 1 = 2 gán cho b
        c += c; // c += c = 1 + 1 = 2
        System.out.println("\nEx6:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        viDu1();
        viDu2();
        viDu3();
        viDu4();
        viDu5();
        viDu6();
    }
}
