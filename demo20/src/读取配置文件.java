import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-8:36
 */
public class 读取配置文件 {
    public static void main(String[] args) throws Exception{
        final Properties properties = new Properties();

        // 方式一 此时的文件默认在当前的module下
        final FileInputStream inputStream = new FileInputStream("jdbc.properties");
        properties.load(inputStream);

        // 方式二 配置文件默认识别为：当前module的src下
        final ClassLoader classLoader = 读取配置文件.class.getClassLoader();
        final InputStream resource = classLoader.getResourceAsStream("jdbc.properties");
        properties.load(resource);

        String user = properties.getProperty("user");
        String passWorld = properties.getProperty("passWorld");
        System.out.println("user = " + user + "，passWorld" + passWorld);
    }
}
