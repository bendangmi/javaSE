/**
 * @author 本当迷
 * @Description
 * @date 2022/7/4-8:36
 */

import 方法引用.Employee;

import java.util.function.Supplier;

/**
 * 一、构造器引用
 *      和方法引用类似，函数式接口的抽象方法的形参列表和构造器的形参列表一致。
 *      抽象方法的返回值类型即为构造器所属的类的类型
 *
 * 二、数组引用
 *     可以把数组看做是一个特殊的类，则写法与构造器引用一致。
 */

public class 构造器引用 {
    public static void main(String[] args) {
        Supplier<Employee> supplier = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };
        System.out.println("*****************************");

        Supplier<Employee>supplier1 = () -> new Employee();
        System.out.println(supplier1.get());
        System.out.println("*****************************");

        Supplier<Employee>supplier2 = Employee::new;
        System.out.println(supplier2.get());


    }
}
