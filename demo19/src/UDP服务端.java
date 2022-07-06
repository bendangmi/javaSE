import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-20:47
 */
public class UDP服务端 {
    public static void main(String[] args) throws IOException {
        final DatagramSocket socket = new DatagramSocket(9090);
        byte[] bytes = new byte[1024];
        final DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length);

        socket.receive(packet);
        System.out.println(new String(packet.getData(), 0, packet.getLength()));
        socket.close();

    }
}
