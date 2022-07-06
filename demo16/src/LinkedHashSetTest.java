import java.util.LinkedHashSet;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/1-15:58
 */

// 能按照插入顺序输出，数据元素不能重复
public class LinkedHashSetTest {
    public static void main(String[] args) {
        final LinkedHashSet<Object> hashSet = new LinkedHashSet<>();
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(2);
        System.out.println(hashSet);
    }
}
