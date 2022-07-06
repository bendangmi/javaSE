import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-7:08
 */
public class 反射调用私有属性方法构造器 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        // 通过反射，创建Person构造器
        final Class<Person> aClass = Person.class;
        final Constructor<Person> constructor = aClass.getConstructor(String.class, int .class);
        constructor.setAccessible(true);  // 构造器设置为无障碍，即可调用私有构造器

        // 通过反射，利用Person构造器实例化对象
        final Person person = constructor.newInstance("本当迷", 19);

        // 通过反射调用私有属性
        final Field name = aClass.getDeclaredField("name");
        name.setAccessible(true); // 属性设置为无障碍，即可调用私有属性
        name.set(person, "帅帅的本当迷");
        System.out.println(person);

        // 通过反射调用私有方法
        final Method getPlay = aClass.getDeclaredMethod("getPlay", String.class);
        getPlay.setAccessible(true);
        getPlay.invoke(person, "电脑");



    }
}
