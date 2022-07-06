import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-7:07
 */
public class 反射调用公有属性方法构造器 {
    public static void main(String[] args) throws Exception{
        final Class<Person> aClass = Person.class;

        // 通过反射，创建构造器，实例化Person对象
        final Constructor<Person> constructor = aClass.getConstructor(String.class, int.class);
        final Person person = constructor.newInstance("本当迷", 18);

        // 通过反射，调用对象指定的属性和 方法
        // 调用属性
        final Field age = aClass.getDeclaredField("age");
        age.set(person, 11);
        System.out.println(person);

        // 调用方法
        final Method info = aClass.getDeclaredMethod("showInfo");
        info.invoke(person);



    }
}
