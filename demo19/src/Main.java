import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-14:01
 */
public class Main {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress.getHostAddress());
    }
}
