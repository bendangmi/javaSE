/**
 * @author 本当迷
 * @Description
 * @date 2022/5/20-12:28
 */
public class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫走路");
    }

    public void eat() {
        System.out.println("猫喜欢吃鱼！");
    }
}
