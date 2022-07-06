/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-16:11
 */

/**
 * 静态代理举例
 *
 * 特点：代理类和被代理类在编译期间，就确定下来了。
 */
interface ClothFactory{
    void produceCloth();
}

// 代理类
class PersonTest implements ClothFactory{
    private final ClothFactory factory; // 用被代理类进行实例化

    public PersonTest(ClothFactory clothFactory){
        this.factory = clothFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println("电脑开始准备工作！");
        factory.produceCloth();
        System.out.println("电脑结束工作！");
    }
}

// 被代理类
class NeckTest implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("正在植入病毒！");
    }
}


public class 静态代理工厂 {
    public static void main(String[] args) {
        final NeckTest neckTest = new NeckTest();
        final PersonTest personTest = new PersonTest(neckTest);
        personTest.produceCloth();
    }
}
