import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author 本当迷
 * @Description 注解的一般使用
 * @date 2022/5/26-12:24
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person(new StringBuilder("本当迷"), 19);
        System.out.println(person);
    }
}

@MyAnnotation(value = "本当迷")
class Person {
    private StringBuilder name;
    private int age;

    public Person(StringBuilder name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}

// 自定义注解
@Inherited // @Inherited: 被它修饰的Annotation 将具有继承性
// RetentionPolicy.RUNTIME:在运行时有效（即运行时保留），当运行Java 程序时, JVM 会保留注释。程序可以通过反射获取该注解。
@Retention(RetentionPolicy.RUNTIME)
// @Target: 用于修饰Annotation 定义, 用于指定被修饰的Annotation 能用于修饰哪些程序元素。
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
@interface MyAnnotation {
    String value() default "book";
}
