import java.io.*;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-13:14
 */
public class 缓存流字符型 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(new File("demo18/hello.txt")));
            bw = new BufferedWriter(new FileWriter(new File("demo18/hello1.txt")));

            int data;
            StringBuilder txt = new StringBuilder();
            while((data = br.read()) != -1){
                txt.append((char) data);
            }

            bw.write(String.valueOf(txt));
            System.out.println("复制成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
