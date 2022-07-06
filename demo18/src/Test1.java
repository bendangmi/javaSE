import java.io.File;
import java.io.IOException;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-9:36
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        final File file = new File("demo18/tmp");
        createTxtFile(file);
        createFolder(file);
    }

    public static void createTxtFile(File file) throws IOException {
        for(int i = 0 ; i < 10; i++){
            final File file1 = new File(file, Integer.toString(i) + ".jpg");
            final boolean newFile = file1.createNewFile();

        }
    }

    public static void createFolder(File file) throws IOException {
        for(int i = 0 ; i < 10; i++){
            final File file1 = new File(file, "1" + Integer.toString(i) );
            final boolean mkdirs = file1.mkdirs();
            createTxtFile(file1);

        }
    }
}
