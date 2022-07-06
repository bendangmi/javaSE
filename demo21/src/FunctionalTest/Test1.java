package FunctionalTest;

import java.util.function.Consumer;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-23:28
 */

/**
 * java内置的4大核心函数式接口
 *
 * 消费型接口 Consumer<T>     void accept(T t)
 * 供给型接口 Supplier<T>     T get()
 * 函数型接口 Function<T,R>   R apply(T t)
 * 断定型接口 Predicate<T>    boolean test(T t)
 */

public class Test1 {
    public static void main(String[] args) {
        happyTime(100, time -> System.out.println("快12点了" + time + "秒后睡觉！"));
    }

    public static void happyTime(double time, Consumer<Double> doubleConsumer){
        doubleConsumer.accept(time);
    }
}
