import java.io.IOException;
import java.net.*;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-20:47
 */
public class UDP客户端 {
    public static void main(String[] args) throws IOException {
        final DatagramSocket socket = new DatagramSocket();

        String str = "我是UDP客户端";
        byte[] bytes = str.getBytes();
        final InetAddress localHost = InetAddress.getLocalHost();
        final DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, localHost, 9090);

        socket.send(packet);
        socket.close();


    }
}
