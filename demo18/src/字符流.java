import java.io.*;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-10:47
 */
public class 字符流 {
    public static void main(String[] args) {
        // 读取数据
        FileReader reader = null;
        try  {
            final File file = new File("demo18/hello.txt");
            reader = new FileReader(file);
            int data;
            while((data = reader.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // 写入数据
        FileWriter writer = null;
        try {
            writer = new FileWriter(new File("demo18/temp.txt"), false);
            writer.write("我爱JAVA!!!");
            writer.write("\n本当迷博客：https://www.bdmcon.cn");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
