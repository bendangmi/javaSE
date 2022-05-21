/**
 * @author 本当迷
 * @Description 实现一个抽象子类
 * @date 2022/5/21-15:29
 */
public class Boy extends People {
    @Override
    public void eat() {
        System.out.println("男生喜欢吃零食");
    }

    @Override
    public void likePlay() {
        System.out.println("男子喜欢打篮球");
    }
}
