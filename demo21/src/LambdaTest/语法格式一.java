package LambdaTest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author 本当迷
 * @Description 语法格式一：无参，无返回值
 * @date 2022/7/3-22:07
 */
public class 语法格式一 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱JAVA！");
            }
        };
        runnable.run();

        System.out.println("***********************");
        Runnable runnable1 = () -> System.out.println("JAVA爱我！");
        runnable1.run();
    }
}
