package LambdaTest;

import java.util.Comparator;

/**
 * @author 本当迷
 * @Description 语法格式五：Lambda需要两个或以上的参数，多条执行语句，并且可以有返回值
 * @date 2022/7/3-22:25
 */
public class 语法格式五 {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
        System.out.println(comparator.compare(1, 2));

        System.out.println("*******************");
        Comparator<Integer> comparator1 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(comparator1.compare(2, 1));

    }
}
