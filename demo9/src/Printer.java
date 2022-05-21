/**
 * @author 本当迷
 * @Description
 * @date 2022/5/21-16:54
 */
public class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作！");
    }

    @Override
    public void end() {
        System.out.println("打印机结束工作！");
    }
}
