package 方法引用;

import javax.lang.model.element.NestingKind;
import java.util.Comparator;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/4-8:23
 */
public class 情况三 {
    // 情况三：类 :: 实例方法  (有难度)
    // Comparator中的int compare(T t1,T t2)
    // String中的int t1.compareTo(t2)
    public static void main(String[] args) {
        Comparator<String> com1 = (s1, s2) -> s1.compareTo(s2);
        System.out.println(com1.compare("abc", "abd"));

        System.out.println("***********************");
        Comparator<String> com2 = String::compareTo;
        System.out.println(com2.compare("abd", "abc"));
    }
}
