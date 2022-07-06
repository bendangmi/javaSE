import java.io.File;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-9:52
 */
public class Test2 {
    public static void main(String[] args) {
        final File file = new File("demo18/tmp");
        final String[] list = file.list();
        assert list != null;
        for (String s1 :
                list) {
            if(s1.endsWith(".jpg")) System.out.println(s1);
        }
    }
}
