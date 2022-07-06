package 获取运行时类的完整结构;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-11:40
 */
public class 获取运行时类的属性结构 {
    public static void main(String[] args) {
        final Class<Person> aClass = Person.class;

        // 获取属性结构
        // getFields()：获取当前运行时类及其父类中声明为public访问权限的属性
        final Field[] fields = aClass.getFields();
        for (Field f :
                fields) {
            System.out.println(f);
        }
        System.out.println("*************************");

        // getDeclareFields()：获取当前类的所有属性（不包含父类中声明的属性）
        final Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field:
             declaredFields) {
            System.out.println(field);

        }

        System.out.println("*************************");
        // getDeclareFields()：获取当前类的所有属性 : 权限修饰符  数据类型 变量名

        for (Field field:
                declaredFields) {
            // 权限修饰符
            final int modifiers = field.getModifiers();
            System.out.print(Modifier.toString(modifiers) + "\t");

            // 数据类型
            final Class<?> type = field.getType();
            System.out.print(type.getName() + " \t");

            // 变了吗
            final String name = field.getName();
            System.out.print(name);
            System.out.println();

        }

    }
}
