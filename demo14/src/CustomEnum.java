import java.util.Objects;

/**
 * @author 本当迷
 * @Description 自定义枚举
 * @date 2022/5/26-9:41
 */
public class CustomEnum {
    public static void main(String[] args) {
        CustomEnumTest spring = CustomEnumTest.SPRING;
        CustomEnumTest summer = CustomEnumTest.SUMMER;
        CustomEnumTest autumn = CustomEnumTest.AUTUMN;
        CustomEnumTest winter = CustomEnumTest.WINTER;
        System.out.println(spring);
        System.out.println(summer);
        System.out.println(autumn);
        System.out.println(winter);
    }
}

class CustomEnumTest {
    private final String seasonName; // 季节
    private final String seasonDescription; // 季节描述

    CustomEnumTest(String seasonName, String seasonDescription) {
        this.seasonName = seasonName;
        this.seasonDescription = seasonDescription;
    }


    public static final CustomEnumTest SPRING = new CustomEnumTest("春天", "春心萌动");
    public static final CustomEnumTest SUMMER = new CustomEnumTest("夏天", "夏日绵绵");
    public static final CustomEnumTest AUTUMN = new CustomEnumTest("秋天", "秋高气爽");
    public static final CustomEnumTest WINTER = new CustomEnumTest("冬天", "冬至春来");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDescription() {
        return seasonDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomEnumTest that = (CustomEnumTest) o;
        return seasonName.equals(that.seasonName) && seasonDescription.equals(that.seasonDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seasonName, seasonDescription);
    }

    @Override
    public String toString() {
        return "CustomEnumTest{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDescription='" + seasonDescription + '\'' +
                '}';
    }

}
