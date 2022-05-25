import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 本当迷
 * @Description Comparator 定制排序，适用于临时性比较
 * @date 2022/5/25-19:51
 */
public class ComparatorTest {
    public static void main(String[] args) {
        People[] p1 = new People[10];
        for(int i = 0; i < 10; i++){
            char t = (char) ('a' + i);
            p1[i] = new People(new StringBuilder(String.valueOf(t)), (int) (Math.random()*20 + (50-20+1)));
        }
        Arrays.sort(p1, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof People && o2 instanceof People){
                    People p1 = (People) o1;
                    People p2 = (People) o2;
                    return compare(p1.getName(), p2.getName());
                }
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
        System.out.println(Arrays.toString(p1));
    }
}

