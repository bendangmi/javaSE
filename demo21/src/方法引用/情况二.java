package 方法引用;

import java.util.Comparator;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/4-8:11
 */
public class 情况二 {
    public static void main(String[] args) {
        // 情况二：类 :: 静态方法
        //Comparator中的int compare(T t1,T t2)
        //Integer中的int compare(T t1,T t2)
        Comparator<Integer> comparator = (t1, t2) -> Integer.compare(t1, t2);
        System.out.println(comparator.compare(1, 2));

        System.out.println("****************************");
        Comparator<Integer> comparator1 = Integer::compareTo;
        System.out.println(comparator1.compare(2, 1));

    }
}
