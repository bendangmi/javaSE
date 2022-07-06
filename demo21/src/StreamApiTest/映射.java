package StreamApiTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 本当迷
 * @Description 2-映射
 * @date 2022/7/4-14:33
 */
public class 映射 {
    public static void main(String[] args) {

    }

    @Test
    public void test (){
        // map(Function f) 接收一个函数作为参数，将元素转换为其他形式或提取信息，该函数会被应用到每个元素上，
        // 并且将其映射成一个新的元素
        final List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(String::toUpperCase).forEach(System.out::print);
        System.out.println();

        // 练习1：获取员工姓名长度大于3的员工姓名
        final List<Employee> employees = EmployeeData.getEmployees();
        final Stream<String> stringStream = employees.stream().map(Employee::getName);
        stringStream.filter(name -> name.length() > 3).forEach(System.out::println);


    }
}
