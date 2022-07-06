package OptionnalTest;

import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/4-16:27
 */

/**
 * Optional类：为了在程序中避免出现空指针异常而创建的。
 *
 * 常用的方法：ofNullable(T t)
 *           orElse(T t)
 */
public class OptionalTest {
    /**
     * Optional.of(T t) : 创建一个 Optional 实例，t必须非空；
     * Optional.empty() : 创建一个空的 Optional 实例
     * Optional.ofNullable(T t)：t可以为null
     */

    @Test
    public void test(){
        Girl girl = new Girl();
        girl = null;

        // Optional.of(T t):保证t非空
        final Optional<Girl> girl1 = Optional.of(girl);

    }

    @Test
    public void test1(){
        final Girl girl = new Girl();

        // Optional.ofNullable(T t)：t可以为null
        final Optional<Girl> girl1 = Optional.ofNullable(girl);
        System.out.println(girl1);

        // orElse(T t1)：如果Optional内部封装的t为非空，则返回内部的t
        // 如果为空，则返回orElse()方法中的参数t1
        final Girl girl2 = girl1.orElse(new Girl("小宝"));
        System.out.println(girl2);
    }

    public String getGirlName(Boy boy){
        final Optional<Boy> boy1 = Optional.ofNullable(boy);

        // 此时boy1一定为null
        final Boy boy2 = boy1.orElse(new Boy(new Girl("小美")));
        final Girl girl = boy2.getGirl();

        // 此时girl一定为空
        final Optional<Girl> girl1 = Optional.ofNullable(girl);
        final Girl girl2 = girl1.orElse(new Girl("小红"));

        return girl2.getName();
    }

    @Test
    public void test2(){
        Boy boy = null;
        Boy boy1 = new Boy();
        Boy boy2 = new Boy(new Girl("小丽"));
        System.out.println(getGirlName(boy));
        System.out.println(getGirlName(boy1));
        System.out.println(getGirlName(boy2));


    }
}
