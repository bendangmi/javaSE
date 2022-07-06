package 获取运行时类的完整结构;

import java.lang.reflect.Field;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-14:06
 */
public class 调用运行时类的指定属性 {
    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        final Class<Person> aClass = Person.class;
        // 创建运行时类的对象
        final Person person = aClass.newInstance();

        // 获取运行时类中指定变量名的属性
        final Field name = aClass.getDeclaredField("name");
        // 保证当前属性是可访问的
        name.setAccessible(true);

        // 获取、设置指定对象的此属性值
        name.set(person, "本当迷");
        System.out.println(name.get(person));


    }
}
