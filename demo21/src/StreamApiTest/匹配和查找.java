package StreamApiTest;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/4-14:53
 */
public class 匹配和查找 {
    @Test
    public void test1(){
        final List<Employee> employees = EmployeeData.getEmployees();

        // allMatch(Predicate p) 检查是否匹配所有元素
        // 练习：是否所有员工的年龄都大于18
        final boolean b = employees.stream().allMatch(e -> e.getAge() > 18);
        System.out.println(b);
        System.out.println("****************************");

        // anyMatch(Predicate p) 检查是否至少匹配一个元素
        // 练习：是否存在员工的工资大于10000
        final boolean b1 = employees.stream().anyMatch(e -> e.getSalary() > 10000);
        System.out.println(b1);
        System.out.println("****************************");

        // noneMath(Predicate p) 检测是否没有匹配的元素
        // 练习：是否存在员工性“马”
        final boolean b2 = employees.stream().noneMatch(e -> e.getName().startsWith("马"));
        System.out.println(b2);

        // findFirst 返回第一个元素
        final Optional<Employee> first = employees.stream().findFirst();
        System.out.println(first);

        // findAny 返回当前流中的任意元素
        final Optional<Employee> any = employees.parallelStream().findAny();
        System.out.println(any);
    }

    @Test
    public void test2(){
        final List<Employee> employees = EmployeeData.getEmployees();

        // count 返回流中的元素个数
        final long count = employees.stream().filter(e -> e.getSalary() > 4500).count();
        System.out.println(count);

        // 返回流中的最大值
        final Optional<Employee> max = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(max);

        // 返回流中的最小值
        final Optional<Employee> min = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(min);

        // forEach(Consumer c) 内部迭代
        employees.stream().forEach(System.out::println);
        System.out.println("*****************");

        // 使用集合的遍历操作
        employees.forEach(System.out::println);
    }

}
