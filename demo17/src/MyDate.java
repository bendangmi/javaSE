import java.util.Objects;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-8:10
 */
public class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate() {
    }

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return month == myDate.month && day == myDate.day && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, day, year);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        int y = Integer.compare(this.year, o.getYear());
        if(y != 0) return y;
        int m = Integer.compare(this.month, o.getMonth());
        if(m != 0) return m;
        return Integer.compare(this.day, o.getDay());
    }
}
