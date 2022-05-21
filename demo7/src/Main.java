/**
 * @author 本当迷
 * @Description 单例模式 ： 饿汉式、懒汉式
 * @date 2022/5/21-13:08
 */
public class Main {
    public static void main(String[] args) {
        HungryHanStyle hungryHanStyle = HungryHanStyle.create();
        HungryHanStyle hungryHanStyle1 = HungryHanStyle.create();
        System.out.println("饿汉式");
        if(hungryHanStyle1.equals(hungryHanStyle)){
            System.out.println("两实例对象为：同一对象");
        }else{
            System.out.println("两实例对象为：不同对象");
        }

        System.out.println("懒汉式");
        LazyStyle lazyStyle = LazyStyle.create();
        LazyStyle lazyStyle1 = LazyStyle.create();
        if(lazyStyle1.equals(lazyStyle)){
            System.out.println("两实例对象为：同一对象");
        }else{
        System.out.println("两实例对象为：不同对象");

        }

    }
}
