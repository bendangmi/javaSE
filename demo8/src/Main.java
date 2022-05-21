/**
 * @author 本当迷
 * @Description 抽象类与抽象方法的基本使用
 * @date 2022/5/21-15:00
 */
public class Main {
    public static void main(String[] args) {
        People boy = new Boy();
        People girl = new Girl();
        boy.eat();
        boy.likePlay();
        girl.eat();
        girl.likePlay();

    }
}
