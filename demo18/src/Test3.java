import java.io.File;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-9:53
 */
public class Test3 {
    public static void main(String[] args) {
        final File file = new File("demo18/tmp");
        isEmpty(file);

    }

    public static void isEmpty(File file1){
        final String[] files = file1.list();
        assert files != null;
        for (String s1 :
                files) {
            final File file = new File(file1, s1);
            if (file.isDirectory()) {
                    isEmpty(file);
                }else{
                    System.out.println(s1);
                }
            }

    }
}
