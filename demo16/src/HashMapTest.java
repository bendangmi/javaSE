/**
 * @author 本当迷
 * @Description
 * @date 2022/7/1-22:01
 */

/**
 * 一、Map的实现类的结构：
 *  |----Map:双列数据，存储key-value对的数据   ---类似于高中的函数：y = f(x)
 *         |----HashMap:作为Map的主要实现类；线程不安全的，效率高；存储null的key和value
 *              |----LinkedHashMap:保证在遍历map元素时，可以按照添加的顺序实现遍历。
 *                      原因：在原有的HashMap底层结构基础上，添加了一对指针，指向前一个和后一个元素。
 *                      对于频繁的遍历操作，此类执行效率高于HashMap。
 *         |----TreeMap:保证按照添加的key-value对进行排序，实现排序遍历。此时考虑key的自然排序或定制排序
 *                      底层使用红黑树
 *         |----Hashtable:作为古老的实现类；线程安全的，效率低；不能存储null的key和value
 *              |----Properties:常用来处理配置文件。key和value都是String类型
 *
 *
 *      HashMap的底层：数组+链表  （jdk7及之前）
 *                    数组+链表+红黑树 （jdk 8）
 *
 *  面试题：
 *  1. HashMap的底层实现原理？
 *  2. HashMap 和 Hashtable的异同？
 *  3. CurrentHashMap 与 Hashtable的异同？（暂时不讲）
 *
 */

import java.util.*;

/**
 *  二、Map结构的理解：
 *    Map中的key:无序的、不可重复的，使用Set存储所有的key  ---> key所在的类要重写equals()和hashCode() （以HashMap为例）
 *    Map中的value:无序的、可重复的，使用Collection存储所有的value --->value所在的类要重写equals()
 *    一个键值对：key-value构成了一个Entry对象。
 *    Map中的entry:无序的、不可重复的，使用Set存储所有的entry
 *
 */


public class HashMapTest {
    public static void main(String[] args) {
        final HashMap<Object, Object> hashMap = new HashMap<>();
        // 增
        hashMap.put("11", 123);
        hashMap.put("22", 123);
        hashMap.put("33", 123);
        hashMap.put("44", 456);
        hashMap.put("00", 645);
        hashMap.put("77", 765);
        System.out.println(hashMap);

        // 删
        hashMap.remove("11");
        System.out.println(hashMap);

        // 改
        hashMap.put("22", 222);
        System.out.println(hashMap);

        // 查
        final boolean b = hashMap.containsKey("22");
        System.out.println(b);
        final boolean b1 = hashMap.containsValue("765");
        System.out.println(b1);

        // 获取指定key的value
        System.out.println(hashMap.get("22"));

        // 返回所有key构成的Set集合
        final Set<Object> keySet = hashMap.keySet();

        // 返回所有value构成的Collection集合
        final Collection<Object> values = hashMap.values();

        // 返回所有key-value对构成的Set集合
        final Set<Map.Entry<Object, Object>> entries = hashMap.entrySet();

        // 三种遍历HashMap的方式
        System.out.println("第一种");
        final Iterator<Object> iterator = keySet.iterator();
        while(iterator.hasNext()){
            final Object next = iterator.next();
            System.out.print(next + "=" + hashMap.get(next) + " || ");
        }
        System.out.println();
        System.out.println("第二种");
        for (Object object:
             keySet) {
            System.out.print(object + "=" + hashMap.get(object) + " || ");
        }
        System.out.println("\n第三种");

        for (Object ob:
             entries) {
            HashMap.Entry entry= (HashMap.Entry)ob;
            System.out.print(entry.getKey() + "=" + entry.getValue() + " || ");

        }



    }
}
