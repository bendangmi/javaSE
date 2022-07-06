import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-8:09
 */
public class Main {
    public static void main(String[] args) {
        final TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        final Employee employee = new Employee("1本当迷", 18, new MyDate(1, 2, 3));
        final Employee employee1 = new Employee("3小当迷", 20, new MyDate(4, 5, 5));
        final Employee employee2 = new Employee("2帅帅的本当迷", 14, new MyDate(6, 6, 2));

        set.add(employee);
        set.add(employee1);
        set.add(employee2);
        System.out.println(set);

        for (Employee emp:
             set) {
            System.out.println(emp + " ");
        }


    }
}
