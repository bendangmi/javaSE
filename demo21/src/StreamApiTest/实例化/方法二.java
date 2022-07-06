package StreamApiTest.实例化;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author 本当迷
 * @Description 创建 Stream方式二：通过数组
 * @date 2022/7/4-10:02
 */
public class 方法二 {
    public static void main(String[] args) {
        final int[] arr = {1, 2, 3, 4};
        // 调用Arrays类的static <T> Stream(T [] array)：返回一个流
        final IntStream stream = Arrays.stream(arr);


    }
}
