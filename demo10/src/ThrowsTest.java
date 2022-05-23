import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 本当迷
 * @Description 处理异常方式二 throws + 异常类型
 * @date 2022/5/23-12:41
 */
public class ThrowsTest {
    public static void main(String[] args) {
        try {
            print();
        } catch (IOException e) {
            throw new RuntimeException("指定文件不存在"); // 手动抛出异常
        }

    }
    public static void print() throws IOException {
        File file = new File("demo10/src/hello.txt");
        FileInputStream fls = new FileInputStream(file);

        int data = fls.read();
        while(data != -1){
            System.out.println((char)data);
            data = fls.read();
        }
        fls.close();
        System.out.println("读取结束");
    }

}
