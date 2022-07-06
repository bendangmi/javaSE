/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-12:35
 */

import java.io.*;

/**
 * 测试FileInputStream和FileOutputStream的使用
 *
 * 结论：
 *    1. 对于文本文件(.txt,.java,.c,.cpp)，使用字符流处理
 *    2. 对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc,.ppt,...)，使用字节流处理
 */

public class 字节流 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            final File file = new File("demo18/img.png");
            final File file1 = new File("demo18/copy.png");
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(file1);

            // 复制过程
            final byte[] bytes = new byte[1024];
            int len;
            while((len = inputStream.read(bytes)) != -1){
                outputStream.write(bytes, 0, len);
            }
            System.out.println("复制成功！");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
