package 获取运行时类的完整结构;

import java.lang.reflect.Constructor;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-13:21
 */
public class 获取运行时类的构造器结构 {
    public static void main(String[] args) {
        final Class<Person> aClass = Person.class;

        // getConstructors()：获取当前运行时类声明为public的构造器
        final Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor c :
                constructors) {
            System.out.println(c);

        }
        System.out.println("********************");

        // getDeclaredConstructors()：获取当前运行时类中声明的所有构造函数
        final Constructor<?>[] constructors1 = aClass.getDeclaredConstructors();
        for (Constructor c:
             constructors1) {
            System.out.println(c);
        }



    }
}
