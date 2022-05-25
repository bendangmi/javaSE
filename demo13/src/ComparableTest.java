import java.util.Arrays;
import java.util.Objects;

/**
 * @author 本当迷
 * @Description Comparable 自然排序，适用于长时间的比较，
 *              Comparable接口的方式一旦一定，保证Comparable接口实现类的对象在任何位置都可以比较大小
 * @date 2022/5/25-19:19
 */
public class ComparableTest {
    public static void main(String[] args) {
        People[] p1 = new People[10];
        for(int i = 0; i < 10; i++){
            char t = (char) ('a' + i);
            p1[i] = new People(new StringBuilder(String.valueOf(t)), (int) (Math.random()*20 + (50-20+1)));
        }
        Arrays.sort(p1);
        System.out.println(Arrays.toString(p1));
    }
}

