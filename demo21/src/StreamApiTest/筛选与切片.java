package StreamApiTest;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author 本当迷
 * @Description 1-筛选与切片
 * @date 2022/7/4-14:04
 */
public class 筛选与切片 {
    public static void main(String[] args) {

    }
    @Test
    public void text(){
        final List<Employee> list = EmployeeData.getEmployees();

        // filter(predicate p) 接受Lambda，从流中排除某些元素
        final Stream<Employee> stream = list.stream();
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);
        System.out.println("****************************");

        // limit(n) 截断流，使其元素不超过给定数量
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("*****************************");

        // skip(n) 跳过元素，返回一个扔掉了前n个元素的流。若流元素不足n个，则返回一个空流。与limit(n)互补
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("*****************************");

        // distinct() 筛选，通过流所生成的元素hashCode()和equals()去除重复元素
        list.add(new Employee(1013,"李飞",42,8500));
        list.add(new Employee(1013,"李飞",40,8000));
        list.add(new Employee(1013,"李飞",40,8000));
        list.stream().distinct().forEach(System.out::println);
    }
}
