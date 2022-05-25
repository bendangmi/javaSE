/**
 * @author 本当迷
 * @Description
 * @date 2022/5/25-17:26
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();


        // 增
        buffer.append("abcd");

        // 删
        buffer.delete(0, 2);
        System.out.println(buffer);

        // 改
        buffer.setCharAt(0, 'p');
        System.out.println(buffer);

        // 查
        System.out.println(buffer.charAt(0));

        // 插
        buffer.insert(0, 'y');
        System.out.println(buffer);
    }
}
