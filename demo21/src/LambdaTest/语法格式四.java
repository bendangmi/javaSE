package LambdaTest;

import java.util.function.Consumer;

/**
 * @author 本当迷
 * @Description 语法格式四：Lambda若只需要一个参数时，参数的小括号可以省略
 * @date 2022/7/3-22:22
 */
public class 语法格式四 {
    public static void main(String[] args) {
        Consumer<String>c1 = (String s) -> {
            System.out.println(s);
        };
        c1.accept("我爱JAVA！");

        System.out.println("****************");
        Consumer<String>c2 = s -> {
            System.out.println(s);
        };
        c2.accept("JAVA爱我！");

    }
}
