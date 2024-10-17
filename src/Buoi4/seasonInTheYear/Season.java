package Buoi4.seasonInTheYear;

// enum chứa nhiều giá trị
public enum Season {
    SPRING("Spring month: Jan-Mar", "Cool", "The 1st quarter"),
    SUMMER("Summer month: Apr-May", "Hot", "The 2st quarter"),
    AUTUMN("Autumn month: Jun-Aug", "Chilly", "The 3st quarter"),
    WINTER("Winter month: Sep-Dec", "Cold", "The 4st quarter");

    // Khai báo thuộc tính của từng giá trị
    private String month;
    private String climate;
    private String quarter;

    // Phương thức khởi tạo giá trị cho từng giá trị
    private Season(String month, String clime, String quarter) {
        this.month = month;
        this.climate = clime;
        this.quarter = quarter;
    }

    // get & set
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public class season {
        public static void main(String[] args) {
            // Xuất ra màn hình
            System.out.println(
                    Season.SPRING.getMonth() + " | " + Season.SPRING.getClimate() + " | " + Season.SPRING.getQuarter());
            System.out.println(
                    Season.SUMMER.getMonth() + " | " + Season.SUMMER.getClimate() + " | " + Season.SUMMER.getQuarter());
            System.out.println(
                    Season.AUTUMN.getMonth() + " | " + Season.AUTUMN.getClimate() + " | " + Season.AUTUMN.getQuarter());
            System.out.println(
                    Season.WINTER.getMonth() + " | " + Season.WINTER.getClimate() + " | " + Season.WINTER.getQuarter());
        }
    }
}