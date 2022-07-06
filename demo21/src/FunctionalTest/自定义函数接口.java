package FunctionalTest;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-23:23
 */

/*
 * 4.Lambda表达式的本质：作为函数式接口的实例
 *
 * 5. 如果一个接口中，只声明了一个抽象方法，则此接口就称为函数式接口。我们可以在一个接口上使用 @FunctionalInterface 注解，
 *   这样做可以检查它是否是一个函数式接口。
 *
 */

@FunctionalInterface
interface MyInterface {
        void method(String s1);
}

public class 自定义函数接口 {
    public static void main(String[] args) {
        show("我爱JAVA！", s-> System.out.println(s));
    }

    public static void show(String s, MyInterface myInterface){
        myInterface.method(s);
    }
}
