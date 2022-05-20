/**
 * @author 本当迷
 * @Description
 * @date 2022/5/20-12:28
 */
public class Dog extends Animal{
    @Override
    public void move() {
        System.out.println("狗走路！！！");
    }

    public void beAfraid(){
        System.out.println("狗害怕猫！");
    }
}
