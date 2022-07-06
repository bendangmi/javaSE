import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/1-15:59
 */
public class TreeSetTest {
    public static void main(String[] args) {
         // 定制排序
        Comparator com  = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person u1 = (Person)o1;
                    Person u2 = (Person)o2;
                    final int compare = u1.getName().compareTo(u2.getName());
                    if(compare != 0) return compare;
                    else return Integer.compare(u1.getAge(), u2.getAge());
                }else{
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };
        final TreeSet<Object> treeSet = new TreeSet<>(com);
        treeSet.add(new Person(10, "本当迷"));
        treeSet.add(new Person(11, "本当迷"));
        treeSet.add(new Person(20, "帅帅的本当迷"));
        treeSet.add(new Person(21, "帅帅的本当迷"));
        treeSet.add(new Person(20, "本当迷"));
        treeSet.add(new Person(12, "大聪明"));

        for (Object o:
             treeSet) {
            System.out.println(o + " ");
        }

    }
}
