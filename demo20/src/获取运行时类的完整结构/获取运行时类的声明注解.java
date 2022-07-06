package 获取运行时类的完整结构;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-13:28
 */
public class 获取运行时类的声明注解 {
    public static void main(String[] args) {
        final Class<Person> aClass = Person.class;

        // 获取当前类以及父类方法声明的public权限注解（public权限）
        final Method[] methods = aClass.getMethods();
        for (Method m :
                methods) {
            final Annotation[] annotations = m.getAnnotations();
            for (Annotation a :
                    annotations) {
                System.out.println(a + " ");
            }
        }
        System.out.println("***********************");

        // 获取当前类的方法所有声明的注解
        final Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method m :
                declaredMethods) {
            final Annotation[] annotations = m.getAnnotations();
            for (Annotation a :
                    annotations) {
                System.out.println(a);
            }
        }

    }
}
