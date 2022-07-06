package 方法引用;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/4-8:04
 */

import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 方法引用的使用
 *
 * 1.使用情境：当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用！
 *
 * 2.方法引用，本质上就是Lambda表达式，而Lambda表达式作为函数式接口的实例。所以
 *   方法引用，也是函数式接口的实例。
 *
 * 3. 使用格式：  类(或对象) :: 方法名
 *
 * 4. 具体分为如下的三种情况：
 *    情况1     对象 :: 非静态方法
 *    情况2     类 :: 静态方法
 *
 *    情况3     类 :: 非静态方法
 *
 * 5. 方法引用使用的要求：要求接口中的抽象方法的形参列表和返回值类型与方法引用的方法的
 *    形参列表和返回值类型相同！（针对于情况1和情况2）
 */

public class 情况一 {
    // 情况一：对象 :: 实例方法
    //Consumer中的void accept(T t)
    //PrintStream中的void println(T t)

    public static void main(String[] args) {
        Consumer<String> c1 = str -> System.out.println(str);
        c1.accept("我爱JAVA！");

        System.out.println("****************************");
        PrintStream ps = System.out;
        Consumer<String> c2 = ps::println;
        c2.accept("我爱JAVA！");

        System.out.println("********************");
        Employee emp = new Employee(12, "本当迷");
        Supplier<String> sk1 = () -> emp.getName();
        System.out.println(sk1.get());

        System.out.println("********************");
        Supplier<String>sk2 = emp::getName;
        System.out.println(sk2.get());




    }

}
