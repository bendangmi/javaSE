import java.util.Vector;

/**
 * @author 本当迷
 * @Description vector的基本使用
 * @date 2022/5/21-11:22
 */
public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, i + 1);
            System.out.print(arr.get(i) + " ");
        }

    }

}
