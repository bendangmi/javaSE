import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-15:51
 */
public class 服务端 {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            //1.创建服务器端的ServerSocket，指明自己的端口号
            ss = new ServerSocket(8899);

            //2.调用accept()表示接收来自于客户端的socket
            socket = ss.accept();

            //3.获取输入流
            is = socket.getInputStream();

            //4、读取输入流中的数据
            baos = new ByteArrayOutputStream();
            final byte[] bytes = new byte[1024];
            int len;

            //不建议这样写，可能会有乱码
//        byte[] buffer = new byte[1024];
//        int len;
//        while((len = is.read(buffer)) != -1){
//            String str = new String(buffer,0,len);
//            System.out.print(str);
//        }

            while((len = is.read(bytes)) != -1){
                baos.write(bytes, 0, len);
            }
            System.out.println(baos.toString());

            System.out.println("收到了来自：" + socket.getInetAddress().getHostName() + "的数据！");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(socket != null){
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
