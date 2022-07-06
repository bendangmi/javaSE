package LambdaTest;

import java.util.Comparator;

/**
 * @author 本当迷
 * @Description 语法格式六：当Lambda体只有一条语句时，return与大括号若有，都可以省略
 * @date 2022/7/3-22:32
 */
public class 语法格式六 {
    public static void main(String[] args) {
        Comparator<Integer>comparator = (o1, o2) ->{
            return o1.compareTo(o2);
        };
        System.out.println(comparator.compare(1, 2));

        System.out.println("***********************");
        Comparator<Integer>comparator1 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator1.compare(2, 1));


    }
}
