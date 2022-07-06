import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-21:13
 */
public class URLTest {
    public static void main(String[] args) throws MalformedURLException {
        final URL url = new URL("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Finews.gtimg.com%2Fnewsapp_match%2F0%2F11156556256%2F0.jpg&refer=http%3A%2F%2Finews.gtimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg");

        // 获取该URL的协议名
        System.out.println(url.getProtocol());

        // 获取该URL的主机名
        System.out.println(url.getHost());

        // 获取该URL的端口号
        System.out.println(url.getPort());

        // 获取URL的文件路径
        System.out.println(url.getPath());

        // 获取URL的文件名
        System.out.println(url.getFile());

        // 获取URL的查询名
        System.out.println(url.getQuery());
    }
}
