import java.util.LinkedList;

/**
 * @author 本当迷
 * @Description
 * @date 2022/5/26-13:06
 */

// 对于频繁的增删效率较高
public class LinkedListTest {
    public static void main(String[] args) {
        final LinkedList<Object> list = new LinkedList<>();
        // 增
        for(int i = 0; i < 10; i++){
            list.add(i + 1);
        }

        // 删
        list.remove(new Integer(9));
        System.out.println(list);

        // 改
        list.set(0, 0);
        System.out.println(list);

        // 查
        for(int i = 0; i < 9; i ++){
            final Object o = list.get(i);
            System.out.print(o + " ");
        }

    }

}
