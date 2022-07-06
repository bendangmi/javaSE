import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/4-8:40
 */
public class 数组引用 {
    public static void main(String[] args) {
        Function<Integer, String[]> function = length -> new String[length];
        final String[] apply = function.apply(10);
        System.out.println(Arrays.toString(apply));
        System.out.println("*************************");


        Function<Integer, String[]> function1 = String[]:: new;
        final String[] apply1 = function1.apply(5);
        System.out.println(Arrays.toString(apply1));

    }
}
