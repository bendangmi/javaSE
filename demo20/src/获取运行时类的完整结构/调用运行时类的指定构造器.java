package 获取运行时类的完整结构;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-14:35
 */
public class 调用运行时类的指定构造器 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        final Class<Person> aClass = Person.class;
        final Constructor<Person> constructor = aClass.getConstructor();
        constructor.setAccessible(true);

        final Person person = constructor.newInstance();

    }
}
