package 获取运行时类的完整结构;

import java.lang.reflect.Method;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-11:54
 */
public class 获取运行时类的方法结构 {
    public static void main(String[] args) {
        final Class<Person> aClass = Person.class;

        // getMethods()：获取当前运行时类及其所有父类中声明为public权限的方法
        final Method[] methods = aClass.getMethods();
        for (Method m :
                methods) {
            System.out.println(m);
        }
        System.out.println("****************");

        // getDeclaredMethods():获取当前运行类中声明的所有方法（不包含父类中声明的方法）
        final Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method m :
                declaredMethods) {
            System.out.println(m);
        }

    }
}
