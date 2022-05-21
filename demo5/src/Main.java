import java.util.Arrays;



/**
 * @author 本当迷
 * @Description 数组的一些算法操作：冒泡排序、选择排序
 * @date 2022/5/20-15:45
 */
public class Main {
    public static void main(String[] args) {
        Sort bubbleSort = new Sort();
        bubbleSort.initArray();

        // 利用冒泡排序
//        bubbleSort.bubbleSort();

        //利用选择排序
        bubbleSort.selectionSort();
    }
}

// 数组排序
class Sort {
    private int[] arr = new int[20];

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void initArray() {
        for (int i = 0; i < arr.length; i++) {
            int tmp = (int)(Math.random() * 100) + 1;
            arr[i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 冒泡排序
    public void bubbleSort() {
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j  < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println("排序后：");
        System.out.println(Arrays.toString(arr));
    }

    // 选择排序
    public void selectionSort() {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }
            }
        }
        System.out.println("排序后：");
        System.out.println(Arrays.toString(arr));
    }


}