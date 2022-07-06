import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-15:51
 */
public class 客户端 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;

        try{
            // 1、创建Socket对象，指明服务器端的ip和端口号
            final InetAddress inetAddress = InetAddress.getByName(InetAddress.getLocalHost().getHostAddress());
            socket = new Socket(inetAddress, 8899);

            // 2、获取一个输出流，用于输出数据, 输出到服务端
            os = socket.getOutputStream();

            // 3、写出数据的操作
            os.write("你好，我是客户端！".getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
                if(socket != null){
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if(os != null){
                    try {
                        os.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        }

    }
}
