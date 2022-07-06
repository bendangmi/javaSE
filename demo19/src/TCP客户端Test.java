import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-16:47
 */

/**
 * 实现TCP的网络编程
 * 例题3：从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。
 * 并关闭相应的连接。
 *
 */
public class TCP客户端Test {
    public static void main(String[] args) {
        FileInputStream fis = null;
        OutputStream os = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
            fis = new FileInputStream(new File("demo19/copy.png"));
            os = socket.getOutputStream();
            int len;
            byte[] bytes = new byte[1204];
            while ((len = fis.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            //关闭数据的输出
            socket.shutdownOutput();

            //5.接收来自于服务器端的数据，并显示到控制台上
            baos = new ByteArrayOutputStream();
            is = socket.getInputStream();
            while((len = is.read(bytes)) != -1){
                baos.write(bytes, 0, len);
            }
            System.out.println(baos);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(baos != null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
