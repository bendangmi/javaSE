import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-16:47
 */
public class TCP服务端Test {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            ss = new ServerSocket(9090);
            socket = ss.accept();
            is = socket.getInputStream();
            fos = new FileOutputStream(new File("demo19/copy1.png"));
            int len;
            byte[] bytes = new byte[1024];
            while((len = is.read(bytes)) != -1){
                fos.write(bytes, 0, len);
            }

            os = socket.getOutputStream();
            os.write("图片已经收到!".getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

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
