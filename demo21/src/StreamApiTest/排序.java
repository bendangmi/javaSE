package StreamApiTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/4-14:45
 */
public class 排序 {
    @Test
    public void test(){
        // sorted() 自然排序
        final List<Integer> list = Arrays.asList(1, 3, 2, 4, 6, 8, 5, 9);
        list.stream().sorted().forEach(System.out::print);
        System.out.println();
        System.out.println("**************************");

        // sorted(Comparator com) 定制排序
        final List<Employee> list1 = EmployeeData.getEmployees();
        final Stream<Employee> sorted = list1.stream().sorted(Comparator.comparingInt(Employee::getAge));
        sorted.forEach(System.out::println);

    }
}
