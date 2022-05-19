import java.util.Scanner;

/**
 * @author 本当迷
 * @Description 封装练习
 * @date 2022/5/19-21:51
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = scanner.next();
        System.out.print("请输入年龄");
        int age = scanner.nextInt();
        System.out.println("请输入地址");
        String  address = scanner.next();
        Student student = new Student(name, age, address);
        System.out.println("姓名为：" + name + " 年龄为：" + age + " 地址为：" + address);
    }
}
