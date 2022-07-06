package LambdaTest;

import java.util.function.Consumer;

/**
 * @author 本当迷
 * @Description 语法格式三：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
 * @date 2022/7/3-22:16
 */
public class 语法格式三 {
    public static void main(String[] args) {
       Consumer<String>c1 = (String s) -> {
           System.out.println(s);
       };
       c1.accept("我爱JAVA！");

       System.out.println("****************");
       Consumer<String>c2 = (s) -> {
           System.out.println(s);
       };
       c2.accept("JAVA爱我！");

    }
}
