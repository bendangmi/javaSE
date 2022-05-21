/**
 * @author 本当迷
 * @Description 实现一个抽象子类
 * @date 2022/5/21-15:29
 */
public class Girl extends People {
    @Override
    public void eat() {
        System.out.println("女生喜欢吃水果");

    }

    @Override
    public void likePlay() {
        System.out.println("女生喜欢看书");
    }
}
