import java.io.*;
import java.nio.file.Files;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-13:25
 */

// 分别使用节点流：FileInputStream、FileOutputStream和缓冲流：BufferedInputStream、BufferedOutputStream实现图片的复制。
// 并且比较二者在复制方面的效率
public class Test5 {
    public static void main(String[] args) {
        final File file1 = new File("C:\\Users\\14740\\Videos\\bandicam 2022-04-12 18-07-26-600.mp4");
        final File file2 = new File("demo18/test1.mp4");
        final File file3 = new File("demo18/test2.mp4");
        字节流(file1, file2);
        缓冲流(file1, file3);


    }

    public static void 字节流(File file1, File file2){
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            // 复制过程
            int len;
            final byte[] bytes = new byte[1024];
            while((len = fis.read(bytes)) != -1){
                fos.write(bytes, 0, len);
            }
            System.out.println("字节流复制成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }


        long endTime = System.currentTimeMillis();
        System.out.println("字节流花费：" + (endTime - startTime));
    }

    public static void 缓冲流(File file1, File file2){
        long startTime = System.currentTimeMillis();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try{
            bis = new BufferedInputStream(Files.newInputStream(file1.toPath()));
            bos = new BufferedOutputStream(Files.newOutputStream(file2.toPath()));

            // 复制过程
            int len;
            final byte[] bytes = new byte[1024];
            while((len = bis.read(bytes)) != -1){
                bos.write(bytes, 0, len);
            }
            System.out.println("缓冲流复制成功！");
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


        long endTime = System.currentTimeMillis();
        System.out.println("缓冲流花费：" + (endTime - startTime));
    }
}
