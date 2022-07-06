import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Vector;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/1-16:12
 */

/*Vector 是一个古老的集合，JDK1.0就有了。大多数操作与ArrayList相同，区别之处在于Vector是线程安全的。
        在各种list中，最好把ArrayList作为缺省选择。当插入、删除频繁时，使用LinkedList；Vector总是比ArrayList慢，所以尽量避免使用。*/

public class VectorTest {
    public static void main(String[] args) {
        Collection<Integer> coll = new Vector<>();

         // 添加元素到集合
        coll.add(11); // 自动装箱
        coll.add(22);
        coll.add(33);
        coll.add(33);
        System.out.println(coll);

        // 返回vector中的元素个数
        System.out.println(coll.size());

        // 清空集合元素
        coll.clear();
        System.out.println(coll.size());

        // 判断当前集合是否为空 ，空为true,反之为false
        System.out.println(coll.isEmpty());

        // 增加对象元素
        Vector<Person> people = new Vector<>();
        people.add(new Person(10, new String("帅帅的本当迷")));
        people.add(new Person(12, new String("大聪明本当迷")));
        System.out.println(people);

        // 删除对象元素
        people.remove(new Person(12, new String("大聪明本当迷")));
        System.out.println(people);
        Person c2 = new Person(12, new String("大聪明本当迷"));
        people.add(c2);
        Person c1 = new Person(12, new String("大聪明本当迷"));
        System.out.println(c1.equals(c2));

        // 判断集合中是否包含对象
        System.out.println(people.contains(c1));

        // 遍历结合的三种方法
        final Iterator<Person> iterator = people.iterator();
        System.out.println("第一种");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("第二种");
        for(Person p : people){
            System.out.println(p);
        }
        System.out.println("第三种");
        for(int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }


    }


}

