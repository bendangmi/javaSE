/**
 * @author 本当迷
 * @Description Enum的基本使用
 * @date 2022/5/26-10:14
 */
public class EnumTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        Season summer = Season.SUMMER;
        Season autumn = Season.AUTUMN;
        Season winter = Season.WINTER;
        System.out.println(spring);

        // 迭代枚举类中的所有枚举值
        for (Season value : Season.values()) {
            System.out.print(value + " ");
        }
        System.out.println();

        // valueOf(String objName):返回枚举类中对象名是objName的对象。
        Season sum = Season.valueOf("SUMMER");
        System.out.println(sum);

    }
}

enum Season {
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日绵绵"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "冬去春来"),
    ;
    private final String seasonName;
    private final String seasonDescription;

    Season(String seasonName, String seasonDescription) {
        this.seasonName = seasonName;
        this.seasonDescription = seasonDescription;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDescription() {
        return seasonDescription;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDescription='" + seasonDescription + '\'' +
                '}';
    }

}