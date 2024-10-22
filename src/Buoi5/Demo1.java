package Buoi5;

public class Demo1 {
    public static void viDu1() {
        int a = 3;

        System.out.println("Ex 1:");
        // a++/a-- tăng/giảm sau, ++/--a tăng/giảm trước,
        System.out.println(a++); // In ra a ban đầu rồi +1 = 3
        System.out.println(++a); // 3 + 1 rồi +1 = 5
        System.out.println(a+++1); // 5 + 1 = 6 rồi +1 = 7
        System.out.println(++a+1); // 7 + 1 = 8
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

    public static void viDu7() {
        int x = 11 % 4;
        boolean a = (9 < 2) && true || (4 > 3);

        System.out.println("\nEx 7:");
        System.out.println(x);
        System.out.println(a);
    }

    public static void chiDinhEpKieu(String[] args) {
        double dou = 120;
        long lo = (long)dou; // yêu cẩu chỉ định ép kiểu long
        int in = (int)lo; // yêu cầu chỉ định ép kiểu int

        System.out.println("Gia tri Int: " + in);
    }

    public static void khongChiDinhEpKieu(String[] args) {
        int in = 120;
        long ll = in; // không yêu cầu chỉ định ép kiểu
        float fl = ll; // không yêu cầu chỉ định ép kiểu

        System.out.println("Gia tri Int: " + in);
        System.out.println("Gia tri Float: " + fl);
        System.out.println("Gia tri Long: " + ll);
    }

    public static void main(String[] args) {
        viDu1();
        viDu2();
        viDu3();
        viDu4();
        viDu7();
        chiDinhEpKieu(args);
        khongChiDinhEpKieu(args);
    }
}