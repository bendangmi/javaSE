package LambdaTest;

import java.util.function.Consumer;

/**
 * @author 本当迷
 * @Description 语法格式二：Lambda 需要一个参数，但是没有返回值。
 * @date 2022/7/3-22:11
 */
public class 语法格式二 {
    public static void main(String[] args) {
        final Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("我爱JAVA！");

        System.out.println("*******************");
        Consumer<String> c1 = (String s) -> {System.out.println(s);};
        c1.accept("JAVA爱我！");



    }
}
