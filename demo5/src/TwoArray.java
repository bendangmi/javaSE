/**
 * @author 本当迷
 * @Description 二维数组练习：输出杨辉三角
 * @date 2022/5/20-16:30
 */
public class TwoArray {
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        int[][] arr = new int[100][100];
        arr[0][0] = 1;
        for (int i = 1; i < 10; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

    }
}
