/**
 * @author 本当迷
 * @Description 饿汉式
 * @date 2022/5/21-13:09
 */
public class HungryHanStyle {
    // 把构造器设为私有，这样外界就不能创建实例对象，只能通过类名.create方法创建实例对象，
    private HungryHanStyle(){
    }

    //内部我们自己创建一个自己的实例对象，并且设置成静态的
    private static final HungryHanStyle hung =  new HungryHanStyle();
    public static HungryHanStyle create(){
        //通过方法把实例对象传出去
        return hung;
    }
}
