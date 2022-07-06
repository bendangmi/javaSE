import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-21:17
 */
public class URLTest1 {
    public static void main(String[] args) throws IOException {
        final URL url = new URL("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Finews.gtimg.com%2Fnewsapp_match%2F0%2F11156556256%2F0.jpg&refer=http%3A%2F%2Finews.gtimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg");

        final URLConnection urlConnection = url.openConnection();

        urlConnection.connect();
        final InputStream inputStream = urlConnection.getInputStream();
        final FileOutputStream outputStream = new FileOutputStream("demo19/a.png");

        byte[] bytes = new byte[1024];
        int len;
        while((len = inputStream.read(bytes)) != -1){
            outputStream.write(bytes, 0, len);
        }
        System.out.println("下载完成");

        inputStream.close();
        outputStream.close();


    }
}
