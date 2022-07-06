import java.io.*;
import java.nio.file.Files;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-12:54
 */
public class 缓冲流字节型 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //说明：关闭外层流的同时，内层流也会自动的进行关闭。关于内层流的关闭，我们可以省略.
            bis = new BufferedInputStream(Files.newInputStream(new File("demo18/img.png").toPath()));
            bos = new BufferedOutputStream(Files.newOutputStream(new File("demo18/copy1.png").toPath()));

            // 复制过程
            int len;
            final byte[] bytes = new byte[1024];
            while((len = bis.read(bytes)) != -1){
                bos.write(bytes, 0, len);
            }
            System.out.println("复制成功！");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
