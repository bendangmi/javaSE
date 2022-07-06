package 获取运行时类的完整结构;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-13:43
 */
public class 获取运行时类的父类及父类的泛型 {
    public static void main(String[] args) {
        final Class<Person> aClass = Person.class;

        // getSuperclass : 获取运行时类的父类
        final Class<? super Person> superclass = aClass.getSuperclass();
        System.out.println(superclass);
        System.out.println("*******************");

        // 获取运行时类的带泛型的父类
        final Type genericSuperclass = aClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
        System.out.println("*******************");

        // 获取运行时类的带泛型的父类的泛型
        final ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        final Type[] typeArguments = parameterizedType.getActualTypeArguments();
        System.out.println(((Class<?>)typeArguments[0]).getName());


    }
}
