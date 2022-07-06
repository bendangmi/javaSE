/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-8:00
 */

/**
 * 2.换句话说，Class的实例就对应着一个运行时类。
 * 3.加载到内存中的运行时类，会缓存一定的时间。在此时间之内，我们可以通过不同的方式
 * 来获取此运行时类。
 */
public class 创建Class实例的4种方式 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 方式一：
        final Class<Person> aClass = Person.class;
        System.out.println(aClass);

        // 方式二：通过运行时类的对象，调用getClass()
        final Person person = new Person();
        final Class<? extends Person> personClass = person.getClass();
        System.out.println(personClass);

        // 方式三：调用Class的静态方法：forName(String classPath)
        final Class<?> person1 = Class.forName("Person");
        System.out.println(person1);

        // 方法四：使用类的加载器：ClassLoader(了解)
        final ClassLoader loader = 创建Class实例的4种方式.class.getClassLoader();
        final Class<?> person2 = loader.loadClass("Person");
        System.out.println(person2);
    }
}
