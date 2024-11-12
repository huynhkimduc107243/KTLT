package Chuong4;

public class Demo1 {
  // Toán tử (ví dụ 1-7)
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

  // Thu hẹp (Narrowing) double -> float -> long -> int -> short -> byte
  public static void chiDinhEpKieu(String[] args) {
    double dou = 120;
    long lo = (long) dou; // yêu cẩu chỉ định ép kiểu long
    int in = (int) lo; // yêu cầu chỉ định ép kiểu int

    System.out.println("\nGia tri Int: " + in);
  }

  // Nới rộng (Widening) byte -> short -> int -> long -> float -> double
  public static void khongChiDinhEpKieu(String[] args) {
    int in = 120;
    long ll = in; // không yêu cầu chỉ định ép kiểu
    float fl = ll; // không yêu cầu chỉ định ép kiểu

    System.out.println("\nGia tri Int: " + in);
    System.out.println("Gia tri Float: " + fl);
    System.out.println("Gia tri Long: " + ll);
  }

  // Chuyển từ String sang Int, Long, Double, Float, Short
  public static void chuyenDoiKieu1(String[] args) {
    String str = "200";
    // Sử dụng Integer.parseInt(), Long.parseLong(), Double.parseDouble(),
    // Float.parseFloat(), Short.parseShort()
    System.out.println("\nGia tri sau khi chuyen string co gia tri 200 thanh Int: " + Integer.parseInt(str));
    System.out.println("Gia tri sau khi chuyen string co gia tri 200 thanh Long: " + Long.parseLong(str));
    System.out.println("Gia tri sau khi chuyen string co gia tri 200 thanh Double: " + Double.parseDouble(str));
    System.out.println("Gia tri sau khi chuyen string co gia tri 200 thanh Float: " + Float.parseFloat(str));
    System.out.println("Gia tri sau khi chuyen string co gia tri 200 thanh Short: " + Short.parseShort(str));
  }

  // Chuyển từ Int, Long, Double, Float, Short sang String
  public static void chuyenDoiKieu2(String[] args) {
    int in = 200;
    long ll = 9991991991L;
    short sh = 999;
    float fl = 999.999F;
    double db = 999.999D;

    // Sử dụng String.valueOf() hoac Integer.toString(), Long.toString(),
    // Double.toString(), Float.toString(), Short.toString()
    System.out.println("\nGia tri sau khi chuyen Int co gia tri 200 thanh String: " + Integer.toString(in));
    System.out.println("Gia tri sau khi chuyen Long co gia tri 200 thanh String: " + Long.toString(ll));
    System.out.println("Gia tri sau khi chuyen Double co gia tri 200 thanh String: " + Double.toString(sh));
    System.out.println("Gia tri sau khi chuyen Float co gia tri 200 thanh String: " + Float.toString(fl));
    System.out.println("Gia tri sau khi chuyen Short co gia tri 200 thanh String: " + String.valueOf(db));
  }

  public static void main(String[] args) {
    viDu1();
    viDu2();
    viDu3();
    viDu4();
    chiDinhEpKieu(args);
    khongChiDinhEpKieu(args);
    chuyenDoiKieu1(args);
    chuyenDoiKieu2(args);
  }
}
