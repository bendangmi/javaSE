/**
 * @author 本当迷
 * @Description 接口的基本使用
 * @date 2022/5/21-16:43
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Mp3 mp3 = new Mp3();
        Printer printer = new Printer();
        computer.dataConversion(mp3);
        computer.dataConversion(printer);
        computer.dataConversion(new USB() {
            @Override
            public void start() {
                System.out.println("电视开始播放");
            }

            @Override
            public void end() {
                System.out.println("电视结束播放");
            }
        });
    }
}
