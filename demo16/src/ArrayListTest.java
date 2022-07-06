/**
 * @author 本当迷
 * @Description
 * @date 2022/5/26-13:06
 */

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 2.ArrayList的源码分析：
 *   2.1 jdk 7情况下
 *      ArrayList list = new ArrayList();//底层创建了长度是10的Object[]数组elementData
 *      list.add(123);//elementData[0] = new Integer(123);
 *      ...
 *      list.add(11);//如果此次的添加导致底层elementData数组容量不够，则扩容。
 *      默认情况下，扩容为原来的容量的1.5倍，同时需要将原有数组中的数据复制到新的数组中。
 *
 *      结论：建议开发中使用带参的构造器：ArrayList list = new ArrayList(int capacity)
 *
 *   2.2 jdk 8中ArrayList的变化：
 *      ArrayList list = new ArrayList();//底层Object[] elementData初始化为{}.并没有创建长度为10的数组
 *
 *      list.add(123);//第一次调用add()时，底层才创建了长度10的数组，并将数据123添加到elementData[0]
 *      ...
 *      后续的添加和扩容操作与jdk 7 无异。
 *   2.3 小结：jdk7中的ArrayList的对象的创建类似于单例的饿汉式，而jdk8中的ArrayList的对象
 *            的创建类似于单例的懒汉式，延迟了数组的创建，节省内存。
 *
 */

public class ArrayListTest {
    public static void main(String[] args) {
        final ArrayList<Object> list = new ArrayList<>();
        // 插入普通数据类型和自定义类
        list.add(11);
        list.add(22);
        list.add("11");
        list.add("22");
        list.add(new Person(18, "本当迷"));
        list.add(new Person(20, "帅帅的本当迷"));
        System.out.println(list);

        final ArrayList<Object> list1 = new ArrayList<>();
        list1.add(33);
        // 插入集合
        list.add(list1);
        System.out.println(list);

        // 删除自定义类
        list.remove(new Person(18, "本当迷"));
        System.out.println(list);
        // 删除指定下标位置
        list.remove(0);
        System.out.println(list);

        // 改变指定下标位置元素
        list.set(0, 11);
        System.out.println(list);

        // 获取指定下标位置元素
        System.out.println(list.get(3));

        // 指定位置插入元素
        list.add(0, "00");
        System.out.println(list);

        // 获取ArrayList集合长度
        System.out.println(list.size());

        // 遍历ArrayList三种方法
        System.out.println("第一种");
        // 普通循环
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
        System.out.println("\n第二种方法");
        // 增强for循环
        for(Object object : list){
            System.out.print(object + " ");
        }
        System.out.println("\n第三种方法");
        // Iterator迭代器方式
        Iterator<Object> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        // 获取集合一段元素 (左闭右开)
        System.out.println("\n" + list.subList(0, 4));





    }
}
