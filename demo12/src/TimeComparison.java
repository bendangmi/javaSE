/**
 * @author 本当迷
 * @Description 比较 String 、StringBuilder、StringBuffer效率
 * @date 2022/5/25-18:22
 */
public class TimeComparison {
    public static void main(String[] args) {
        long startTime = 0L, endTime = 0L;

        String s1 = "";
        startTime = System.currentTimeMillis(); // 计时开始
        for (int i = 0; i < 100000; i++) {
            s1 += String.valueOf(i);
        }
        endTime = System.currentTimeMillis();// 计时结束
        System.out.println("String所费时间：" + (endTime - startTime));

        StringBuffer buffer = new StringBuffer();
        startTime = System.currentTimeMillis();// 开始计时
        for (int i = 0; i < 100000; i++) {
            buffer.append(i);
        }
        endTime = System.currentTimeMillis();// 计时结束
        System.out.println("StringBuffer所费时间：" + (endTime - startTime));

        StringBuilder builder = new StringBuilder();
        startTime = System.currentTimeMillis();// 开始计时
        for (int i = 0; i < 100000; i++) {
            builder.append(i);
        }
        endTime = System.currentTimeMillis();// 计时结束
        System.out.println("StringBuilder所费时间：" + (endTime - startTime));

    }
}
