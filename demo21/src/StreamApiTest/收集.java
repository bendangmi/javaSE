package StreamApiTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/4-15:11
 */
public class 收集 {
    @Test
    public void test(){
        // collect(Collect c) 将流转换为其他形式。接收一个Collector接口的实现。用于给stream中元素做汇总的方法
        // 查找工资大于6000 的员工，结果返回一个List或set

        final List<Employee> employees = EmployeeData.getEmployees();
        final Stream<Employee> stream = employees.stream().filter(e -> e.getSalary() > 6000);
        final List<Employee> collect = stream.collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("*************************************");
        final List<Employee> employees1 = EmployeeData.getEmployees();
        final Stream<Employee> stream1 = employees1.stream().filter(e -> e.getSalary() > 6000);
        final Set<Employee> collect1 = stream1.collect(Collectors.toSet());
        collect1.forEach(System.out::println);

    }
}
