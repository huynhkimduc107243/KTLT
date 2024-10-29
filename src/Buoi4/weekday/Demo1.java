package Buoi4.weekday;

// Định nghĩa enum chứa các thứ trong tuần bên ngoài lớp
enum Weekday2
{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class Demo1
{
    // Định nghĩa enum chứa các thứ trong tuần bên trong lớp
    enum Weekday
    {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    // Khởi tạo giá trị cho hằng số enum
    enum Weekday4
    {
        MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7), SUNDAY(8);
        private int value;
        private Weekday4(int value)
        {
            this.value = value;
        }
    }

    public static void main(String[] args)
    {
        // Xuất ra màn hình các thứ trong tuần
        System.out.println("Thu 2 -> " + Weekday.MONDAY);
        System.out.println("Thu 3 -> " + Weekday.TUESDAY);
        System.out.println("Thu 4 -> " + Weekday2.WEDNESDAY);
        System.out.println("Thu 5 -> " + Weekday2.THURSDAY);
        System.out.println("Thu 6 -> " + Weekday3.FRIDAY);
        System.out.println("Thu 7 -> " + Weekday3.SATURDAY);
        System.out.println("Chu nhat -> " + Weekday3.SUNDAY);

        System.out.println("Cac thu trong tuan + gia tri");
        System.out.println("Thu 2 -> " + Weekday4.MONDAY.value);
        System.out.println("Thu 3 -> " + Weekday4.TUESDAY.value);
        System.out.println("Thu 4 -> " + Weekday4.WEDNESDAY.value);
        System.out.println("Thu 5 -> " + Weekday4.THURSDAY.value);
        System.out.println("Thu 6 -> " + Weekday4.FRIDAY.value);
        System.out.println("Thu 7 -> " + Weekday4.SATURDAY.value);
        System.out.println("Chu nhat -> " + Weekday4.SUNDAY.value);
    }
}