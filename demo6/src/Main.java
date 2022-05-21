/**
 * @author 本当迷
 * @Description 基本数据类型的相互转换
 * @date 2022/5/21-9:40
 */

public class Main {
    public static void main(String[] args) {
        int res = 10;
        String res1 = "10";
        //整数类型 - 》 String类型
        System.out.println("String" + Integer.toString(res));

        //String类型 -》 整数类型
        System.out.println("整数类型" + (1 + Integer.parseInt(res1)));
    }
}
