package StreamApiTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/4-15:11
 */
public class 归约 {
    @Test
    public void test(){
        // reduce(T identity, BinaryOperator)——可以将流中元素反复结合起来，得到一个值。返回 T
        // 计算1-10的自然数的和
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        final Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        // reduce(BinaryOperator) ——可以将流中元素反复结合起来，得到一个值。返回 Optional<T>
        // 计算公司所有员工工资的总结
        final List<Employee> employees = EmployeeData.getEmployees();
        final Stream<Double> doubleStream = employees.stream().map(Employee::getSalary);
        final Optional<Double> reduce1 = doubleStream.reduce(Double::sum);
        System.out.println(reduce1.get());
    }
}
