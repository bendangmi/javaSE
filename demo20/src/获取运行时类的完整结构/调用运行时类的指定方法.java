package 获取运行时类的完整结构;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-14:13
 */
public class 调用运行时类的指定方法 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        final Class<Person> aClass = Person.class;
        // 创建类的对象
        final Person person = aClass.newInstance();

        // 获取指定的某个方法
        final Method display = aClass.getDeclaredMethod("display", String.class);

        // 保证当前方法是可用的
        display.setAccessible(true);

        //调用方法的invoke():参数1：方法的调用者  参数2：给方法形参赋值的实参
        //invoke()的返回值即为对应类中调用的方法的返回值。
        final Object invoke = display.invoke(person, "电脑");
        System.out.println(invoke);

        System.out.println("************如何调用静态的方法************");
        final Method showX = aClass.getDeclaredMethod("showX");
        showX.setAccessible(true);
        showX.invoke(Person.class);
    }
}
