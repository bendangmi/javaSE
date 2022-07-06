/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-9:04
 */

import java.io.File;
import java.io.IOException;

/**
 * 创建硬盘中对应的文件或文件目录
 * public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
 * public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
 * public boolean mkdirs() ：创建文件目录。如果此文件目录存在，就不创建了。如果上层文件目录不存在，一并创建
 *
 *     删除磁盘中的文件或文件目录
 * public boolean delete()：删除文件或者文件夹
 *     删除注意事项：Java中的删除不走回收站。
 */

public class File类的常用方法2 {
    public static void main(String[] args) throws IOException {
        final File file = new File("demo18/hello1.txt");
        // 当文件不存在时，创建成功；当文件存在时，创建失败！
        final boolean newFile = file.createNewFile();
        if(newFile) System.out.println("文件创建成功！");
        else System.out.println("文件创建失败");

        // 当目录不存在时，创建成功；当目录存在时，创建失败！
        final File file1 = new File("demo18/tmp");
        final boolean mkdirs = file1.mkdirs();
        if(mkdirs) System.out.println("目录创建成功！");
        else System.out.println("目录创建失败");
    }
}
