package StreamApiTest.实例化;

import StreamApiTest.Employee;
import StreamApiTest.EmployeeData;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author 本当迷
 * @Description 创建 Stream方式一：通过集合
 * @date 2022/7/4-10:02
 */
public class 方法一 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        // default Stream<E> stream()：返回一个顺序流
        final Stream<Employee> stream = employees.stream();

        // default Stream<E> parallelStream()：返回一个并行流
        final Stream<Employee> parallelStream = employees.parallelStream();
    }
}
