import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.PrivateKey;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-16:20
 */

interface Moon{
    String getBelief();
    void showInfo(String Moon);
}
// 被代理类
class Venus implements Moon{

    @Override
    public String getBelief() {
        return "调用空参方法！";
    }

    @Override
    public void showInfo(String moon) {
        System.out.println("调用带参方法，参数为：" + moon);
    }
}

class DeskTest implements InvocationHandler{

    private Object object;

    public void bind(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // method:代理类对象调用的方法，此方法也就作为被代理类对象要调用的方法
        // obj:被代理类对象
        final Object returnValue = method.invoke(object, args);

        //上述方法的返回值就作为当前类中的invoke()的返回值。
        return returnValue;

    }
}

class BookTest{
    // obj被代理类对象
    public static Object getProxyInstance(Object obj){
        final DeskTest deskTest = new DeskTest();
        deskTest.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), deskTest);

    }
}

public class 动态代理工厂 {
    public static void main(String[] args) {
        final Venus venus = new Venus();
        final Moon proxyInstance = (Moon) BookTest.getProxyInstance(venus);
        final String belief = proxyInstance.getBelief();
        System.out.println(belief);

        proxyInstance.showInfo("我爱JAVA！");

        System.out.println("*********************");
        final NeckTest neckTest = new NeckTest();
        ClothFactory factory = (ClothFactory) BookTest.getProxyInstance(neckTest);
        factory.produceCloth();


    }
}
