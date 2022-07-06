/**
 * @author 本当迷
 * @Description
 * @date 2022/7/2-8:45
 */

import java.io.File;
import java.util.Objects;

/**
 * public String getAbsolutePath()：获取绝对路径
 * public String getPath() ：获取路径
 * public String getName() ：获取名称
 * public String getParent()：获取上层文件目录路径。若无，返回null
 * public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
 * public long lastModified() ：获取最后一次的修改时间，毫秒值
 *
 * 如下的两个方法适用于文件目录：
 * public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
 * public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组
 */

public class File类的常用方法1 {
    public static void main(String[] args) {
        final File file = new File("demo18/hello.txt");
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("相对路径：" + file.getPath());
        System.out.println("文件名：" + file.getName());
        System.out.println("上一级目录名称：" + file.getParent());
        System.out.println("文件大小：" + file.length());

        // 获取指定目录下的所有文件或者文件目录的名称数组
        final File file1 = new File("C:/Users/14740/IdeaProjects/javaStart");
        final String[] list = file1.list();
        assert list != null;
        if(list.length != 0){
            for (String s1:
                    list) {
                System.out.print(s1 + " ");
            }
            System.out.println();
        }

        //输出指定目录下的文件地址
        for (File listFile : Objects.requireNonNull(file1.listFiles())) {
            System.out.print(listFile + " ");
        }
        System.out.println();
        // 文件重命名
        final boolean rename = file.renameTo(new File("demo18/hello.txt"));
        if(rename) System.out.println("重命名成功");


    }

}
