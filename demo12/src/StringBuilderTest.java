/**
 * @author 本当迷
 * @Description
 * @date 2022/5/25-17:26
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        // 增
        builder.append("aabbccdd");
        System.out.println(builder);

        // 删 左闭右开
        builder.delete(2, 4);
        System.out.println(builder);

        // 改
        builder.setCharAt(0, 't');
        System.out.println(builder);

        // 查
        char c = builder.charAt(0);
        System.out.println(c);

        // 插
        builder.insert(0, 'g');
        System.out.println(builder);


    }
}
