/**
 * @author 本当迷
 * @Description
 * @date 2022/5/21-18:31
 */
public class Mp3 implements USB{

    @Override
    public void start() {

        System.out.println("Mps开始读取数据！");
    }

    @Override
    public void end() {
        System.out.println("Mps读取数据结束！");
    }
}
