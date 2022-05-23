import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 本当迷
 * @Description 处理异常方式一：try-catch-finally
 * @date 2022/5/23-12:40
 */
public class TryCatchFinally {
    public static void main(String[] args) {
        tryCatch();
        print(0);
    }
    public static void tryCatch() {
        FileInputStream fis = null;
        try {
            File file = new File("demo10/src/hello.txt"); // 文件可能不存在，出现异常
            fis = new FileInputStream(file);
            int data = fis.read();
            while(data != -1){
                System.out.println((char)data);
                data = fis.read();
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("找不到指定文件");
        }


    }

    public static void print(int c){
        int a = 10, b = 0;
        try {
            System.out.println(a / c);
        } catch (Exception e) {
            System.out.println("C不能为0, 请继续输入");
            print(new Scanner(System.in).nextInt());
           return;
        }
        System.out.println("虽然报错但是继续执行程序");
    }


}
