import java.io.*;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-11:17
 */

// 使用FileReader和 FileWriter实现文本文化的复制
public class Test4 {
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr = null;

        try {
            fr = new FileReader(new File("demo18/temp.txt"));
            int data;
            StringBuilder s1 = new StringBuilder();
            while((data = fr.read() ) != -1){
                s1.append((char) data);
            }
            System.out.println(s1);
            fw = new FileWriter("demo18/temp1");
            fw.write(s1.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
