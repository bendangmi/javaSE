import java.util.Arrays;

/**
 * @author 本当迷
 * @Description
 * @date 2022/5/25-17:26
 */
public class StringTest {
    public static void main(String[] args) {

        // 字符串转数字
        String s1 = "123";
        int a = Integer.parseInt(s1);
        System.out.println(a + 1);

        // 数字转字符串
        int b = 999;
        String s2 = String.valueOf(b);
        System.out.println(s2 + 1);

        // 字符串转char数组
        String s3 = "abcd";
        char[] c = s3.toCharArray();
        for (char value : c) {
            System.out.print(value + " ");
        }
        System.out.println();

        // char数组转String
        char[] d = new char[]{'a', 'c', 'd'};
        String s4 = new String(d);
        System.out.println(s4);

        // 判断字符串是否相等
        String t = "";
        String t1 = null;
        // equalsIgnoreCase可以忽略字符串大小写，进行比较字符串是否相等
        if (t.equals(t1)) {
            System.out.println("字符串相等");
        } else {
            System.out.println("字符串不相等");
        }

        // 返回字串 substring左闭右开
        String t3 = "abcdefg";
        s4 = t3.substring(1, 3);
        System.out.println(s4);

        // 将字符串全部转换为大写
        String s5 = "abcd";
        String s6 = s5.toUpperCase();
        System.out.println(s6);

        // 将字符串全部转换为小写
        String s7 = "ABCD";
        String s8 = s7.toLowerCase();
        System.out.println(s8);

        // 替换字符串
        String s9 = "bbbb";
        String s10 = s9.replace("bb", "a");
        System.out.println(s10);

        // 去除字符串两端空格
        String s11 = "  11  ";
//        String s12 = s11.trim();
        String s12 = TrimTest(s11);
        System.out.println(s12);

        // 反转字符
        String s13 = "abcdfe";
        System.out.println(reverseString(s13, 4, 5));

        // 对字符串进行排序
        String s14 = "nafknadkf";
        char[] n = s14.toCharArray();
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));

    }
    // 模拟实现trim
    public static String TrimTest(String s) {
        char[] arr = s.toCharArray();
        int start = 0, end = 0;
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            if(arr[i] != ' ' && start == 0){
                start = i;
            }
            if(arr[j] != ' ' && end == 0){
                end = j;
            }
        }

        return s.substring(start, end + 1);
    }

    // 反转字符串中任意范围字符
    public static String reverseString(String s, int start, int end){
        char[] arr = s.toCharArray();
        for(int i = start, j = end; i <= j; i++, j--){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return new String(arr);
    }
}
